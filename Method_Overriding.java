//Method_Overriding
//Run Time executing polymorphism
//different class(inheritance required), same method name and return type
//access level cannot be more restrictive than overridden method
class Animal{
	void sound(){
		System.out.println("Animal makes a sound");
	}
}
class Dog extends Animal{
	@Override
	void sound(){
		System.out.println("Dog Barks");
	}
}
public class OverridingExaple{
	public static void main(String[] args){
		Animal a=new Animal();
		Animal b=new Dog();//Upcasting
		a.sound();
		b.sound();
	}
}