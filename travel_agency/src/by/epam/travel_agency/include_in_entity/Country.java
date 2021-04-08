package by.epam.travel_agency.include_in_entity;

import java.util.ArrayList;
import java.util.List;

public class Country {
	private List<String> countrys;
	{
		countrys = new ArrayList<String>();

	}

	public Country() {

	}

	public void addCountry(String country) {
		countrys.add(country);
	}

	public List<String> getCountrys() {
		return countrys;
	}

	public void setCountrys(List<String> countrys) {
		this.countrys = countrys;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((countrys == null) ? 0 : countrys.hashCode());
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
		Country other = (Country) obj;
		if (countrys == null) {
			if (other.countrys != null)
				return false;
		} else if (!countrys.equals(other.countrys))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "" + countrys + "";
	}

}
