public class ConexionMySQL extends ConexionBD {

    @Override
    public void conectar() {
        if (!conectada) {
            conectada = true;
            System.out.println("Conectado a MySQL.");
        } else {
            System.out.println("MySQL ya está conectado.");
        }
    }

    @Override
    public void ejecutarConsulta(String sql) {
        if (conectada) {
            System.out.println("Ejecutando consulta en MySQL: " + sql);
        } else {
            System.out.println("Error: MySQL no está conectado.");
        }
    }

    @Override
    public void desconectar() {
        if (conectada) {
            conectada = false;
            System.out.println("Desconectado de MySQL.");
        } else {
            System.out.println("MySQL ya está desconectado.");
        }
    }
}