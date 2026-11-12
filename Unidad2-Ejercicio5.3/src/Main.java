public class Main {

    public static void main(String[] args) {

        GestorAlertas gestor = new GestorAlertas();

        CanalNotificacion email = new NotificadorEmail();
        CanalNotificacion sms = new NotificadorSMS();
        CanalNotificacion push = new NotificadorPush();

        gestor.agregarCanal(email);
        gestor.agregarCanal(sms);
        gestor.agregarCanal(push);

        String mensaje = "Alerta corporativa: mañana se realizará mantenimiento del sistema.";

        String[] destinatarios = {
                "usuario@empresa.com",
                "+5492611234567",
                "dispositivo-001"
        };

        System.out.println("=== DIFUSIÓN MASIVA ===");
        gestor.difundirMasivamente(destinatarios, mensaje);

        System.out.println("\n=== ENVÍO SELECTIVO ===");
        gestor.enviarSelectivamente(
                sms,
                "+5492617654321",
                "Recordatorio: reunión a las 10:00."
        );
    }
}