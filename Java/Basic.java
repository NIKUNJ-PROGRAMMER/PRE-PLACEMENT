//Basic

//class definition
class Student{
	//Attributes(Variable)
	String name;
	int rollNo;
	int marks;
	//Method to assign values
	void setDetails(String n,int r,int m){
		name=n;
		rollNo=r;
		marks=m;
	}
	//Method to display details
	void displayDetails(){
		System.out.println("Name:"+name);
		System.out.println("Roll No:"+rollNo);
		System.out.println("Marks:"+marks);
	}
}
//object creation and method calling
public class main{
	public static void main(String[] args){
		//Creating Objects
		Student s1=new Student();
		Student s2=new Student();
		//Calling methods using objects
		s1.setdetails("Rahul",101,85);
		s1.setdetails("Anita",102,92);
		//Display details
		s1.displayDetails();
		System.out.println("------------");
		s2.displayDetails();
	}
}
