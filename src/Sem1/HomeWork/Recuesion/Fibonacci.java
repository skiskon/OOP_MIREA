package Sem1.HomeWork.Recuesion;


public class Fibonacci {
    public static int recursion(int n) {


        if (n == 1) {
            return  1;
        }

        if (n == 2) {
            return recursion(1);
        }

        if (n > 2) {
            return recursion(n-1)+recursion(n-2);
        }
        return 228;
    }

    public static void main(String[] args) {

        System.out.println(recursion(7)); // вызов рекурсивной функции

    }


}

