
public class Dog {
	public String name;
	public int age;
	public String breed;
	public String color;
	//other option strating with this
	public Dog(){
		name="bulldoggg";
		age=12;
		breed ="kurt";
		color="white";
	}
	public Dog(int age,String name,String breed,String color) {
		this.age=age;
		this.name=name;
		this.breed=breed;
		this.color=color;
		
	}
	public void bark() {
		System.out.println(name + " is barking");
	}
	public void eat() {
		System.out.println(name + " is eating");
	}
	public void wagTail() {
		System.out.println(name + " is wagging tail");
	}
	
}
