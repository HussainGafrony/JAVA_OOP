package part3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HandelException {

    public void Exception() {
        try {
            int x = 10, y = 0;
            System.out.println(x / y);
        } catch (ArithmeticException e) {
            System.out.println("Error , Division by Zero not Allowed");
        }
        System.out.println("The Program Continues");

    }

    public void multipleException() {
        // can use Exception Types or base class Exception
        try {
            int x, y;
            Scanner s = new Scanner(System.in);
            System.out.println("Enter x");
            x = s.nextInt();
            System.out.println("Enter y");
            y = s.nextInt();
            System.out.println(x / y);

        } catch (InputMismatchException e) {
            System.out.println("Error , please Enter Numeric values ");

        } catch (ArithmeticException e) {
            System.out.println("Error , Division by Zero not Allowed");

        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());

        }

    }

}
