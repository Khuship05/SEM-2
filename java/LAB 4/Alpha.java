import java.util.Scanner;
public class Alpha{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int n=str.length();
        int V=0 ,c=0;
        for(int i=0;i<=n-1;i++){
            if(str.charAt(i) =='a'|| str.charAt(i) =='e' || str.charAt(i) =='i' || str.charAt(i) =='o' || str.charAt(i) =='u'|| str.charAt(i) =='A'|| str.charAt(i) =='E'|| str.charAt(i) =='I'|| str.charAt(i) =='O'|| str.charAt(i) =='U' ){
                V++;
            
            }
            else{c++;}
        }
        System.out.println("vowels"+V);
        System.out.println("consonants"+c);
    }
}