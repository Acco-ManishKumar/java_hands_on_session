import java.util.*;

public class Question6 {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Mukil", "JSE", "123", "IT", 20000);
        Employee emp2 = new Employee("Mano", "SR", "456", "Sales", 25000);
        Employee emp3 = new Employee("Powshali", "SSE", "789", "IT", 30000);
        Employee emp4 = new Employee("Manish", "SHR", "012", "HR", 26000);
        Employee emp5 = new Employee("Mukil", "JSE", "123", "IT", 20000);

        List<Employee> list = new ArrayList<Employee>();

        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        list.add(emp5);

        List<Employee> res = new ArrayList<Employee>();

        for (Employee emp : list) {
            int isExist = 0;
            for (Employee e : res) {
                if (e.getName().equals(emp.getName()) && e.getDesig().equals(emp.getDesig()) && e.getContactNo() == emp.getContactNo() && e.getDept().equals(emp.getDept()) && e.getSalary() == emp.getSalary()) {
                    isExist = 1;
                    break;
                }
            }
            if (isExist == 0) res.add(emp);
        }
        for (Employee emp : res) {
            System.out.println(emp.name+" "+emp.desig+" "+emp.contactNo+" "+emp.dept+" "+emp.salary);
        }
    }
}

//class Employee {
//    String name, dept, desig;
//    long contactNo;
//    int salary;
//
//    public String getName() {
//        return name;
//    }
//
//    public String getDept() {
//        return dept;
//    }
//
//    public String getDesig() {
//        return desig;
//    }
//
//    public long getContactNo() {
//        return contactNo;
//    }
//
//    public int getSalary() {
//        return salary;
//    }
//
//    Employee(String name, String desig, long contactNo, String dept, int salary) {
//        this.name = name;
//        this.desig = desig;
//        this.contactNo = contactNo;
//        this.dept = dept;
//        this.salary = salary;
//    }
//}
//
//
