
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
            try{
                String[] parts = line.split("\\s+");
                if (parts.length !=3){
                    System.out.println("Error: Please enter in format: <number> <operator> <number>\n");
                    continue;
                }

                double a = Double.parseDouble(parts[0]);
                String op = parts[1];
                double b = Double.parseDouble(parts[2]);
                double result;



                switch (op){
                    
                }

            }

        }

    }
    
}
