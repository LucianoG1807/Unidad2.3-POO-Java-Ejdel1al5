public class Main {

    public static void main(String[] args) {

        String datos = "Producto, Cantidad, Precio";

        SistemaGestion sistema = new SistemaGestion(new ReportePDF());
        sistema.generarReporte(datos);

        sistema.cambiarGenerador(new ReporteExcel());
        sistema.generarReporte(datos);

        sistema.cambiarGenerador(new ReporteHTML());
        sistema.generarReporte(datos);
    }
}