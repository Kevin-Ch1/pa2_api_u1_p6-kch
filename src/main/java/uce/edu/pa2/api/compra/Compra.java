package uce.edu.pa2.api.compra;

public class Compra {

    private String compra;
    private Double subtotal;
    private Double total;

    public Compra(){
    }

    public Compra(String compra, Double subtotal) {
        this.compra = compra;
        this.subtotal = subtotal;
    }

    public String getCompra() {
        return compra;
    }

    public void setCompra(String compra) {
        this.compra = compra;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

}
