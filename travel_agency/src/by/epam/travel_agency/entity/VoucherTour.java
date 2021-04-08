package by.epam.travel_agency.entity;

import by.epam.travel_agency.include_in_entity.*;

public class VoucherTour {
	private Country countrys;
	private String transport;
	private Meal meal;
	private int numberOfDays;
	private int price;

	public VoucherTour(Country countrys, String t, Meal meal, int numberOfDays, int p) {
		super();
		this.countrys = countrys;
		this.transport = t;
		this.meal = meal;
		this.numberOfDays = numberOfDays;
		this.price = p;
	}

	public VoucherTour() {

	}

	public Country getCountrys() {
		return countrys;
	}

	public void setCountrys(Country countrys) {
		this.countrys = countrys;
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
		result = prime * result + ((countrys == null) ? 0 : countrys.hashCode());
		result = prime * result + ((meal == null) ? 0 : meal.hashCode());
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
		VoucherTour other = (VoucherTour) obj;
		if (countrys == null) {
			if (other.countrys != null)
				return false;
		} else if (!countrys.equals(other.countrys))
			return false;
		if (meal == null) {
			if (other.meal != null)
				return false;
		} else if (!meal.equals(other.meal))
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
		return "Экскурсионный тур(Евротур) [Страны входящие в тур=" + countrys + ", Транспорт=" + transport
				+ ", Тип питания=" + meal + ", Количество дней=" + numberOfDays + ", Цена тура=" + price + "]";
	}

}
