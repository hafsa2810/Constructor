package test;


public class Employee {
	
	public Employee() {
		System.out.println("Default");
	}
     public Employee(int age) {
    	 this();
	 System.out.println("Employee age: " +age );
 } 
	 public Employee(String name) {
		this(34);
		 System.out.println("Employee name : "+name);
		
	}
	 public Employee(long phno) {
		 this("syed");
		 System.out.println("Employee phno : "+phno);
	}
            
    public static void main(String[] args) {
		Employee e = new Employee(45);
		Employee e1 = new Employee("syed");
		Employee e2 = new Employee(83642356);
	}	
	}
