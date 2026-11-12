public class NotificadorEmail extends CanalNotificacion {

    @Override
    public void enviar(String destinatario, String mensaje) {
        System.out.println("Enviando email a: " + destinatario);
        System.out.println("Mensaje: " + mensaje);
    }
}