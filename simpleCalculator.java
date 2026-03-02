
import java.util.Scanner;

public class simpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===Simple Calculator===");
        System.out.println("Operation : + - * / %");
        System.out.println("Type 'exit' to quit\n ");

        while (true) { 
            System.out.println("Enter Expresstion (eg. 5 + 3): ");
            String line = scanner.nextLine().trim();


            if (line.equalsIgnoreCase("exit")){
                System.out.println("Goodbye!");
                break;

            }
        }

    }
    
}
