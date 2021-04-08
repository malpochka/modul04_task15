package by.epam.travel_agency.entity;

import by.epam.travel_agency.include_in_entity.TypeOfMeal;

public class VoucherRest {

	private String country;
	private String transport;
	private TypeOfMeal meal;
	private int numperOfDays;
	private int price;

	public VoucherRest(String country, String transport, TypeOfMeal m, int numperOfDays, int price) {
		super();
		this.country = country;
		this.transport = transport;
		this.meal = m;
		this.numperOfDays = numperOfDays;
		this.price = price;
	}

	public VoucherRest() {

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

	public TypeOfMeal getMeal() {
		return meal;
	}

	public void setMeal(TypeOfMeal meal) {
		this.meal = meal;
	}

	public int getNumperOfDays() {
		return numperOfDays;
	}

	public void setNumperOfDays(int numperOfDays) {
		this.numperOfDays = numperOfDays;
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
		result = prime * result + price;
		result = prime * result + numperOfDays;
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
		VoucherRest other = (VoucherRest) obj;
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
		if (price != other.price)
			return false;
		if (numperOfDays != other.numperOfDays)
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
		return "Пляжный отдых [Страна=" + country + ", Транспорт=" + transport + ", Тип питания=" + meal + ", Количество дней="
				+ numperOfDays + ", Цена тура=" + price + "]";
	}

}
