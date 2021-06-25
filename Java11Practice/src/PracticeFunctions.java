public class PracticeFunctions {

    public static void main(String[] args) {
        double areaOfCircle;
        double radius1 = 4.0;
        areaOfCircle = circleArea(radius1);
        System.out.println(areaOfCircle);

        double areaOfSphere;
        double radius2 = 3.5;
        areaOfSphere = sphereArea(radius2);
        System.out.println(areaOfSphere);

        double pesos = 4550.50;
        double dollars = pesoToDolar(pesos);
        System.out.println(dollars);

        double quantity = 110.1;
        quantity = convertCurrency(quantity, "MXN");
        System.out.println(quantity);

    }

    public static double circleArea(double r) {
        return Math.PI * Math.pow(r,2);
    }

    public static double sphereArea(double r) {
        return 4 * Math.PI * Math.pow(r, 2);
    }

    public static double pesoToDolar(double pesos) {
        final double DOLLAR_VALUE_IN_PESO = 20.0;
        return pesos*DOLLAR_VALUE_IN_PESO;
    }

    /**
     * This function converts money to specified currency. Works with MXN and USD.
     * @param quantity Quantity of money.
     * @param currency Type of currency (MXN/USD).
     * @return Returns Converted Quantity.
     */
    public static double convertCurrency(double quantity, String currency) {
        switch (currency) {
            case "MXN":
                quantity = quantity * 0.050;
                break;
            case "USD":
                quantity = quantity * 20;
        }
        return quantity;
    }
}
