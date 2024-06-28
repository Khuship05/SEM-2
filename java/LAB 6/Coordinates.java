import java.util.Scanner;
public class Coordinates{
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter point a");
        double a=sc.nextDouble();
        System.out.println("Enter point b");
        double b=sc.nextDouble();
        System.out.println("Enter point c");
        double c=sc.nextDouble();
        System.out.println("Enter point d");
        double d=sc.nextDouble();
		MyPoint point1 = new MyPoint(a,b);
		MyPoint point2 = new MyPoint(c,d);


		System.out.println("The distance between 2 points (" 
			+ point1.getX() + ", " + point1.getY() + ") and ("
			+ point2.getX() + ", " + point2.getY() + ") is: " + 
			point1.distance(point2));
	}
}

class MyPoint {

    double x;
	double y;

	MyPoint() {
		this(0, 0);
	}


	MyPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

   public double distance(MyPoint myPoint) {
   	return Math.sqrt(Math.pow(myPoint.getX() - x, 2) + 
   			 Math.pow(myPoint.getY() - y, 2));
   }

 	public double distance(double x, double y) {
 		return distance(new MyPoint(x, y));
 	}
}