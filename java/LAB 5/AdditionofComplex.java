import java.util.Scanner;
public class AdditionofComplex{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=sc.nextInt();
        int n1=sc.nextInt();
        int i1=sc.nextInt();
        Complex c1=new Complex(n,i);
        Complex c2=new Complex(n1,i1);
        c2.sum(c1,c2);
    }
}
class Complex{
    int n,i;
    Complex(int n,int i){
        

    }
    Complex( int n1,int i1){
        int n=n1;
        int i=i1;

    }
    void sum(Complex obj1,Complex obj2){
        int a=c1.n + c2.n;
        int b=c1.i + c2.i;
        System.out.println("Complex number:" +a+ "+" +b+"i");
    }
}