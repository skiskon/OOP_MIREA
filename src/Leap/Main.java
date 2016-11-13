package Leap;


/** Программа составляет 10 уравнений проскости для 5 точек (по три точки для каждой плоскости
 и для оставшихся двух точек высчитывает расстояние от них до готовой плоскости)*/
public class Main {
    //переменные для задания координат исходных точек
    static double Ax, Ay, Az, Bx, By, Bz, Cx, Cy, Cz, Dx, Dy, Dz, Ex, Ey, Ez;

    //Расстояние от плоскостей до оставшийся двух точек
    static double h01, h02, h11, h12, h21, h22, h31, h32, h41, h42, h51, h52, h61, h62, h71, h72, h81, h82, h91, h92;

    //Дельты для подсчета, где Er - погрешность
    static double d01, d02, d11, d12, d21, d22, d31, d32, d41, d42, d51, d52, d61, d62, d71, d72, d81, d82, d91, d92, Er;

    public static void main(String[] args) {
        init();

        Duo H;
        H = Function.Widht(Ax, Ay, Az, Bx, By, Bz, Cx, Cy, Cz, Dx, Dy, Dz, Ex, Ey, Ez);
        h01 = H.First;
        h02 = H.Second;

        System.out.println();

        H = Function.Widht(Ax, Ay, Az, Bx, By, Bz, Dx, Dy, Dz, Cx, Cy, Cz, Ex, Ey, Ez);
        h11 = H.First;
        h12 = H.Second;

        H = Function.Widht(Ax, Ay, Az, Bx, By, Bz, Ex, Ey, Ez, Cx, Cy, Cz, Dx, Dy, Dz);
        h21 = H.First;
        h22 = H.Second;

        H = Function.Widht(Ax, Ay, Az, Cx, Cy, Cz, Dx, Dy, Dz, Bx, By, Bz, Ex, Ey, Ez);
        h31 = H.First;
        h32 = H.Second;

        H = Function.Widht(Ax, Ay, Az, Cx, Cy, Cz, Ex, Ey, Ez, Dx, Dy, Dz, Bx, By, Bz);
        h41 = H.First;
        h42 = H.Second;

        H = Function.Widht(Ax, Ay, Az, Dx, Dy, Dz, Ex, Ey, Ez, Cx, Cy, Cz, Bx, By, Bz);
        h51 = H.First;
        h52 = H.Second;

        H = Function.Widht(Bx, By, Bz, Cx, Cy, Cz, Dx, Dy, Dz, Ax, Ay, Az, Ex, Ey, Ez);
        h61 = H.First;
        h62 = H.Second;

        H = Function.Widht(Bx, By, Bz, Cx, Cy, Cz, Ex, Ey, Ez, Dx, Dy, Dz, Ax, Ay, Az );
        h71 = H.First;
        h72 = H.Second;

        H = Function.Widht(Bx, By, Bz, Dx, Dy, Dz, Ex, Ey, Ez, Cx, Cy, Cz, Ax, Ay, Az);
        h81 = H.First;
        h82 = H.Second;

        H = Function.Widht(Cx, Cy, Cz, Dx, Dy, Dz, Ex, Ey, Ez, Ax, Ay, Az, Bx, By, Bz);
        h91 = H.First;
        h92 = H.Second;

     //   System.out.println("Высота первой точки первой плоскости: " + h01);
     //   System.out.println("Высота второй точки первой плоскости: " + h02);

        d01 = h01 -Er;
        d02 = h02 -Er;
        d11 = h11 -Er;
        d12 = h12 -Er;
        d21 = h21 -Er;
        d22 = h22 -Er;
        d31 = h31 -Er;
        d32 = h32 -Er;
        d41 = h41 -Er;
        d42 = h42 -Er;
        d51 = h51 -Er;
        d52 = h52 -Er;
        d61 = h61 -Er;
        d62 = h62 -Er;
        d71 = h71 -Er;
        d72 = h72 -Er;
        d81 = h81 -Er;
        d82 = h82 -Er;
        d91 = h91 -Er;
        d92 = h92 -Er;
        if ( d01 > 0 | d02 > 0 | d11 > 0 | d12 > 0 | d21 > 0 | d22 > 0 | d31 > 0 | d32 > 0 | d41 > 0 | d42 > 0 | d51 > 0 | d52 > 0 | d61 > 0 | d62 > 0 | d71 > 0 | d72 > 0 | d81 > 0 | d82 > 0 | d91 > 0 | d92 > 0 )
            System.out.println("АЛАРМА НАСЯЛЬНИК СЛИСКОМ ОГРОМНА ПАГРЕШНОСТЬ");


    }
    private static void init(){
        Ax = 1;
        Ay = -2;
        Az = 0;
        Bx = 2;
        By = 0;
        Bz = -1;
        Cx = 0;
        Cy = -1;
        Cz = 2;
        Dx = 6;
        Dy = 6;
        Dz = 6;
        Ex = 1488;
        Ey = 228;
        Ez = 1337;
    }

}
