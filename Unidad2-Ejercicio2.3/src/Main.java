public class Main {

    public static void main(String[] args) {

        ProcesadorPago tarjeta = new PagoTarjetaCredito(50000);
        ProcesadorPago cripto = new PagoCriptomoneda(30000);
        ProcesadorPago billetera = new PagoBilleteraVirtual(20000);

        ModuloCompras compras = new ModuloCompras(tarjeta);

        compras.realizarCompra(15000);

        compras.cambiarProcesador(cripto);
        compras.realizarCompra(10000);

        compras.cambiarProcesador(billetera);
        compras.realizarCompra(25000);
    }
}