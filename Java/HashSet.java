//HashSet
// HashSet Operations and Methods Example
import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        // Creating an empty HashSet of String entities
        HashSet<String> hs = new HashSet<String>();
        
        System.out.println("--- 1. Adding Elements ---");
        // add(E e): Used to add the specified element if it is not present
        hs.add("Apple");
        hs.add("Mango");
        hs.add("Banana");
        hs.add("B"); 
        
        // If it is present, add() returns false
        boolean isAdded = hs.add("Apple");
        System.out.println("Was duplicate 'Apple' added? " + isAdded);
        System.out.println("Initial HashSet: " + hs);
        
        System.out.println("\n--- 2. Checking HashSet State ---");
        // size(): Used to return the size of the set
        System.out.println("Size of HashSet: " + hs.size());
        
        // isEmpty(): Returns true for empty and false for a non-empty condition
        System.out.println("Is HashSet empty? " + hs.isEmpty());
        
        // contains(Object o): Used to return true if an element is present
        System.out.println("Contains 'Mango'? " + hs.contains("Mango"));
        System.out.println("Contains 'Z'? " + hs.contains("Z"));
        
        System.out.println("\n--- 3. Removing Elements ---");
        // remove(Object o): Used to remove the element if it is present
        hs.remove("B");
        System.out.println("HashSet after removing 'B': " + hs);
        
        // Returns false if the element is not present
        System.out.println("'B' exists to remove again? " + hs.remove("B"));
        
        System.out.println("\n--- 4. Traversing through Iterator ---");
        // iterator(): Used to return an iterator over the elements in the set
        Iterator<String> itr = hs.iterator();
        System.out.print("Elements via Iterator: ");
        while(itr.hasNext()){
            System.out.print(itr.next() + "  ");
        }
        System.out.println(); // Just moving to the next line
        
        System.out.println("\n--- 5. Cloning the HashSet ---");
        // clone(): Used to create a shallow copy of the set
        // Note: clone() returns an Object, so we must cast it to HashSet<String>
        @SuppressWarnings("unchecked")
        HashSet<String> clonedSet = (HashSet<String>) hs.clone();
        System.out.println("Cloned HashSet: " + clonedSet);
        
        System.out.println("\n--- 6. Clearing the HashSet ---");
        // clear(): Used to remove all the elements from the set
        hs.clear();
        System.out.println("Original HashSet after clear() : " + hs);
        System.out.println("Is original HashSet empty now? " + hs.isEmpty());
    }
}