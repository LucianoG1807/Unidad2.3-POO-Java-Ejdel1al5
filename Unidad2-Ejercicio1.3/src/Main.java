import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<DispositivoAlmacenamiento> dispositivos = new ArrayList<>();

        dispositivos.add(new DiscoDuro(100, 150));
        dispositivos.add(new UnidadSSD(100, 500));
        dispositivos.add(new MemoriaUSB(50, 100));

        for (DispositivoAlmacenamiento dispositivo : dispositivos) {
            dispositivo.escribirDatos("Archivo de prueba");

            System.out.println("Datos leídos: " + dispositivo.leerDatos());
            System.out.println("----------------------------");
        }
    }
}