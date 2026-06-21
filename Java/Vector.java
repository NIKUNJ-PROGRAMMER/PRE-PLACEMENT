//Vector
import java.util.*;
public class Main{
	public static void main(String[] args){
		//Vector with capacity 2
		Vector<String> v=new Vector<String>(2);
		//add({element}): add item
		v.add("Ayush");
		v.add("Amit");

		//capacity(): tell capacity of vector
		System.out.println("Initial Capacity: "+v.capacity());

		//add(int index,element): add element at specific index
		v.add(2,"Rahul");//Trigger resize(2->4[doubles])
		System.out.println("Current Capacity: "+v.capacity());

		//remove([element]):remove particular element if it is present
		v.remove("Ayush");

		//remove([int index]): remove element at particular index
		v.remove(0);

		
	}
}