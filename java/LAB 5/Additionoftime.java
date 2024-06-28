import java.util.Scanner;
public class Additionoftime{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int h=sc.nextInt();
        int m=sc.nextInt();
        int hr=sc.nextInt();
        int min=sc.nextInt();
        Time t1=new Time(h,m);
        Time t2=new Time(hr,min);
        t1.addition(t1.h,t2.h,t1.m,t2.m);

    }
}
class Time{
    int h,m;
    Time(){
        int h,m;
    }
    Time(int hr,int min){
        h=hr;
        m=min;
        
    }
    void addition(int t1h,int t2h ,int t1m ,int t2m){
        int hours=t1h+t2h;
        int minutes=t1m+t2m;
        
        if(minutes>=60){
            minutes=minutes %60;
            hours++;
        }
        System.out.println(hours+"hr:"+minutes+"min");
    }

}