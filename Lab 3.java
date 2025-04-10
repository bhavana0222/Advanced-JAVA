//Create a program to calculate the annual salary of an employee by using inheritance.
public class User {
	int  id;
	String name;
	//parameterized constructor
	public User(int id, String name) {
		this.id = id;
		this.name = name;
	}
	static class Employee extends User{
		 private double salary;
         public Employee(int id, String name,double salary) 
         {
			super(id, name);//calls the constructor of the user class
			this.salary=salary;	
		 }	
         double  calculateAnnualSalary()
         {
        	 return salary *12;//annual salary is 12 times the monthly salary
         }
         //getter methods
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
	}
	public static void main(String[] args) {
	
		Employee emp=new Employee(6628,"Bhavana",30000);
		emp.calculateAnnualSalary();
		System.out.println("Employee ID:"+emp.id+"\nEmployee Name:"+emp.name+"\nEmployee Salary:"+emp.getSalary());
		System.out.println("Annual Salary:"+emp.calculateAnnualSalary());
	}
}


//Write a program to check leap year using if else.
public class LeapYear {
	
	void isLeapYear(int year)
	{
	//Year is a leap year if it is divisible by 4,but not by 100,unless is is also divisible by 400
		if(year%4==0 && year%100!=0 || year%400==0)
		{
			System.out.println(year+" is a Leap Year");
		}
		else
		{
			System.out.println(year+" not a Leap Year");
		}
	}
	public static void main(String args[])
	{
		int year=2004;
		LeapYear ly=new LeapYear();
		ly.isLeapYear(2024);
	}
}