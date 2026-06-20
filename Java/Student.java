//Student
class Student {
	//Properties(variables)
	String name;
	int age;
	//Behaviour(method)
	void displayInfo() {
		System.out.println("Student name: "+name);
		System.out.println("Student age: "+age);
	}
}
//Main class to create objects
public class Main {
	public static void main(String[] args){
		Student s1= new Student();//Creating an object of Student class
		s1.name="ABC";
		s1.age=21;
		s1.displayInfo();
	}
}
