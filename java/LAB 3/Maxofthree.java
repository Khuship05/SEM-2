import java.util.Scanner;
public class Maxofthree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a");
        int a = sc.nextInt();
        System.out.println("enter b");
        int b = sc.nextInt();
        System.out.println("enter c");
        int c = sc.nextInt();
        if(a>b){
            if(a>c){
                System.out.println("max="+a);
            }
            else{
                System.out.println("max="+c);
            }
        }
        else{
            if(b>c){
                System.out.println("max="+b);
            }
            else{
                System.out.println("max="+c);
            }
        }
    }
}
