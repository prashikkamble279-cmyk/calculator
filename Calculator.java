package Calculatorproject;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
      long num1, num2, result;            // selected a data type and declared variables
        char operator;
        
        // then created an object of a scanner to get input from user \
        
        Scanner scanner = new Scanner(System.in);

        // took the user inputs 
        
        System.out.print("Enter first number: ");
        num1 = scanner.nextInt();

        System.out.print("Enter an operator (+, -, *, /): ");
        operator = scanner.next().charAt(0);  // while we are using char for symbol and single character we can read it like this 

        System.out.print("Enter second number: ");
        num2 = scanner.nextInt();

        // then for handling the operations used " Switch Statement "
        switch (operator) {
            case '+':
                result = num1 + num2;  // Addition 
                System.out.println("Result = " + result);
                break;
            case '-':
                result = num1 - num2; // Substraction 
                System.out.println("Result = " + result);
                break;
            case '*':
                result = num1 * num2;  // multiplication 
                System.out.println("Result = " + result);
                break;
            case '/':
                if (num2 != 0) {  
                    result = num1 / num2;    // Division 
                    System.out.println("Result = " + result);
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                }
                break;
            default:
                System.out.println("Invalid input!");
                break;
        }

        scanner.close();
    }
}
