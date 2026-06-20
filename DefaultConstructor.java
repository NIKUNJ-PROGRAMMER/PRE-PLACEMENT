//Default Constructor
class Student{
	Student(){//same name as class
		System.out.println("Default Constructor called");
	}
}
class Main{
	public static void main(String[] args){
		Student s=new Student();//constructor automatically runs
	}
}
