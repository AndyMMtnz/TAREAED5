public class Pedido {
    public Cliente cliente;
    public Pedido(Cliente cliente) {
        this.cliente = cliente;
    }

    // Getter y setter para cliente
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void procesarPedido(double total) {
        double descuento = 0;

        if (total > 100) {
            if (cliente.isEsVip()) {
                descuento = total * 0.15; // 15% de descuento para clientes VIP
            } else {
                descuento = total * 0.10; // 10% de descuento para clientes normales
            }
        }

        double precioFinal = total - descuento;
        String tipoPedido = cliente.isEsVip() ? "Pedido VIP" : "Pedido normal";

        System.out.println(tipoPedido + " aprobado. Total: " + precioFinal +
                (descuento > 0 ? " (descuento aplicado: " + descuento + ")" : ""));
    }
}
