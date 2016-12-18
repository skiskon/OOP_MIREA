package labs.labs6;

/* при использовании этого способа надо сделать метод exceptionDemo статическим
public class Main extends Exception1 {
    public static void main(String[] args) {
        exceptionDemo();
    }
}

*/
public class Main {
    public static void main(String[] args) {
   //     Exception1 exception1 = new Exception1();
        //exception1.exceptionDemo();

        Exception2 exception2 = new Exception2();
        exception2.exceptionDemo();

//        ThrowsDemo throwsDemo = new ThrowsDemo();
 //       throwsDemo.getDetails(null);
    }
}
