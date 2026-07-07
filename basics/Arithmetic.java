package basics;

public class Arithmetic {

    public static void main(String[] args) {

        // Variable Declaration and Initialization
        int a = 20, b = 30;

        // Addition
        int sum = a + b;
        System.out.println("The sum of " + a + " and " + b + " is " + sum);

        // Subtraction
        int diff = a - b;
        System.out.println("The difference of " + a + " and " + b + " is " + diff);

        // Multiplication
        int pro = a * b;
        System.out.println("The product of " + a + " and " + b + " is " + pro);

        // Division
        if (b != 0) {
            int div = a / b;
            System.out.println("The division of " + a + " and " + b + " is " + div);
        } else {
            System.out.println("Division not allowed");
        }
    }
}