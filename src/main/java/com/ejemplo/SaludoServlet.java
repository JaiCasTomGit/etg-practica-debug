package main.java.com.ejemplo;

import java.io.IOException;
import java.time.LocalTime;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/saludo")
public class SaludoServlet extends HttpServlet {

    private final SaludoService service = new SaludoService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        // PUNTO DE RUPTURA 1: aquí empieza la magia
        String nombre = req.getParameter("nombre");
        if (nombre == null || nombre.isBlank()) {
            nombre = "Mundo";
        }

        int hora = LocalTime.now().getHour();

        // PUNTO DE RUPTURA 2: entramos en el servicio
        String saludo = service.generarSaludo(nombre, hora);

        req.setAttribute("saludo", saludo);
        req.setAttribute("hora", hora);

        // PUNTO DE RUPTURA 3: reenviamos a la JSP
        req.getRequestDispatcher("/resultado.jsp").forward(req, resp);
    }
}