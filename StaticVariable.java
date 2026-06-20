//StaticVariable
class Student{
int roll;//instance variable
String name;//instance variable
static String college="XYZ";//static variable: static(Keyword) [dataType] [variablename]=[data];
//parameterized constructor
Student(int r,string n){
rollno=r;
name=n;
}
//method to display information
void display(){
System.out.println(rollno+" "+name+" "+college);
}
}
public class Main{
public static void main(String[] args){
Student s1=new Student(11,"Karan");
Student s2=new Student(12,"Arjun");
s1.display();
s2.display();
}
}