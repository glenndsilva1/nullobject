package nonull;

public class AnimalFactory {
	public static final String[] names = {"Tommy", "Lucy"};
	public static Animal getAnimal(String name){
		for (int i = 0; i < names.length; i++) {
			if(names[i].equalsIgnoreCase(name)){
				return new Dog(name);
			}
		}
		return new NullAnimal();
	}
	
	public static void main(String[] args) {
		Animal dog = AnimalFactory.getAnimal("Tommy");
		Animal cat = AnimalFactory.getAnimal("NULL");
		System.out.println("Animal's Sound");
		dog.makeSound();
		cat.makeSound();
	}
}
