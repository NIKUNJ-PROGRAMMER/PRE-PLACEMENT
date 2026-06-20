//ConstructorOverloading
//same class, same name, differ in number, type, order of parameter
class Student{
	String name;
	int age;
	Student(){//default
		name="Unknown";
		age=0;
	}
	Student(String n){//parameterized constructor with only 1 parameter
		name=n;
		age=0;
	}
	Student(String n;int a){//parameterized constructor with only 2 parameter
		name=n;
		age=a;
	}
	void display(){//method
		System.out.println(name+" "+age);
	}
}
class Main{
	public static void main(String[] args){
		Student s1=new Student();
		Student s2=new Student("Nehul");
		Student s3=new Student("Priyal",15);
		s1.display();
		s2.display();
		s3.display();
	}
}