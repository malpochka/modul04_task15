package by.epam.travel_agency.entity;

import by.epam.travel_agency.include_in_entity.Meal;

public class WeekendTour {

	private String name;
	private String country;
	private String transport;
	private Meal meal;
	private int numberOfDays;
	private int price;

	public WeekendTour(String name, String country, String transport, Meal meal, int numberOfDays, int price) {
		super();
		this.name = name;
		this.country = country;
		this.transport = transport;
		this.meal = meal;
		this.numberOfDays = numberOfDays;
		this.price = price;
	}

	public WeekendTour() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getTransport() {
		return transport;
	}

	public void setTransport(String transport) {
		this.transport = transport;
	}

	public Meal getMeal() {
		return meal;
	}

	public void setMeal(Meal meal) {
		this.meal = meal;
	}

	public int getNumberOfDays() {
		return numberOfDays;
	}

	public void setNumberOfDays(int numberOfDays) {
		this.numberOfDays = numberOfDays;
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
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((meal == null) ? 0 : meal.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + numberOfDays;
		result = prime * result + price;
		result = prime * result + ((transport == null) ? 0 : transport.hashCode());
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
		WeekendTour other = (WeekendTour) obj;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (meal == null) {
			if (other.meal != null)
				return false;
		} else if (!meal.equals(other.meal))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (numberOfDays != other.numberOfDays)
			return false;
		if (price != other.price)
			return false;
		if (transport == null) {
			if (other.transport != null)
				return false;
		} else if (!transport.equals(other.transport))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Минитур [Название=" + name + ", Страна=" + country + ", Транспорт=" + transport + ", Тип питания="
				+ meal + ", Количество дней=" + numberOfDays + ", Цена тура=" + price + "]";
	}

}
