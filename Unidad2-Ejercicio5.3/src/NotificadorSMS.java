public class NotificadorSMS extends CanalNotificacion {

    @Override
    public void enviar(String destinatario, String mensaje) {
        System.out.println("Enviando SMS al número: " + destinatario);
        System.out.println("Mensaje: " + mensaje);
    }
}