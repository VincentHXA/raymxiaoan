package model.restaurant;

import model.customer.ShoppingCartVisitor;
import model.user.Customer;
import model.user.Restaurant;

public class StandardMealOrder extends MealOrder {
	public StandardMealOrder(Customer customer, Restaurant restaurant, Meal meal) {
		super(customer, restaurant, meal);
	}

	@Override
	public double accept(ShoppingCartVisitor visitor) {
		// TODO Auto-generated method stub
		return 0;
	}
}
