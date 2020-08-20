import java.io.PrintWriter;

import static java.lang.Math.floorMod;

public class OperationsWithNumbers {
    
    int _number1, _number2;
    PrintWriter _out;
    /***
     *
     * @param number1 - stores entered 1st number
     * @param number2 - stores entered 2nd number
     */
    public OperationsWithNumbers(int number1, int number2, PrintWriter out) {
        _number1 = number1;
        _number2 = number2;
        _out=out;
    }

    /***
     * compute and prints Sum of entered numbers
     */
    public void printSum()
    {
        int result = _number1+_number2;
        _out.printf("Sum:%20d\n", result);
    }
    /***
     * compute and prints Difference of entered numbers
     */
    public void printDifference()
    {
        int result = _number1-_number2;
        _out.printf("Difference:%13d\n", result);
    }

    /***
     * compute and prints Product of entered numbers
     */
    public void printProduct()
    {
        int result = _number1*_number2;
        _out.printf("Product:%16d\n", result);
    }

    /***
     * compute and prints Average of entered numbers
     */
    public void printAverage()
    {
        double result = (_number1+_number2)/2.0;
        _out.printf("Average:%19.2f\n", result);
    }

    /***
     * compute and prints Distance of entered numbers
     */
    public void printDistance()
    {
        int result = _number1-_number2;
        result = result<0 ? result*(-1) : result;
        _out.printf("Distance:%15d\n", result);
    }

    /***
     * compute and prints Max of entered numbers
     */
    public void printMax()
    {
        int result = _number1-_number2;
        result = result>0 ? _number1 : _number2;
        _out.printf("Max:%20d\n", result);
    }

    /***
     * compute and prints Min of entered numbers
     */
    public void printMin()
    {
        int result = _number1-_number2;
        result = result<0 ? _number1 : _number2;
        _out.printf("Min:%20d\n", result);
    }

}
