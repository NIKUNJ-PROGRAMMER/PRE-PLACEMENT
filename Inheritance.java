//Inheritance

class Animal{
	void eat(){
		System.out.println("Animal eat food.");
	}
}

//single inheritance
class Dog extends Animal{
	void sound(){
		System.out.println("Dog barks.");
	}
}

//multilevel inheritance : animal->dog->bulldog
class BullDog extends Dog{
	void power(){
		System.out.println("Bull Dog is Strong.");
	}
}


//hierarchical inheritance: animal->dog,cat
class Cat extends Animal{
	void sound(){
		System.out.println("Cat meows");
	}
}
// --- MAIN CLASS ---
public class Main {
    public static void main(String[] args) {
        
        System.out.println("--- Testing Single Inheritance ---");
        Dog myDog = new Dog();
        myDog.eat();   // Inherited from Animal
        myDog.sound(); // Method from Dog

        System.out.println("\n--- Testing Multilevel Inheritance ---");
        BullDog myBullDog = new BullDog();
        myBullDog.eat();   // Inherited all the way from Animal
        myBullDog.sound(); // Inherited from Dog
        myBullDog.power(); // Method from BullDog
        
        System.out.println("\n--- Testing Hierarchical Inheritance ---");
        Cat myCat = new Cat();
        myCat.eat();   // Inherited from Animal (just like Dog did)
        myCat.sound(); // Method from Cat
    }
}