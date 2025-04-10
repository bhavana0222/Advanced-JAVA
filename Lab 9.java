//1. WAP to  add  set of Employees into a HashSet to store unique Employees based on empId.

import java.util.Objects;
public class Employee {
	
	private int empid;
	private String name;
	public String department;

        // Constructor to initialize employee attributes
	public Employee(int empid,String name,String department) {
		this.empid=empid;
		this.name=name;
		this.department=department;
	}
	public int getEmpid() {
		return empid;
	}
	public String getName() {
		return name;
	}
	public String getDepartment() {
		return department;
	}
        // Override the hashCode method to generate a unique hash code based on employee attributes
	@Override
	public int hashCode() {
		return Objects.hash(department, empid, name);
	}
        // Override the equals method to compare employee objects based on their attributes
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(department, other.department) && empid == other.empid && Objects.equals(name, other.name);
	}
        // Override the toString method to provide a meaningful string representation of the employee object
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", department=" + department + "]";
	}
	
}
import java.util.HashSet;
import java.util.Set;
public class HashSetEmployee {
	
	public static void main(String[] args) {
		// Create a HashSet to store unique Employee objects
		Set<Employee> employeeSet=new HashSet<>();
        // Create Employee objects with varying empid values
        Employee emp1=new Employee(1,"Bhavana","HR");
        Employee emp2=new Employee(2,"Keerthana","Maeketing");
        Employee emp3=new Employee(3,"Ruthika","Testing");
        Employee emp4=new Employee(2,"Swathi","Marketing");
        
        // Add Employee objects to the HashSet, which automatically eliminates duplicates based on empid
        employeeSet.add(emp1);
        employeeSet.add(emp2);
        employeeSet.add(emp3);
        employeeSet.add(emp4);
        
        // Print the unique Employee objects in the HashSet
        System.out.println("Unique Employees:");
        for(Employee employee:employeeSet)
        	System.out.println(employee);
	}

}

//2.WAP to  add student names into the set using TreeSet.

import java.util.Set;
import java.util.TreeSet;

public class TreeSetSN {

	public static void main(String[] args) {
 
                // Create a TreeSet to store unique student names in sorted order
		Set<String> StudentNames=new TreeSet<>();

                // Add student names to the TreeSet, which automatically eliminates duplicates and sorts the names
                StudentNames.add("Bhavana");
		StudentNames.add("Srinija");
		StudentNames.add("Akshaya");
		StudentNames.add("Bhavana");
		StudentNames.add("Sri varsha");
		
            // Print the unique and sorted student names in the TreeSet
	    System.out.println("Unique and sorted Student Names:");
	    for(String name:StudentNames)
	    	System.out.println(name); 
	}

}
