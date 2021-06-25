public class LogicOperations {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        if (a==b) {
            System.out.println("They are equal");
        }else if((a != b) && (a > b)) {
            System.out.println("A is dff from b and greater than b");
        }else if(a > b) {
            System.out.println("A is greater than b");
        }else if(a < b) {
            System.out.println("A is less than b");
        }else if(a <= b) {
            System.out.println("A is less than or equal than b.");
        }else if(a >= b) {
            System.out.println("A is greater than or equal than b.");
        }else {
            System.out.println("This is the default case.");
        }
    }
}
