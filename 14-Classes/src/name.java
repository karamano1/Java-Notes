
public class name {

	public static void main(String[] args) {
		Dog dog1 = new Dog();
		dog1.name="Bubbly";
		dog1.age = 5;
		dog1.breed="Poodle";
		dog1.color="White";
		System.out.println(dog1.name+":" +dog1.age+":" + dog1.breed+":"+dog1.color);
		dog1.bark();
		dog1.eat();
		dog1.wagTail();
		Dog2 dog = new Dog2();
		dog.name="Bubbly";
		dog.age = 5;
		dog.breed="Poodle";
		dog.color="White";
		System.out.println(dog.name+":" +dog.age+":" + dog.breed+":"+dog.color);
	}

}
