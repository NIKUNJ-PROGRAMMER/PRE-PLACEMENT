//MultipleInheritance
//using Interface
interface A{
	default void display(){
		System.out.println("Interface A Display");
	}
}
interface B{
	default void display(){
		System.out.println("Interface B Display");
	}
}
class C implements A, B{
	public void display(){
		A.super.display();
		B.super.display();
		System.out.println("Class C display");
	}
}
public class Main{
	public static void main(String[] args){
		C obj=new C();
		obj.display();
	}
}
//Output:
//Interface A Display
//Interface B Display
//Class C display