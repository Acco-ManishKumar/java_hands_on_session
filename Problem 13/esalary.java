package javaday2;

import java.util.Scanner;
import java.util.*;

class employee{
	String name,destination,dept;
	long contactno,salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public long getContactno() {
		return contactno;
	}
	public void setContactno(long contactno) {
		this.contactno = contactno;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "employee [name=" + name + ", destination=" + destination + ", dept=" + dept + ", contactno=" + contactno
				+ ", salary=" + salary + "]";
	}
}

public class esalary {

	public static void main(String[] args) {
		 Scanner obj = new Scanner(System.in);
	     System.out.print("How many employees? ");
         int n = obj.nextInt();
         employee emp[]=new employee[n];
         for (int i = 0; i < n; i++) {
         emp[i] = new employee();
         System.out.println("Enter " + (i + 1) + " Employee data :");
         System.out.println("name :");
         emp[i].name = obj.next();
         System.out.println("destination :");
         emp[i].destination = obj.next();
         System.out.print("dept :");
         emp[i].dept = obj.next();
         System.out.print("contactno :");
         emp[i].contactno = obj.nextLong();
         System.out.print("salary :");
         emp[i].salary = obj.nextLong();
}
         Map<String,List<employee>> map=new HashMap<>();
         for(int i=0;i<n;i++) {
        	 List<employee> l=new ArrayList<>();
        	 if(map.containsKey(emp[i].dept)) {
        		l =map.get(emp[i].dept);
        	 }
        	if(emp[i].salary>10000) l.add(emp[i]);
        	map.put(emp[i].dept, l);
        		 
         }
         System.out.println(map.values());
         
	}

}
