// public class Thiskeyword{
//     public static void main(String args[]){
//         int abc=10;
//         MyClass mc=new MyClass(abc);
//     }

// }
// class MyClass{
//     int temp;
//     MyClass(int temp){
//         System.out.println("temp"+temp);
//         System.out.println("this.temp"+this.temp);
//         this.temp=temp;
//         System.out.println("this.temp"+this.temp);
//     }
// }


import java.util.Scanner;
public class Thiskeyword{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        
        Student s1=new Student(s);
        System.out.println(s1.food);
        Student s2=new Student();
        System.out.println(s2.food);

    }
}
class Student{
     String food;
     Student(){
        food="chole-bhature";
     }
     Student(String food){
        this.food=food;
     }

}