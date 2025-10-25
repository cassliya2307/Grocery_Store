import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class GroceryStoreTest{

	@Test
	public  void testThatGroceryCartIsEmpty(){
	
	//Arrange
		GroceryStore groceryStore = new GroceryStore();
	//Act
	int actual = groceryStore.groceryCart();
		
	//Assert	
	assertEquals(actual, 0);
	
	}

	@Test
	public void testThatAnItemCanBeAddedToTheCart(){
	GroceryStore groceryStore = new GroceryStore();
	
	String result =  groceryStore.addToCart("milk");

	//ASSERT
	assertEquals(result, "item added successfully");


	}


	@Test
	public void testThatOneItemHaveBeenAddedToTheCartAndTheTotalIsOne(){
	GroceryStore groceryStore = new GroceryStore();
	 groceryStore.addToCart("milk");
		int result =  groceryStore.groceryCart();
		assertEquals(result, 1);


	}

	@Test
	public void testThatYouCanAddTwoITemsToTheCart(){
		GroceryStore groceryStore = new GroceryStore();

		 groceryStore.addToCart("fish");
		 groceryStore.addToCart("yam");
		int result =  groceryStore.groceryCart();
		assertEquals(result, 2);


	

	}



	@Test
	public void testThatItemCanBeRemoveFromTheCart(){
		GroceryStore groceryStore = new GroceryStore();

		 groceryStore.addToCart("Tomatoes");
		 groceryStore.removeFromCart("milk");
		 String result =  groceryStore.removeFromCart("milk");
		 assertEquals(result, 0);
	}



	@Test
	public void testThatOnlyItemsInTheCartCanBeRemove(){
		GroceryStore groceryStore = new GroceryStore();

		 groceryStore.addToCart("milk");
		String result =  groceryStore.removeFromCart("cake");
		assertEquals(result, "Item not found");


	}


	@Test
	public void testThatYouCanViewItemsInTheGroceryList(){
		GroceryStore groceryStore = new GroceryStore();

		 groceryStore.addToCart("Tomatoes");
		
		ArrayList <String> result =  groceryStore.showItemsInCart();
		assertEquals(result, 1);


	}



}

	