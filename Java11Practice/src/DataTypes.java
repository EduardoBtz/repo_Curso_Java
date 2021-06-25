public class DataTypes {
    public static void main(String[] args) {
        int n = 1234567890;
        long nL = 12345678901L;

        double nD = 123.456;
        float nF = 123.456F;

        // Java Infers data types.
        var salary = 100; // Int
        var morgage = salary*0.03; // double
        var totalSalary = salary - morgage; // double

        System.out.println(salary);
        System.out.println(morgage);

        var employeeName = "Eduardo Benitez"; // String
        System.out.println("Employee: " + employeeName + "Salary: " + totalSalary);




    }
}





