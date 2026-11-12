import java.util.ArrayList;

public class GestorAlertas {

    private ArrayList<CanalNotificacion> canales;

    public GestorAlertas() {
        canales = new ArrayList<>();
    }

    public void agregarCanal(CanalNotificacion canal) {
        canales.add(canal);
    }

    public void difundirMasivamente(String[] destinatarios, String mensaje) {
        for (int i = 0; i < canales.size(); i++) {
            canales.get(i).enviar(destinatarios[i], mensaje);
        }
    }

    public void enviarSelectivamente(CanalNotificacion canal, String destinatario, String mensaje) {
        canal.enviar(destinatario, mensaje);
    }
}