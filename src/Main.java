import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import static java.lang.Integer.parseInt;


/**
 * Assignment 3 program 4.5
 * @author Sergei Chekhonin
 * This program execute different operations with 2 prompted numbers
 */

public class Main {

    public static void main(String[] args)  {
        String input = JOptionPane.showInputDialog("Enter first number:");
        int number1 = parseInt(input);
        input = JOptionPane.showInputDialog("Enter second number:");
        int number2 = parseInt(input);

        PrintWriter out = null;
        try {
            out = new PrintWriter("Assignment3_p4.5output.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        OperationsWithNumbers executor = new OperationsWithNumbers(number1, number2, out);
        executor.printSum();
        executor.printDifference();
        executor.printProduct();
        executor.printAverage();
        executor.printDistance();
        executor.printMax();
        executor.printMin();

        out.close();
    }
}
