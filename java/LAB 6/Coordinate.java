import java.util.Scanner;
public class Coordinate{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter point a");
        double a=sc.nextDouble();
        System.out.println("Enter point b");
        double b=sc.nextDouble();
        System.out.println("Enter point c");
        double c=sc.nextDouble();
        System.out.println("Enter point d");
        double d=sc.nextDouble();
		MyPoint p1 = new MyPoint(a,b);
		MyPoint p2 = new MyPoint(c,d);

    }
}
class MyPoint{
    double x;
    double y;
    void Mypoint(){
        double x=0;
        double y=0;
    }
    void MyPoint(double x,double y){
        this.x=x;
        this.y=y;
    }
    public void distance(double a,double b, double c, double d){
    double dist;
    dist=Math.sqrt(Math.pow (MyPoint.getX-MyPoint.getX),2) + 
   			 Math.pow((MyPoint.getY-MyPoint.getY), 2);
             System.out.println(dist);
}
}
