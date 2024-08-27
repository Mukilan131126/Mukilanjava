class Employee{
    static  int AverageSalary=8000;
     static int bonus=1000;
    public void  SetSalary(){
        System.out.println("Salary");
        }
    }
    class FullTimeEmployee extends Employee{
        public static int SetSalary(int workhours){
           int a= AverageSalary*workhours+bonus;
           return a;
        }
    }
    class PartTimeEmployee extends Employee{
        public static int SetSalary(int workhours){
            int a = AverageSalary*workhours;
            return a;
        }
    }
public class Main1{
    public static void main(String[] args) {
        FullTimeEmployee obj=new FullTimeEmployee();
        int a=obj.SetSalary(12);
        PartTimeEmployee obj1=new PartTimeEmployee();
        int b=obj1.SetSalary(6);
        System.out.println("Full Time Employee Salary " + a);
        System.out.println("Half Time Employee Salary "+ b);
        
    }
}