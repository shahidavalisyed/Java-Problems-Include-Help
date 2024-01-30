package ClassObject;

class Person{
    int age;
    String name;
    int salary;

    Person(int age,int salary,String name){
        this.age=age;
        this.name=name;
        this.salary=salary;
    }
}
class Employee{
    int emp_id;
    String company;
    Person p;
    Employee(int emp_id,String company,int age,int salary,String name){
        this.company=company;
        this.emp_id=emp_id;
        p=new Person(age,salary,name);
    }
    void printDetails(){
        System.out.println("Employee ID:"+emp_id);
        System.out.println("Company :"+company);
        System.out.println("Emplayee Name :"+p.name);
        System.out.println("Emplayee Age :"+p.age);
        System.out.println("Emplayee Salary :"+p.salary);
    }
}
public class ObjectDataMember {
    public static void main(String[] args) {
        Employee obj=new Employee(01,"FG",23,22300,"Shahidavali");
        obj.printDetails();

    }
}
