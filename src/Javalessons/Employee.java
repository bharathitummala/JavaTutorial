package Javalessons;

public class Employee {
	String name;
	int age;

	public void EmployeeOne(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {
		Employee employeeDetails = new Employee();
		employeeDetails.name = "Satish";
		employeeDetails.age = 35;
		System.out.println(employeeDetails.name);
		System.out.println(employeeDetails.age);
	}
}
