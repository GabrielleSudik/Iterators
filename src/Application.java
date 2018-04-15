import java.util.Iterator;
import java.util.LinkedList;


public class Application {

	public static void main(String[] args) {
		
		//Iterable interface
		
		LinkedList<String> animals = new LinkedList<String>();

		animals.add("fox");
		animals.add("cat");
		animals.add("dog");
		animals.add("rabbit");
		
		//the foreach loop only became a thing in java 5:
		for(String animal: animals){
			System.out.println(animal);
		}
		
		//before that, one used iteration:
		Iterator<String> it = animals.iterator();
		
		//this just prints what "it" is:
		System.out.println(it);
		
		//this loop will run while the list has another item
		//then goes through each item, using "next"
		//then prints them
		while (it.hasNext()){
			String eachAnimal = it.next();
			System.out.println(eachAnimal);
			
			//this still prints cat, because that line of code was first
			//but when you do the foreach again below
			//cat will be gone.
			if(eachAnimal.equals("cat")){
				it.remove();
			}
		}
		
		//when run again, after cat is .remove, cat is missing
		for(String animal: animals){
			System.out.println(animal);
		}
		//you can't use a foreach loop to remove items
		//so iteration is still useful.
		
		//you can add items in the while loop using "listiterator"
		
	}

}
