package uce.edu.pa2.api.transacción;

public class Transferencia {
    private String cliente;
    private String destinatario;
    private double cantidad;
    private String cuenta;
    private String concepto;

    public Transferencia() {
    }

    public Transferencia(String cliente, String destinatario, double cantidad, String cuenta, String concepto) {
        this.cliente = cliente;
        this.destinatario = destinatario;
        this.cantidad = cantidad;
        this.cuenta = cuenta;
        this.concepto = concepto;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

}
