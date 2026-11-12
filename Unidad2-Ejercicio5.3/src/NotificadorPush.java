public class NotificadorPush extends CanalNotificacion {

    @Override
    public void enviar(String destinatario, String mensaje) {
        System.out.println("Enviando notificación push al dispositivo: " + destinatario);
        System.out.println("Mensaje: " + mensaje);
    }
}