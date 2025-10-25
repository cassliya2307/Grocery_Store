from grocery_store_functions import*


main = """

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

"""
grocery_cart = []
loop = True
while loop:
	print(main)
	operation = input("Enter and operation: ")

	match operation:
		case "1" :
			grocery = input("Add an item: ")
			print(add_to_grocery_cart(grocery, grocery_cart))


		case "2":
			grocery = input("Remove an item: ")
			print(remove_grocery_from_cart(grocery, grocery_cart))

	
		case "3":	
			print(show_available_groceries_in_cart(grocery_cart))


		case "0":
			print("Thanks for shopping and blonwell's")
			print("Be sure to visit again")
			loop = False

		case _: 
			print("Operation not available")
			