package by.epam.travel_agency.include_in_entity;

import java.util.ArrayList;
import java.util.List;

public class TypeOfMeal {
	
	private List<Meal> meals;
	
	{
		meals = new ArrayList<Meal>();

	}

	public TypeOfMeal() {

	}

	public void addMeal(Meal meal) {
		meals.add(meal);
	}

	public List<Meal> getMeals() {
		return meals;
	}

	public void setMeals(List<Meal> meals) {
		this.meals = meals;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((meals == null) ? 0 : meals.hashCode());
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
		TypeOfMeal other = (TypeOfMeal) obj;
		if (meals == null) {
			if (other.meals != null)
				return false;
		} else if (!meals.equals(other.meals))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return " " +meals ;
	}

}
