package Oops_java_programming_Feb_7th;

public class Animal {

	
	// identity (name)
		// state (breed, color, age)
		// behavior (barking, sleeping, eating)
	
	String name = "Marcus";
	String vread = "Lebrador";
	int age = 5;
	String color = "farm";
	
	public static void main (String[] args) {
		
		Animal dog = new Animal();
		System.out.println("dog.name");
		System.out.println("dog.age");
		System.out.println("dog.bread");
		
		dog.barking();
		dog.eating();
		// dog.sleeping();
		sleeping();

		Birds barry1 = new Birds();
		barry1.speaking();
		barry1.flying();
		barry1.nameBird = "Pet";
	}
	 public void barking() {
		 System.out.println("Marcus barking");
		 
	 }
	 public void eating() {
		 System.out.println("Marcus eats");
	 }
	 public static void sleeping() {
		 System.out.println("Marcus sleep");
	 }

}
class Birds {

	String nameBird;

	public void flying() {
		System.out.println("Parrot flies");
	}

	public void speaking() {
		System.out.println("Parrot speaks");
	}
}