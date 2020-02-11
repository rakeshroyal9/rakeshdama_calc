package epam.calc;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

    	double num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Calculator");
        System.out.print("Enter first number:");
        num1 = sc.nextDouble();
        System.out.print("Enter second number:");
        num2 = sc.nextDouble();
        System.out.print("Enter an operator: ");
        System.out.print("Please Enter a valid operator (+,-,*,/)");
        char operator = sc.next().charAt(0);
        sc.close();
        double output;
        switch(operator)
        {
            case '+':
            	output = num1 + num2;
                break;
            case '-':
            	output = num1 - num2;
                break;
            case '*':
            	output = num1 * num2;
                break;
            case '/':
            	output = num1 / num2;
                break;
            default:
                System.out.printf("You have entered wrong operator");
                return;
        }
        System.out.println(num1+" "+operator+" "+num2+": "+output);
    }
}