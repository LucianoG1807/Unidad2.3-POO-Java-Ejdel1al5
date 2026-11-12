public class ReportePDF extends GeneradorReporte {

    @Override
    public void exportar(String contenido) {
        System.out.println("=== REPORTE PDF ===");
        System.out.println("Generando documento PDF...");
        System.out.println(contenido);
        System.out.println("Archivo PDF exportado correctamente.");
    }
}