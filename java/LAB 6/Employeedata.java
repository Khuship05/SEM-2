import java.util.Scanner;
public class Employeedata{
    public static void main(String[] args){

        System.out.println("enter name");
        String Name=sc.nextLine();
        System.out.println("enter address");
        String Address=sc.nextLine();
        System.out.println("enter age");
        int Age=sc.nextInt();
        System.out.println("enter Phone number");
        String Phonenumber=sc.nextLine();
        System.out.println("enter salary");
        double Salary=sc.nextDouble(); 
        
        Employee e1=new Employee(Name,Address,Age,Phonenumber,Salary);
        Manager m1=new Manager();
        public void printSalary(){
            System.out.println(Salary);
        }
    }
}
class Member{
    String Name,Address;
    int Phonenumber,Age;
    double Salary;
    Scanner sc=new Scanner(System.in);
    Member(int name,String Address,int Age,String Phonenumber,int Salary){
    }

}
class Employee extends Member{
    String Specialization="DataEntry";
    Employee(String Name,String Address,String Phonenumber,int Age,double Salary){
        super.Name=Name;
        super.Address=Address;
        super.Phonenumber=Phonenumber;
        super.Age=Age;
        super.Salary=Salary;
    }
}
class Manager extends Member{
    String Department="IT dept";
    Manager(String Name,String Address,String Phonenumber,int Age,double Salary){
        super.Name=Name;
        super.Address=Address;
        super.Phonenumber=Phonenumber;
        super.Age=Age;
        super.Salary=Salary;
    }
}