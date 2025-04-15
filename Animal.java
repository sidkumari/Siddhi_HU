package Assignments;

public class Animal {  
	//declaring data members as private
	private String name;
	private String breed;
	private int age;
	
	//constructor
	public Animal(String name, String breed, int age) {
		this.name=name;
		this.breed=breed;
		this.age=age;
	}
	
	//Method to Print informations 
	public void getinformation() {
		System.out.println("Name of animal: "+name);
		System.out.println("Breed of animal: "+breed);
		System.out.println("Age of animal: "+age);
	}
	
	//main method
	public static void main(String args[]) {
		//creating object of Animal class
		Animal a1=new Animal("Tom", "Cat", 3);
		a1.getinformation();
	}

}
