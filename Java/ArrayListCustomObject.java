//ArrayListCustomObject
import java.util.ArrayList;
class Student{
	int id;
	String name;
	String course;
	Student(int id,String name, String course){
		this.id=id;
		this.name=name;
		this.course=course;
	}
}
public class Main{
	public static void main(String[] args){
		ArrayList<Student> list=new ArrayList<>();
		list.add(new Student(101,"Raj","CSE"));
		list.add(new Student(102,"Amit","ECE"));
		System.out.println("Student Details: ");
		//for-each loop
		for(Student s:list){
			System.out.println(s.id+"-"+s.name+"-"+s.course);
		}
	}
}