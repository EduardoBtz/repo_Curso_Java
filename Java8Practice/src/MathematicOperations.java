import java.util.logging.SocketHandler;

public class MathematicOperations {
    public static void main(String[] args) {
        double x = 2.1;
        double y = 3;

        // Return ceiling of double.
        System.out.println(Math.ceil(x));

        // Return floor of double
        System.out.println();

        // Return power of a number.
        System.out.println(Math.pow(y,2));

        // Returns max value between two.
        System.out.println(Math.max(x,y));

        // Returns square root.
        System.out.println(Math.sqrt(y));

        // Area of a circle
        // pi * r^2
        System.out.println(Math.PI * Math.pow(y,2));

        // Area of a sphere.
        // 4*PI*r^2
        System.out.println(4*Math.PI*Math.pow(y,2));

        // Volume of sphere.
        // (4/3)*pi*r^3
        System.out.println((4/3) * Math.PI * Math.pow(y,3));
    }
}
