public class UnidadSSD extends DispositivoAlmacenamiento {

    private int capacidadMaxima;
    private int velocidadTransferencia;
    private String datos;

    public UnidadSSD(int capacidadMaxima, int velocidadTransferencia) {
        this.capacidadMaxima = capacidadMaxima;
        this.velocidadTransferencia = velocidadTransferencia;
        this.datos = "";
    }

    @Override
    public void escribirDatos(String datos) {
        if (datos.length() <= capacidadMaxima) {
            this.datos = datos;
            System.out.println("Datos escritos en la unidad SSD.");
        } else {
            System.out.println("Error: capacidad de la unidad SSD superada.");
        }
    }

    @Override
    public String leerDatos() {
        return datos;
    }
}