package nonull;

public class NullAnimal implements Animal {
	@Override
	public void makeSound() {
		System.out.println("No Sound!!!");
	}

	@Override
	public boolean doNilSound() {
		return true;
	}
}
