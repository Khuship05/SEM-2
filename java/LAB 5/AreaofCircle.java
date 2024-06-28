// public class AreaofCircle{
//     public static void main(String[] args){
//         Area a1= new Area();
//         double a=a1.circle(10);
//         System.out.println("Area" +a);
//     }
// }

// class Area{
//     double circle(int r){
//         double ar=Math.PI *r*r;
//         return ar;
//     }
// }

//For area of square
import java.util.Scanner;
public class AreaofCircle{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double b=sc.nextInt();
        double l=sc.nextInt();
        Area a1=new Area();
        double a=a1.square(l,b);
        System.out.println("AREA" +a);
    }
}
class Area{
    double square(double l, double b){
        double ar = l*b;
        return ar;
    }
}