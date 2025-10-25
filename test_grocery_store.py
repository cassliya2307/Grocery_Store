import unittest
from grocery_store_functions import*
class TestGroceryStore(unittest.TestCase):

	def test_if_they_can_add_groceries(self):
		actual = add_to_grocery_cart("milk" , [])
		expected = "The item has been added"
		self.assertEqual(actual, expected)


	def test_if_they_can_remove_items_from_cart(self):
		actual = remove_grocery_from_cart("milk", ["milk"])
		expected = "The item has been removed"
		self.assertEqual(actual, expected)



	def test_if_the_cart_is_originally_Empty_if_you_have_not_added_anything(self):
		actual = show_available_groceries_in_cart([])
		expected = "No items added yet"
		self.assertEqual(actual, expected)


	def test_if_they_can_remove_when_they_have_not_added(self):
		actual = remove_grocery_from_cart("milk", [])
		expected = "No items added yet that can be removed"
		self.assertEqual(actual, expected)


	def test_if_the_groceries_are_being_store(self):
		actual = show_available_groceries_in_cart(["milk" , "meat"])
		expected = "Thanks For Shopping"
		self.assertEqual(actual, expected)

	
	def test_for_wrong_input_in_add_grocery(self):
		wrong_input_1 = 1.3
		wrong_input_2 = 9
		self.assertRaises(TypeError , wrong_input_1, wrong_input_2)

	
	def test_for_wrong_input_in_remove_item(self):
		wrong_input_1 = 1.3
		wrong_input_2 = 9

		self.assertRaises(TypeError , wrong_input_1, wrong_input_2)
		
	
	



			