import java.util.*;

public class Question6_efficient {
    public static void main(String[] args) {
        Employee e1 = new Employee("Kavita", "Engineering", "9820098200" , "IT", 200);
        Employee e2 = new Employee("Krisha", "Engineering", "9821098210" , "IT", 100);
        Employee e3 = new Employee("Janani", "Engineering", "9820598205" , "IT", 400);
        Employee e4 = new Employee("Kirtivasan", "Engineering", "9820898208" , "IT", 250);
        Employee e5 = new Employee("Yousha", "Engineering", "9828098280" , "IT", 600);
        Employee e6 = new Employee("Jane", "Engineering", "9820098200" , "IT", 500);
        Employee e7 = new Employee("John", "Engineering", "9820098200" , "IT", 1000);
        Employee e8 = new Employee("Jonas", "Engineering", "9820098200" , "IT", 900);
        Employee e9 = new Employee("Kirtivasan", "Engineering", "9820898208" , "IT", 250);
        Employee e10 = new Employee("Kavita", "Engineering", "9820098200" , "IT", 200);

        ArrayList<Employee> empList = new ArrayList<>();
        empList.add(e1);empList.add(e2);empList.add(e3);empList.add(e4);empList.add(e5);empList.add(e6);empList.add(e7);empList.add(e8);empList.add(e9);empList.add(e10);

        HashSet<Employee> empSet = new HashSet<>(empList);

        Iterator<Employee> i = empSet.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}

class Employee {
    String name;
    String desig;
    String contactNo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesig() {
        return desig;
    }

    public void setDesig(String desig) {
        this.desig = desig;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    String dept;
    int salary;

    Employee(String name, String desig, String contactNo, String dept, int salary){
        this.name = name;
        this.desig = desig;
        this.contactNo = contactNo;
        this.dept = dept;
        this.salary = salary;
    }

    @Override
    public String toString(){
        return "Name:" + this.name + " Salary: " + this.salary + '\n';
    }

    @Override
    public int hashCode(){
        System.out.println("Inside Hashcode");
        return  Objects.hash(this.name,this.desig,this.contactNo,this.dept,this.salary);
    }

    @Override
    public boolean equals(Object obj){
        System.out.println("Inside Equals");
        if(this == obj)
            return true;

        Employee newEmp = (Employee) obj;
        if(newEmp.name.equals(this.name) && newEmp.desig.equals(this.desig) && newEmp.contactNo.equals(this.contactNo) && newEmp.dept.equals(this.dept) && newEmp.salary==this.salary )
            return true;

        return false;
    }
}

