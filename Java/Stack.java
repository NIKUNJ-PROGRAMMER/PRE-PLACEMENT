//Stack
import java.util.*;
public class Main{
	public static void main(String[] args){
		Stack<String> stack=new Stack<String>();
		
		//push: add element to stack
		stack.push("Ayush");
		stack.push("Aman");
		stack.push("Aryan");
		stack.push("Aakash");
		stack.push("Archana");
		
		Iterator<String> itr=stack.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}