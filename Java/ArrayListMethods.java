//ArrayListMethods
import java.util.*;
class Demo{
	public static void main(String[] args){
		//ArrayList object list that will store strings
		ArrayList<String> list=new ArrayList<>();
		//ArrayList: class name,<String>: Primitve Data Type

		//.add(): used to insert data
		list.add("JAVA");
		list.add("Python");
		list.add("C++");

		//.add([index],element): add in specific postion
		list.add(0,"metro");

		//.get([index]): access an item
		System.out.println(list.get(0));

		//.set([index],[element to change into]): change an item
		list.set(0,"train");

		//.remove([index]): remove an item
		list.remove(0);

		//.size(): size of ArrayList
		System.out.println(list.size());

		//collections.sort([object]): sort an ArrayList
		list.sort(Comparator.naturalOrder());

		//.contains([element]): search for an element and return BOOLEAN result
		list.contains("train");
		
		//isEmpty(): check if arraylist is empty, return boolean
		list.isEmpty();

		//indexOf(): Search a specified element and return it's index
		int pos = list.indexOf("train");
		System.out.println("index of train: "+pos);

		//Traversing list through Iterator
		Iterator itr=list.iterator();

		//.hasNext() checks if there is anything at the next index
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		System.out.println(list);//can be printed at once without iterator

		//clear method
		list.clear();
	}
}