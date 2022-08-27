import enums.TipoConversion;
import model.*;

import javax.swing.*;
import java.math.BigDecimal;

public class Principal {

    public static void main(String[] args) throws Exception {

        String conversionDeMoneda = "Convertir moneda";
        String conversionDeTemperatura = "Convertir temperatura";

        boolean ejecuta = true;

        Repetidor repetidor = new Repetidor();

        while(ejecuta){
            String operacion = JOptionPane.showInputDialog(null, "Elige la operación",
                    "Conversiones", JOptionPane.QUESTION_MESSAGE, null, new String[]
                            {conversionDeMoneda, conversionDeTemperatura}, "Elección").toString();

            if (operacion.equals(conversionDeMoneda)) {
                IniciadorConversionMonedas iniciadorConversionMonedas = new IniciadorConversionMonedas();
                
                String operacionMonedas = JOptionPane.showInputDialog(null, "Elige una moneda",
                        "Monedas", JOptionPane.QUESTION_MESSAGE, null, new String[] {
                                TipoConversion.PESO_PARA_DOLAR.getDescripcion(),
                                TipoConversion.PESO_PARA_EURO.getDescripcion(),
                                TipoConversion.PESO_PARA_LIBRA_ESTERLINA.getDescripcion(),
                                TipoConversion.PESO_PARA_REAL.getDescripcion(),
                                TipoConversion.DOLAR_PARA_PESO.getDescripcion(),
                                TipoConversion.EURO_PARA_PESO.getDescripcion(),
                                TipoConversion.LIBRA_ESTERLINA_PARA_PESO.getDescripcion(),
                                TipoConversion.REAL_PARA_PESO.getDescripcion(),
                                }, "Elegir").toString();
                
                String valorString = JOptionPane.showInputDialog("Introduzca un valor");
                Validador validador = new Validador();
                if(!validador.verificar(valorString)){
                    JOptionPane.showMessageDialog(null, "Valor Inválido");
                } else{
                    double valorInicial = validador.transformarEnDouble(valorString);
                    BigDecimal valorConvertido = iniciadorConversionMonedas.operarConversion(operacionMonedas, valorInicial);
                    JOptionPane.showMessageDialog(null, valorConvertido);
                }
            } else if(operacion.equals(conversionDeTemperatura)){
                IniciadorConversionTemperatura iniciadorConversionTemperatura = new IniciadorConversionTemperatura();
                String operacionTemperaturas = JOptionPane.showInputDialog(null, "Elige la escala de temperatura",
                        "Monedas", JOptionPane.QUESTION_MESSAGE, null, new String[] {
                                TipoConversion.CELSIUS_PARA_FAHRENHEIT.getDescripcion(),
                                TipoConversion.CELSIUS_PARA_KELVIN.getDescripcion(),
                                TipoConversion.FAHRENHEIT_PARA_CELSIUS.getDescripcion(),
                                TipoConversion.FAHRENHEIT_PARA_KELVIN.getDescripcion(),
                                TipoConversion.KELVIN_PARA_CELSIUS.getDescripcion(),
                                TipoConversion.KELVIN_PARA_FAHRENHEIT.getDescripcion(),},
                        "Elección").toString();

                String valorString = JOptionPane.showInputDialog("Introduzca un valor");
                Validador validador = new Validador();
                if(!validador.verificar(valorString)){
                    JOptionPane.showMessageDialog(null, "Valor Inválido");
                } else{
                    double valorInicial = validador.transformarEnDouble(valorString);
                    double valorConvertido = iniciadorConversionTemperatura.operarConversion(operacionTemperaturas, valorInicial);
                    JOptionPane.showMessageDialog(null, valorConvertido);
                }
            }
            ejecuta = repetidor.intentaRepetir();
        }

    }
}
