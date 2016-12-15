package p2;

//Polymorphism over loading with inheritance

class Student 
{
	String firstname,lastname;
	int age;
	String course;
	int studid;
}
class Employee extends Student
{
	int salary;
	String deptname;
	String designation;
	int Empid;
	public void ShowEm()
	{
		firstname="Melinda";
		lastname="Sunaina";
		age=23;
		salary=25000;
		deptname="Amazon";
		designation="CS";
		Empid=12;
		System.out.println("fist name is "+firstname);
		System.out.println("lastname is "+lastname);
		System.out.println("age is "+age);
		System.out.println("salary is "+salary);
		System.out.println("dept name is "+deptname);
		System.out.println("designation is "+designation);
		System.out.println("employee is "+Empid);

		
	}
}
public class EmployeeDetails {
	

	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.ShowEm();

	}

}
