public class Main {

    public static void main(String[] args) {

        ConexionBD conexion = new ConexionMySQL();
        conexion.conectar();
        conexion.ejecutarConsulta("SELECT * FROM usuarios");
        conexion.desconectar();

        System.out.println(" ");

        conexion = new ConexionPostgreSQL();
        conexion.conectar();
        conexion.ejecutarConsulta("SELECT * FROM productos");
        conexion.desconectar();

        System.out.println(" ");

        conexion = new ConexionMongoDB();
        conexion.conectar();
        conexion.ejecutarConsulta("Buscar documentos de usuarios");
        conexion.desconectar();
    }
}