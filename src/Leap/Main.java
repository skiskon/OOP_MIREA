package Leap;

/** Программа составляет 10 уравнений проскости для 5 точек (по три точки для каждой плоскости
 и для оставшихся двух точек высчитывает расстояние от них до готовой плоскости)*/
public class Main {
    //переменные для задания координат исходных точек
    static double Ax,Ay,Az,Bx,By,Bz,Cx,Cy,Cz,Dx,Dy,Dz,Ex,Ey,Ez;

    //координаты двух векторов, их можно рассчитаьь вычитанием, но мы их введем сразу
    static double px,py,pz,qx,qy,qz;

    //значение при коэффициентах
    static double x,y,z,free;

    //коэффициенты общего вектора
    static double A,B,C;

    //определители 2*2 при лахложении по левому столбцу
    static double d1,d2,d3;

    //расстояние от точки до плоскости
    static double h;

    public static void main(String[] args) {
        d1 = py*qz - qy*pz;
        d2 = -(px*qz - qx*pz);
        d3 = px*qy - qx*py;
        x = d1;
        y = d2;
        z = d3;
        free = A*d1 - B*d2 + C*d3;
        h =Math.abs(x*Ex + y*Ey + z*Ez + free)/Math.sqrt(x*x + y*y + z*z);

    }
}
