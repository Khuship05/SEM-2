import java.util.Scanner;
public class Reverse{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter thesize of array");
        int s=sc.nextInt();
        int arr[]=new int[s];
        for(int i=0;i<(arr.length);i++){
            arr[i]=sc.nextInt();
        }

        for(int i=s-1;i>=0;i--){
            
            System.out.println("array of size:"+arr[i]);
        }

    }
}