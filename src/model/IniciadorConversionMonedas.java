package model;

import enums.Moneda;

import java.math.BigDecimal;

public class IniciadorConversionMonedas {

    private static final String PESO_PARA_DOLAR = "De Peso a Dólar";
    private static final String PESO_PARA_EURO = "De Peso a Euro";
    private static final String PESO_PARA_LIBRA_ESTERLINA = "De Peso a Libra Esterlina";
    private static final String PESO_PARA_REAL = "De Peso a Real";
    private static final String DOLAR_PARA_PESO = "De Dólar a Peso";
    private static final String EURO_PARA_PESO = "De Euro a Peso";
    private static final String LIBRA_ESTERLINA_PARA_PESO = "De Libra Esterlina a Real";
    private static final String REAL_PARA_PESO = "De Real a Peso";
    private ConvertidorDeMoneda convertidorDeMonedaDolar = new ConvertidorDeMonedaDolar();
    private ConvertidorDeMoneda convertidorDeMonedaEuro = new ConvertidorDeMonedaEuro();
    private ConvertidorDeMoneda convertidorDeMonedaLibraEsterlina = new ConvertidorDeMonedaLibraEsterlina();
    private ConvertidorDeMoneda convertidorDeMonedaReal = new ConvertidorDeMonedaReal();

    private Moneda moneda;

    public BigDecimal operarConversion(String operacionMonedas, double valorInicial) throws Exception {

        switch (operacionMonedas) {
            case PESO_PARA_DOLAR -> {
                return convertidorDeMonedaDolar.convertirParaMoneda(moneda, BigDecimal.valueOf(valorInicial));
            }
            case PESO_PARA_EURO -> {
                return convertidorDeMonedaEuro.convertirParaMoneda(moneda, BigDecimal.valueOf(valorInicial));
            }
            case PESO_PARA_LIBRA_ESTERLINA -> {
                return convertidorDeMonedaLibraEsterlina.convertirParaMoneda(moneda, BigDecimal.valueOf(valorInicial));
            }
            case PESO_PARA_REAL -> {
                return convertidorDeMonedaReal.convertirParaMoneda(moneda, BigDecimal.valueOf(valorInicial));
            }
            case DOLAR_PARA_PESO -> {
                return convertidorDeMonedaDolar.convertirParaReal(moneda, BigDecimal.valueOf(valorInicial));
            }
            case EURO_PARA_PESO -> {
                return convertidorDeMonedaEuro.convertirParaReal(moneda, BigDecimal.valueOf(valorInicial));
            }
            case LIBRA_ESTERLINA_PARA_PESO -> {
                return convertidorDeMonedaLibraEsterlina.convertirParaReal(moneda, BigDecimal.valueOf(valorInicial));
            }
            case REAL_PARA_PESO -> {
                return  convertidorDeMonedaReal.convertirParaReal(moneda, BigDecimal.valueOf(valorInicial));
            }
            default -> throw new Exception("ELECCIÓN INVÁLIDA");
        }

    }

}
