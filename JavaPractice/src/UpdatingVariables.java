public class UpdatingVariables {
    public static void main(String[] args) {
        int salary = 1000;
        // Bonus $200;
        salary += 200;
        System.out.println(salary);

        // Morgage $50
        salary -= 50;
        System.out.println(salary);

        // Extra work. $30 per hour.
        // Food: $45
        salary += ((30*2) - 45);
        System.out.println(salary);

        // Updating Strings
        String employeeName = "Eduardo Benitez";
        employeeName += " Carrillo";
        System.out.println(employeeName);
        System.out.println("Your name is Missael " + employeeName);
    }
}
