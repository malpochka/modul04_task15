package by.epam.travel_agency.include_in_entity;

public class Meal {
	
	private String meals;
	private int price;

	public Meal(String meals, int price) {
		super();
		this.meals = meals;
		this.price = price;
	}

	public Meal() {

	}

	public String getMeals() {
		return meals;
	}

	public void setMeals(String meals) {
		this.meals = meals;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((meals == null) ? 0 : meals.hashCode());
		result = prime * result + price;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Meal other = (Meal) obj;
		if (meals == null) {
			if (other.meals != null)
				return false;
		} else if (!meals.equals(other.meals))
			return false;
		if (price != other.price)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return  meals + ": цена="  + price ;
	}

}
