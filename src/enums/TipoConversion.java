package enums;

public enum TipoConversion {
    PESO_PARA_DOLAR("De Peso a Dólar"),
    PESO_PARA_EURO("De Peso a Euro"),
    PESO_PARA_LIBRA_ESTERLINA("De Peso a Libra Esterlina"),
    PESO_PARA_REAL ("De Peso a Real"),
    DOLAR_PARA_PESO("De Dólar a Peso"),
    EURO_PARA_PESO("De Euro a Peso"),
    LIBRA_ESTERLINA_PARA_PESO("De Libra Esterlina a Peso"),
    REAL_PARA_PESO("De Real a Peso"),

    CELSIUS_PARA_FAHRENHEIT("Celsius a Fahrenheit"),
    CELSIUS_PARA_KELVIN("Celsius a Kelvin"),
    KELVIN_PARA_FAHRENHEIT("Kelvin a Fahrenheit"),
    KELVIN_PARA_CELSIUS ("Kelvin a Celsius"),
    FAHRENHEIT_PARA_CELSIUS ("Fahrenheit a Celsius"),
    FAHRENHEIT_PARA_KELVIN("Fahrenheit a Kelvin");

    private String descripcion;

    TipoConversion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
