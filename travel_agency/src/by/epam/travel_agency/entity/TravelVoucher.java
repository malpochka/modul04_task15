package by.epam.travel_agency.entity;

import java.util.ArrayList;
import java.util.List;

public class TravelVoucher {
	
	private List<VoucherCruise> cruise;
	private List<VoucherRest> rest;
	private List<VoucherTour> tour;
	private List<VoucherTreatment> treatment;
	private List<WeekendTour> weekend;
	
	{
		cruise = new ArrayList<VoucherCruise>();
		rest = new ArrayList<VoucherRest>();
		tour = new ArrayList<VoucherTour>();
		treatment = new ArrayList<VoucherTreatment>();
		weekend = new ArrayList<WeekendTour>();
	}

	public TravelVoucher() {

	}

	public void addVoucherCruise(VoucherCruise cr) {
		cruise.add(cr);
	}

	public void addVoucherRest(VoucherRest r) {
		rest.add(r);
	}

	public void addVoucherTour(VoucherTour t) {
		tour.add(t);
	}

	public void addVoucherTreatment(VoucherTreatment t) {
		treatment.add(t);
	}

	public void addWeekendTour(WeekendTour w) {
		weekend.add(w);
	}

	public List<VoucherCruise> getCruise() {
		return cruise;
	}

	public void setCruise(List<VoucherCruise> cruise) {
		this.cruise = cruise;
	}

	public List<VoucherRest> getRest() {
		return rest;
	}

	public void setRest(List<VoucherRest> rest) {
		this.rest = rest;
	}

	public List<VoucherTour> getTour() {
		return tour;
	}

	public void setTour(List<VoucherTour> tour) {
		this.tour = tour;
	}

	public List<VoucherTreatment> getTreatment() {
		return treatment;
	}

	public void setTreatment(List<VoucherTreatment> treatment) {
		this.treatment = treatment;
	}

	public List<WeekendTour> getWeekend() {
		return weekend;
	}

	public void setWeekend(List<WeekendTour> weekend) {
		this.weekend = weekend;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cruise == null) ? 0 : cruise.hashCode());
		result = prime * result + ((rest == null) ? 0 : rest.hashCode());
		result = prime * result + ((tour == null) ? 0 : tour.hashCode());
		result = prime * result + ((treatment == null) ? 0 : treatment.hashCode());
		result = prime * result + ((weekend == null) ? 0 : weekend.hashCode());
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
		TravelVoucher other = (TravelVoucher) obj;
		if (cruise == null) {
			if (other.cruise != null)
				return false;
		} else if (!cruise.equals(other.cruise))
			return false;
		if (rest == null) {
			if (other.rest != null)
				return false;
		} else if (!rest.equals(other.rest))
			return false;
		if (tour == null) {
			if (other.tour != null)
				return false;
		} else if (!tour.equals(other.tour))
			return false;
		if (treatment == null) {
			if (other.treatment != null)
				return false;
		} else if (!treatment.equals(other.treatment))
			return false;
		if (weekend == null) {
			if (other.weekend != null)
				return false;
		} else if (!weekend.equals(other.weekend))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TravelVoucher [cruise=" + cruise + ", rest=" + rest + ", tour=" + tour + ", treatment=" + treatment
				+ ", weekend=" + weekend + "]";
	}

}
