//abstract class
abstract class Animal{
	//abstract method(no body)
	abstract void sound();
	//normal method(has body)
	void sleep(){
		System.out.println("Animal is sleeping.");
	}
}
// Subclass extends abtract class
class Dog extends Animal{
	void sound(){
		System.out.println("Dog barks: WoofWoof!");
	}
}
public class Main{
	public static void main(String[] args){
		//we cannot create object of abstract class
		//Animal obj=new Animal();//not allowed
		Dog d=new Dog();
		d.sound();//calling abstract method implementation
		d.sleep();//calling normal method
	}
}