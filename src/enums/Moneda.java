package enums;

import java.math.BigDecimal;

public enum Moneda {

    //Cotações em 27/07/2022
    DOLAR(BigDecimal.valueOf(295.00)),
    EURO(BigDecimal.valueOf(298.00)),
    LIBRA_ESTERLINA(BigDecimal.valueOf(348.54)),
    REAL(BigDecimal.valueOf(67.00));

    private BigDecimal FACTOR_CONVERSION;

    Moneda(BigDecimal FACTOR_CONVERSION) {
        this.FACTOR_CONVERSION = FACTOR_CONVERSION;
    }

    public BigDecimal getFACTOR_CONVERSION() {
        return FACTOR_CONVERSION;
    }
}
