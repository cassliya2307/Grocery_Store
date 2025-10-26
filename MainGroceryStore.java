import java.util.Scanner;
public class MainGroceryStore{

public static void main(String... args){

Scanner scanner = new Scanner(System.in);
String main = """

~Welcome To Blonwell's Grocery Store~
Meat       =>Sausage|Ground Beef|Stake|Chicken Wings|Chicken Thigh
Dairy      =>Milk   | Eggs      |Cheese      | Goat Milk| Whole Cream
Beverages => Wine   | Whiskey   |Coffee      | Tea      | Pepsi
Sea Food  => Salmon | Prawn     | Octopus    | Crabs    | Lobsters
Snacks    => Chips  | Chocolate | Candy      | Crackers | Cereal

Operations
1. Add to cart
2. Remove from cart
3. Show all items
0. to end
""";
GroceryStore groceryStore = new GroceryStore();
boolean loop = true;

while(loop){
	System.out.println(main);
	System.out.print("Enter an operation: ");
	String operation = scanner.nextLine();
	

switch(operation){
	case "1"->{System.out.print("Add an item: ");
		String item = scanner.nextLine();
		System.out.println(groceryStore.addToCart(item));	
	
		}

	case "2"->{

		System.out.print("Remove an item: ");
		String item = scanner.nextLine();
		System.out.println(groceryStore.removeFromCart(item));
		

		}

	case "3"->{
		
		System.out.println(groceryStore.showItemsInCart());

		}



	case "0"->{loop = false;
			System.out.println("Thank you for shopping at blonwell's");
		


}

	default ->{System.out.println("Operation not fount");
}	





}
	
	


}











}








}