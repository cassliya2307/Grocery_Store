
def add_to_grocery_cart(name_of_item, grocery_cart = []):
	if type(name_of_item) == str:
		grocery_cart.append(name_of_item)
	else:
		raise TypeError("Invalid Input")

	return "The item has been added"
def remove_grocery_from_cart(name_of_item , grocery_cart):
	if grocery_cart != [] :
		if type(name_of_item) == str:
			grocery_cart.remove(name_of_item)
		else:
			raise TypeError("Invalid Input")
		return "The item has been removed"
	else: 
		return "No items added yet that can be removed"

		
def show_available_groceries_in_cart(grocery_cart = []):
	if grocery_cart == []:
		return "No items added yet"
	
	else:
		for items in grocery_cart:
			print(items)
	return "Thanks For Shopping" 
		