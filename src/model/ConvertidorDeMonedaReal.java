package model;

import enums.Moneda;

import java.math.BigDecimal;

public class ConvertidorDeMonedaReal extends ConvertidorDeMoneda {

    @Override
    public BigDecimal convertirParaMoneda(Moneda moneda, BigDecimal valorEnReais) {
        moneda = Moneda.REAL;
        return super.convertirParaMoneda(moneda, valorEnReais);
    }

    @Override
    public BigDecimal convertirParaReal(Moneda moneda, BigDecimal valorEnMoneda) {
        moneda = Moneda.REAL;
        return super.convertirParaReal(moneda, valorEnMoneda);
    }
}
