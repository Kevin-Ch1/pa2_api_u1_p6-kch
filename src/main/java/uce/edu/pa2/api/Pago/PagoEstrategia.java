package uce.edu.pa2.api.pago;

import uce.edu.pa2.api.compra.Compra;

public interface PagoEstrategia {
    public double realizar(Compra compra);
}
