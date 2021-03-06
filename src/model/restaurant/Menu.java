package model.restaurant;

import java.util.ArrayList;
import java.util.Arrays;


public class Menu {

	private ArrayList<Starter> starters;
	private ArrayList<MainDish> maindishes;
	private ArrayList<Dessert> desserts;

	public Menu() {
		super();
		starters = new ArrayList<Starter>();
		maindishes = new ArrayList<MainDish>();
		desserts = new ArrayList<Dessert>();
		initMenu();
	}
	
	public ArrayList<Starter> getStarters() {
		return starters;
	}

	public ArrayList<MainDish> getMaindishes() {
		return maindishes;
	}

	public ArrayList<Dessert> getDesserts() {
		return desserts;
	}

	public ArrayList<Dish> getDishes(){
		ArrayList<Dish> list = new ArrayList<Dish>();
		list.addAll(getStarters());
		list.addAll(getMaindishes());
		list.addAll(getDesserts());
		return list;
	}
	
	
	
	public void initMenu(){
		
		starters.add(new Starter("foie gras", "standard", 1.5));
		starters.add(new Starter("salade", "standard", 1.5));
		maindishes.add(new MainDish("poulet", "standard", 1.5));
		maindishes.add(new MainDish("poisson", "standard", 1.5));
		desserts.add(new Dessert("glace", "standard", 1.5));
		desserts.add(new Dessert("cafe", "standard", 1.5));
	}
	
	public void addDish(Dish dish){
		if (dish instanceof Starter){
			starters.add((Starter)dish);}
		if (dish instanceof MainDish){
			maindishes.add((MainDish)dish);}
		if (dish instanceof Dessert){
			desserts.add((Dessert)dish);
		}
	}
	
	public void removeDish(String dishName){
		for(int i=0; i<starters.size(); i++){
			if( starters.get(i).getDishName() == dishName ){
				starters.remove(i);
			}
		}
		for(int i=0; i<maindishes.size(); i++){
			if( maindishes.get(i).getDishName() == dishName ){
				maindishes.remove(i);
			}
		}
		for(int i=0; i<desserts.size(); i++){
			if( desserts.get(i).getDishName() == dishName ){
				desserts.remove(i);
			}
		}
	}
	
	public boolean hasDish(String dishName){
		for (Dish dish : this.getDishes()) {
			if (dish.getDishName()==dishName){
				return true;
			}
		}
		return false;
	}
	
	public void display(){
		System.out.println("\nMenu:");
		System.out.println("Starters: " +this.getStarters());
		System.out.println("Main-dishes: " +this.getMaindishes());
		System.out.println("Desserts: " +this.getDesserts());
	}
	
}
