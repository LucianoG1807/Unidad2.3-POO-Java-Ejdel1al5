public class ReporteHTML extends GeneradorReporte {

    @Override
    public void exportar(String contenido) {
        System.out.println("=== REPORTE HTML ===");
        System.out.println("<html>");
        System.out.println("<body>");
        System.out.println("<p>" + contenido + "</p>");
        System.out.println("</body>");
        System.out.println("</html>");
        System.out.println("Archivo HTML exportado correctamente.");
    }
}