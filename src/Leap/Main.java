package Leap;

/** Программа составляет 10 уравнений проскости для 5 точек (по три точки для каждой плоскости
 и для оставшихся двух точек высчитывает расстояние от них до готовой плоскости)*/
public class Main {
    //переменные для задания координат исходных точек
    static int Ax,Ay,Az,Bx,By,Bz,Cx,Cy,Cz,Dx,Dy,Dz,Ex,Ey,Ez;

    //координаты двух векторов, их можно рассчитаьь вычитанием, но мы их введем сразу
    static int px,py,pz,qx,qy,qz;

    //значение при коэффициентах
    static int x,y,z,free;

    //коэффициенты общего вектора
    static int A,B,C;

    static int d1,d2,d3;

    public static void main(String[] args) {
        d1 = py*qz - qy*pz;
        d2 = -(px*qz - qx*pz);
        d3 = px*qy - qx*py;
        x = d1;
        y = d2;
        z = d3;
        free = A*d1 - B*d2 + C*d3;

    }
}
