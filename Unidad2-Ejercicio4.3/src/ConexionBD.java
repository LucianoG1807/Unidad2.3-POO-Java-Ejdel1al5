public abstract class ConexionBD {

    protected boolean conectada;

    public ConexionBD() {
        this.conectada = false;
    }

    public abstract void conectar();

    public abstract void ejecutarConsulta(String sql);

    public abstract void desconectar();
}