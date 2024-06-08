package Constructor;

public class Animal {

	String name;

	public Animal(String name) {

		this.name = name;
	}
}

class Dog extends Animal {

	String breed;

	public Dog(String name, String breed) {
		super(name);
		this.breed = breed;
	}

	public void display() {
		System.out.println("Name: " + name + ", Breed : " + breed);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog("Buddy", "Golden Retriever");
		dog.display();
	}
}
