public class ConexionMongoDB extends ConexionBD {

    @Override
    public void conectar() {
        if (!conectada) {
            conectada = true;
            System.out.println("Conectado a MongoDB.");
        } else {
            System.out.println("MongoDB ya está conectado.");
        }
    }

    @Override
    public void ejecutarConsulta(String sql) {
        if (conectada) {
            System.out.println("Ejecutando consulta en MongoDB: " + sql);
        } else {
            System.out.println("Error: MongoDB no está conectado.");
        }
    }

    @Override
    public void desconectar() {
        if (conectada) {
            conectada = false;
            System.out.println("Desconectado de MongoDB.");
        } else {
            System.out.println("MongoDB ya está desconectado.");
        }
    }
}