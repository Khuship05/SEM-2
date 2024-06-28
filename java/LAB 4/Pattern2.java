import java.util.Scanner;
public class Pattern2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("How many diamonds u want to print");
        int d=sc.nextInt();
        for(int i=0;i<d;i++){
            for(int j=0;j<=i;j++){
            System.out.print("*");
        }
        System.out.println("");
        }
        for( int i=d-1;i<=0;i--){
            for( int j=0;i<=j;j++){
            System.out.print("*");

            }
            System.out.println("");
        }
    }
}