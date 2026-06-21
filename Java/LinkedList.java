//LinkedList
import java.util.LinkedList;
public class Main{
	public static void main(String[] args){
		LinkedList<String> fruits=new LinkedList<String>();
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("orange");
		
		//addfirst([element to be inserted]): insert element at beginning
		fruits.addFirst("grapes");
		System.out.println(fruits);

		//addlast([element to be inserted]): insert element at last of list
		fruits.addLast("mango");
		System.out.println(fruits);

		//removeFirst(): remove 1st element
		fruits.removeFirst();
		System.out.println(fruits);

		//removeLast(): remove last element
		fruits.removeLast();
		System.out.println(fruits);

	}
}