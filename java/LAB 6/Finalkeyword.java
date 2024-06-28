import java.util.Scanner;
public class Finalkeyword{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        final int c=a;
        final int d=b;
        Addition a1=new Addition(c,d);
    }
}
class Addition{
    Addition(int c,int d){
        int sum=c+d;
        System.out.println("sum="+sum);
        }
   
}