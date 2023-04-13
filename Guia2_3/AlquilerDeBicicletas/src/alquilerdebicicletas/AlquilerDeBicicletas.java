/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package alquilerdebicicletas;

// @author Horacio
 
public class AlquilerDeBicicletas {
    public static void main(String[] args) {
        // Declaración del tipo de documento HTML
        System.out.println("<!DOCTYPE html>");
        // Inicio del documento HTML
        System.out.println("<html>");
        // Encabezado del documento HTML
        System.out.println("<head>");
        // Título del documento HTML
        System.out.println("<title>Alquiler de bicicletas</title>");
        // Enlace a la hoja de estilos CSS del documento HTML
        System.out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\">");
        System.out.println("</head>");
        // Cuerpo del documento HTML
        System.out.println("<body>");
        // Encabezado del cuerpo del documento HTML
        System.out.println("<header>");
        // Título principal del documento HTML
        System.out.println("<h1>Alquiler de bicicletas</h1>");
        System.out.println("</header>");
        // Barra de navegación del documento HTML
        System.out.println("<nav>");
        // Lista de enlaces de navegación del documento HTML
        System.out.println("<ul>");
        System.out.println("<li><a href=\"#bicicletas\">Bicicletas</a></li>");
        System.out.println("<li><a href=\"#ubicacion\">Ubicación</a></li>");
        System.out.println("<li><a href=\"#reservas\">Reservas</a></li>");
        System.out.println("</ul>");
        System.out.println("</nav>");
        // Contenido principal del cuerpo del documento HTML
        System.out.println("<main>");
        // Filtro por modelo
        System.out.println("<select id=\"filtro-modelo\">");
        System.out.println("<option value=\"\">Todos los modelos</option>");
        System.out.println("<option value=\"Bicicleta de montaña\">Bicicleta de montaña</option>");
        System.out.println("<option value=\"Bicicleta de carretera\">Bicicleta de carretera</option>");
        System.out.println("<option value=\"Bicicleta de paseo\">Bicicleta de paseo</option>");
        System.out.println("</select>");
        // Filtro por precio
        System.out.println("<select id=\"filtro-precio\">");
        System.out.println("<option value=\"0\">Todos los precios</option>");
        System.out.println("<option value=\"5\">Hasta $5</option>");
        System.out.println("<option value=\"10\">Hasta $10</option>");
        System.out.println("<option value=\"15\">Hasta $15</option>");
        System.out.println("</select>");
        // Sección de bicicletas disponibles
        System.out.println("<section id=\"bicicletas\">");
        System.out.println("<h2>Bicicletas disponibles</h2>");
        System.out.println("<div id=\"bicicletas-contenedor\"></div>");
        System.out.println("</section>");
        // Sección de ubicación de la tienda
        System.out.println("<section id=\"ubicacion\">");
        System.out.println("<h2>Ubicación</h2>");
        System.out.println("<p>Nuestra tienda se encuentra en la calle 123, en la ciudad de XYZ.</p>");
        System.out.println("</section>");
        // Sección de reservas
        System.out.println("<section id=\"reservas\">");
        System.out.println("<h2>Reservas</h2>");
        System.out.println("<p>Para hacer una reserva, por favor llámenos al 555-555-5555 o envíenos un correo electrónico a info@bicyclerentals.com</p>");
        System.out.println("</section>");
        System.out.println("</main>");
        // Pie de página del documento HTML
        System.out.println("<footer>");
        System.out.println("<p>Derechos de autor © 2021 Bicycle Rentals</p>");
        System.out.println("</footer>");
        // Vínculo al archivo Javascript que contiene la funcionalidad del documento HTML
        System.out.println("<script src=\"main.js\"></script>");
        System.out.println("</body>");
        System.out.println("</html>");
    }
}