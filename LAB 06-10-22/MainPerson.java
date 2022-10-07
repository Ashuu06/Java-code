package lab5;

public class MainPerson {

	public static void main(String[] args) {
		Student student = new Student(101, "Ashutosh Mishra", 97);
		Employee employee = new Employee(202, "Abhijeet Mishra", 50000);
		System.out.println(student.toString());
		System.out.println(employee.toString());

	}
}
