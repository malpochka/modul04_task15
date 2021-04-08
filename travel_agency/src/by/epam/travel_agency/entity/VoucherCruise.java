package by.epam.travel_agency.entity;

import by.epam.travel_agency.include_in_entity.*;

public class VoucherCruise {

	private String name;
	private String route;
	private String transport;
	private TypeOfMeal meal;
	private int numberOfDays;
	private int price;

	public VoucherCruise(String name, String route, String transport, TypeOfMeal meal, int numberOfDays, int price) {
		super();
		this.name = name;
		this.route = route;
		this.transport = transport;
		this.meal = meal;
		this.numberOfDays = numberOfDays;
		this.price = price;
	}

	public VoucherCruise() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRoute() {
		return route;
	}

	public void setRoute(String route) {
		this.route = route;
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
		result = prime * result + ((meal == null) ? 0 : meal.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + numberOfDays;
		result = prime * result + price;
		result = prime * result + ((route == null) ? 0 : route.hashCode());
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
		VoucherCruise other = (VoucherCruise) obj;
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
		if (route == null) {
			if (other.route != null)
				return false;
		} else if (!route.equals(other.route))
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
		return "Круиз [Название круиза=" + name + ", Маршрут=" + route + ", \r" + "Транспорт=" + transport
				+ ", Тип питания=" + meal + ", Количество дней=" + numberOfDays + ", Цена круиза=" + price + "]";
	}

}
