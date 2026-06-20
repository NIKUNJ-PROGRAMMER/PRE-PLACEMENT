//Parameterized Constructor
class Student{
	String name;
	int marks;
	Student(String n,int m){
		name=n;marks=m;
	}
}
class Main{
	public static void main(String[] args){
		Student s=new Student("Rahul",57);
	}
}
