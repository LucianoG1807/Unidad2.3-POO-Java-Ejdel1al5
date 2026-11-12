public class DiscoDuro extends DispositivoAlmacenamiento {

    private int capacidadMaxima;
    private int velocidadTransferencia;
    private String datos;

    public DiscoDuro(int capacidadMaxima, int velocidadTransferencia) {
        this.capacidadMaxima = capacidadMaxima;
        this.velocidadTransferencia = velocidadTransferencia;
        this.datos = "";
    }

    @Override
    public void escribirDatos(String datos) {
        if (datos.length() <= capacidadMaxima) {
            this.datos = datos;
            System.out.println("Datos escritos en el disco duro.");
        } else {
            System.out.println("Error: capacidad del disco duro superada.");
        }
    }

    @Override
    public String leerDatos() {
        return datos;
    }
}