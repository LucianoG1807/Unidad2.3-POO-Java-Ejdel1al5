public class ModuloCompras {

    private ProcesadorPago procesador;

    public ModuloCompras(ProcesadorPago procesador) {
        this.procesador = procesador;
    }

    public void cambiarProcesador(ProcesadorPago procesador) {
        this.procesador = procesador;
    }

    public void realizarCompra(double monto) {
        if (procesador.procesarPago(monto)) {
            System.out.println("Pago aprobado. Importe: $" + monto);
            System.out.println("Comprobante emitido correctamente.");
        } else {
            System.out.println("Pago rechazado. Importe: $" + monto);
        }
    }
}