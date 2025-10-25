import java.util.ArrayList;

public class GroceryStore{

	ArrayList <String> groceryCart = new ArrayList <String>();


public  int groceryCart(){
		return groceryCart.size();


	}




public  String addToCart(String items){
	groceryCart.add(items);
	String result = "item added successfully";
	return result;


	}


public  String removeFromCart(String items){
	for (String item : groceryCart){
	if (!item.equalsIgnoreCase (items))
	return "Item not found";
	}
	
	groceryCart.remove(items);
	String result = "item added successfully";
	return result;


	}



public  ArrayList <String> showItemsInCart(){
		
		return groceryCart;
	}





}