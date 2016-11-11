package HomeWork.Recuesion;

//функция Аккермана
public class Akerman {
    public static int recursion(int m, int n) {


        if (m == 0) {
            return n + 1;
        }

        if (n == 0) {
            return recursion(m - 1, 1);
        }

        if (m > 0) {
            return recursion(m - 1, recursion(m, n - 1));
        }
        return 228;
    }

    public static void main(String[] args) {

        System.out.println(recursion(3, 2)); // вызов рекурсивной функции

    }


}