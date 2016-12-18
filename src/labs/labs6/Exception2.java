package labs.labs6;

import java.util.Scanner;

public class Exception2 {

    public void exceptionDemo() {

        Scanner myScanner = new Scanner( System.in );

        System.out.print( "Enter an integer ");

        String intString = myScanner.next();

        int i = 0;

        try

        {
            i = Integer.parseInt(intString);
            System.out.println( 10 / i );

        }
        catch (NumberFormatException e){
            System.out.println("Vi vveli slova a nada 4islo");
        }
        catch ( ArithmeticException e )

        {
            System.out.println("Delite na nol!!!!");
        }
        finally {
            System.out.println("--------");
        }


    } }