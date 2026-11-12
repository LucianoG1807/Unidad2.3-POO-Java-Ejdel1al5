public class ConexionPostgreSQL extends ConexionBD {

    @Override
    public void conectar() {
        if (!conectada) {
            conectada = true;
            System.out.println("Conectado a PostgreSQL.");
        } else {
            System.out.println("PostgreSQL ya está conectado.");
        }
    }

    @Override
    public void ejecutarConsulta(String sql) {
        if (conectada) {
            System.out.println("Ejecutando consulta en PostgreSQL: " + sql);
        } else {
            System.out.println("Error: PostgreSQL no está conectado.");
        }
    }

    @Override
    public void desconectar() {
        if (conectada) {
            conectada = false;
            System.out.println("Desconectado de PostgreSQL.");
        } else {
            System.out.println("PostgreSQL ya está desconectado.");
        }
    }
}