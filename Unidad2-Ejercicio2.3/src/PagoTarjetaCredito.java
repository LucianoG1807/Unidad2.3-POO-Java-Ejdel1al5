public class PagoTarjetaCredito implements ProcesadorPago {

    private double limiteCredito;

    public PagoTarjetaCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    @Override
    public boolean procesarPago(double monto) {
        if (monto > 0 && monto <= limiteCredito) {
            limiteCredito -= monto;
            return true;
        }

        return false;
    }
}