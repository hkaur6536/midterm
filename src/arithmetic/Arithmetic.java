/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;


import java.util.Scanner;
import static java.time.Clock.system;

/** This class calls the method to perform 
 * arithmetic operations based on user input
 * execute the code check the output
 * @author sivagamasrinivasan
 * 
 */
public class Arithmetic {
    public static void main(String[] args) {
        ArithmeticBase r = new ArithmeticBase();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double x = in.nextDouble();
        System.out.println("Enter the second number: ");
        double y = in.nextDouble();
        System.out.println("Enter the arithmetic operation (PLUS, MINUS, TIMES, DIVIDE): ");
        Operation operation = Operation.valueOf(in.next().toUpperCase());
        double result = r.calculate(x, y, operation);
        System.out.println("Result: " + result);
    }
}
