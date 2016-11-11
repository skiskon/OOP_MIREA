package Leap;

//функция для рассчета растояния от прямой до точки
public class Function {


    public Duo Widht(int A, int B, int C, int x2, int y2, int z2, int x3, int y3, int z3, int x4, int y4, int z4, int x5, int y5, int z5){
        double  d1, d2, d3;
        double px,py,pz,qx,qy,qz;
        double D,h;
        px = x2 - A;
        py = y2 - B;
        pz = z2 - C;
        qx = x3 - A;
        qy = y3 - B;
        qz = z3 - C;


        d1 = py*qz - qy*pz;
        d2 = -(px*qz - qx*pz);
        d3 = px*qy - qx*py;
        x = d1;
        y = d2;
        z = d3;
        D = A*d1 - B*d2 + C*d3;
        h =Math.abs(x*Ex + y*Ey + z*Ez + D)/Math.sqrt(x*x + y*y + z*z);
    return null;
    }
}
