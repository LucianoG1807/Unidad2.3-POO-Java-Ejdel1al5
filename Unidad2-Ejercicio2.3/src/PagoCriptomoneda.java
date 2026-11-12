public class PagoCriptomoneda implements ProcesadorPago {

    private double saldoCripto;

    public PagoCriptomoneda(double saldoCripto) {
        this.saldoCripto = saldoCripto;
    }

    @Override
    public boolean procesarPago(double monto) {
        if (monto > 0 && monto <= saldoCripto) {
            saldoCripto -= monto;
            return true;
        }

        return false;
    }
}