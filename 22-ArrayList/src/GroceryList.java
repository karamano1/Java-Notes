import java.util.*;

public class GroceryList {
	//List groceryList = new ArrayList();
	List<String>groceryList = new ArrayList<String>();
	public void addGroceryItem(String item) {
		groceryList.add(item);
	}
	public void printGroceryList() {
		//System.out.println("You have "+groceryList.size() + " items in your grocery list");
		for(int i=0;i<groceryList.size();i++) {
			System.out.println((i++)+"."+groceryList.get(i));
	}
		System.out.println("You have "+groceryList.size() + " items in your grocery list");
	}
	public void modifyGroceryItem(int position,String newItem) {
		groceryList.set(position, newItem);
	}
	public void removeGroceryItem(int position) {
		String theItem = groceryList.get(position);
		groceryList.remove(position);
		
	}
	public String findItem(String searchItem) {
		//boolean exists = groceryList.contains(searchItem);
		int position = groceryList.indexOf(searchItem);
		if(position>=0) {
			return groceryList.get(position);
		}
		return null;
	}
	
}
