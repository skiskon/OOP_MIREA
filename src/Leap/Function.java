package Leap;

//функция для рассчета растояния от прямой до точки
public class Function {


    public static Duo Widht(double A, double B, double C, double x2, double y2, double z2, double x3, double y3, double z3, double x4, double y4, double z4, double x5, double y5, double z5) {
        //определители 2*2 при лахложении по левому столбцу
        double d1, d2, d3;

        double px, py, pz, qx, qy, qz;

        //расстояние от точки до плоскости и коэффициент Дэ
        double D, h1, h2;
        px = x2 - A;
        py = y2 - B;
        pz = z2 - C;
        qx = x3 - A;
        qy = y3 - B;
        qz = z3 - C;


        d1 = py * qz - qy * pz;
        d2 = -(px * qz - qx * pz);
        d3 = px * qy - qx * py;
        D = -A * d1 - B * d2 - C * d3;
        h1 = Math.abs(x4 * d1 + y4 * d2 + z4 * d3 + D) / Math.sqrt(d1 * d1 + d2 * d2 + d3 * d3);
        h2 = Math.abs(x5 * d1 + y5 * d2 + z5 * d3 + D) / Math.sqrt(d1 * d1 + d2 * d2 + d3 * d3);

     /*   System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(D);
        System.out.println(h1); */
        return new Duo(h1, h2);
    }
}

