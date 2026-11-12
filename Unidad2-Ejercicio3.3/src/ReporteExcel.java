public class ReporteExcel extends GeneradorReporte {

    @Override
    public void exportar(String contenido) {
        System.out.println("=== REPORTE EXCEL ===");
        System.out.println("Generando hoja de cálculo...");
        System.out.println("| " + contenido.replace(",", " | ") + " |");
        System.out.println("Archivo Excel exportado correctamente.");
    }
}