public class SistemaGestion {

    private GeneradorReporte generador;

    public SistemaGestion(GeneradorReporte generador) {
        this.generador = generador;
    }

    public void cambiarGenerador(GeneradorReporte generador) {
        this.generador = generador;
    }

    public void generarReporte(String contenido) {
        generador.exportar(contenido);
    }
}