import java.util.Scanner;

public class Main {

	private static Scanner scanner = new Scanner(System.in);
	private static GroceryList groceryList = new GroceryList();
	public static void main(String[] args) {
		boolean quit =false;
		int choice = 0;
		printInstructions();
		while(!quit) {
			System.out.println("Enter your choice");
			choice = scanner.nextInt();
			scanner.nextInt();
			switch(choice) {
			case 0:
				printInstructions();
				break;
				case 1:
					groceryList.printGroceryList();
					break;
				case 2:
					
					System.out.println("enter your staff the add");
					String str = scanner.nextLine();
					scanner.nextLine();
					groceryList.addGroceryItem(str);
					break;
				case 3:
					System.out.println("what you want modify");
					int pos = scanner.nextInt();
					scanner.nextInt();
					System.out.println("what you want to add instead of " + pos);
					String change = scanner.nextLine();
					scanner.nextLine();
					groceryList.modifyGroceryItem(pos, change);
					break;
				case 4:
					System.out.println("Which one would you like to remove");
					int pos1 = scanner.nextInt();
					scanner.nextInt();
					groceryList.removeGroceryItem(pos1);
					break;
				case 5:
					System.out.println("Which one would you like to find");
					String find = scanner.nextLine();
					scanner.nextLine();
					groceryList.findItem(find);
					break;
				case 6:
					quit=true;
					break;
				default:
					System.out.println("Start Over");
			}
		}

	}
	private static void printInstructions() {
		System.out.println("Go and shopping to the mall.");
		
	}

}
