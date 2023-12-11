class Employee{
   String Name;
   int Age;
   String Phone;
   String Address;
   double Salary;
   Employee(String Name,int Age,String Phone,String Address,double Salary){
    this.Name=Name;
    this.Age=Age;
    this.Phone=Phone;
    this.Address=Address;
    this.Salary=Salary;
   } 
   void printsalary(){
    System.out.println("Salary : "+Salary);
   }
}
class Officer extends Employee{
    String specialization;
    Officer(String Name,int Age,String Phone,String Address,double Salary,String specialization){
        super(Name,Age,Phone,Address,Salary);
        this.specialization=specialization;
    }
    public String ToString(){
            return "\nName : "+Name+"\nAge : "+Age+"\nPhone : "+Phone+"\nAddress : "+Address+"\nSalary : "+Salary+"\nSpecialization : "+specialization;
    }
}
class Manager extends Employee{
    String department;
    Manager(String Name,int Age,String Phone,String Address,double Salary,String department){
        super(Name,Age,Phone,Address,Salary);
        this.department=department;
    }
    public String ToString(){
            return "\nName : "+Name+"\nAge : "+Age+"\nPhone : "+Phone+"\nAddress : "+Address+"\nSalary : "+Salary+"\nDepartment : "+department;
    }
}
public class OffManager {
    public static void main(String[] args) {
        Manager m=new Manager("Meenu",21,"7638762367","Skylie",3637.21,"Sales");
        Officer o=new Officer("Tom",20,"9998762367","Hayat",80007.21,"ML");
        System.out.println(m.ToString());
        System.out.println(o.ToString());
    }
}
