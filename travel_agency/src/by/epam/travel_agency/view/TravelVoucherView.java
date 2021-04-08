package by.epam.travel_agency.view;

import java.util.List;

import by.epam.travel_agency.entity.*;

public class TravelVoucherView {
	public void printSortCruise(String message, List<VoucherCruise> sorted) {

		System.out.println(message);
		
		for (int i = 0; i < sorted.size(); i++) {
			System.out.println(sorted.get(i));
			
		}
	}
	public void printSortRest(List<VoucherRest> sorted) {
			
		for (int i = 0; i < sorted.size(); i++) {
			System.out.println(sorted.get(i));
		}
	}
	public void printSortTour(List<VoucherTour> sorted) {
		
		for (int i = 0; i < sorted.size(); i++) {
			System.out.println(sorted.get(i));
			
		}
	}
	public void printSortTreatment(List<VoucherTreatment> sorted) {
		
		for (int i = 0; i < sorted.size(); i++) {
			System.out.println(sorted.get(i));
			
		}
	}
	public void printSortWeekendTour(List<WeekendTour> sorted) {
		
		for (int i = 0; i < sorted.size(); i++) {
			System.out.println(sorted.get(i));
			
		}
	}
	public void printVoucher(TravelVoucher v) {
		
			System.out.println(v);
	}	
}
