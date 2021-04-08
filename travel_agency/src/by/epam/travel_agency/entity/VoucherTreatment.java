package by.epam.travel_agency.entity;

import by.epam.travel_agency.include_in_entity.*;

public class VoucherTreatment {

	private String country;
	private String transport;
	private String treatmentProfile;
	private TypeOfMeal meal;
	private int numberOfDays;
	private int price;

	public VoucherTreatment(String country, String transport, String profile, TypeOfMeal m, int n, int p) {
		super();
		this.country = country;
		this.transport = transport;
		this.treatmentProfile = profile;
		this.meal = m;
		this.numberOfDays = n;
		this.price = p;
	}

	public VoucherTreatment() {

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

	public String getTreatmentProfile() {
		return treatmentProfile;
	}

	public void setTreatmentProfile(String treatmentProfile) {
		this.treatmentProfile = treatmentProfile;
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
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((meal == null) ? 0 : meal.hashCode());
		result = prime * result + numberOfDays;
		result = prime * result + price;
		result = prime * result + ((transport == null) ? 0 : transport.hashCode());
		result = prime * result + ((treatmentProfile == null) ? 0 : treatmentProfile.hashCode());
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
		VoucherTreatment other = (VoucherTreatment) obj;
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
		if (numberOfDays != other.numberOfDays)
			return false;
		if (price != other.price)
			return false;
		if (transport == null) {
			if (other.transport != null)
				return false;
		} else if (!transport.equals(other.transport))
			return false;
		if (treatmentProfile == null) {
			if (other.treatmentProfile != null)
				return false;
		} else if (!treatmentProfile.equals(other.treatmentProfile))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Тур с оздоровлением [Страна=" + country + ", Транспорт=" + transport + ", Оздоровительный профиль="
				+ treatmentProfile + ", Тип питания=" + meal + ", Количество дней=" + numberOfDays + ", Цена тура="
				+ price + "]";
	}
}
