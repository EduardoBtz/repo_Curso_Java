public class Casting {
    public static void main(String[] args) {
        // In one year, locate 30 dogs.
        // How many dogs did I located in a month.

        double montlyDogs = 30.0/12.0;
        // Prints as double.
        System.out.println(montlyDogs);

        // Estimation
        // Prints as int.
        int estimatedMonthlyDogs = (int) montlyDogs;
        System.out.println(estimatedMonthlyDogs);

        // Exactly
        int a = 30;
        int b = 12;

        System.out.println((double) a/b);

        // Another example of Casting
        int x = 30;
        int y = 12;

        double z = x/y;
        System.out.println(z);
    }
}
