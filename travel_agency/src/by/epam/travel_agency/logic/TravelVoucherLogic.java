package by.epam.travel_agency.logic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import by.epam.travel_agency.entity.*;

public class TravelVoucherLogic {
	public String enterFromConsole(String message) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println(message);

		while (!sc.hasNextLine()) {
			sc.next();
			System.out.println(message);
		}

		return sc.nextLine();
	}

	public int enterFromConsole2(String message) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println(message);

		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println(message);
		}

		return sc.nextInt();
	}

	public List<VoucherCruise> sortOfPriceCruise(List<VoucherCruise> voucher) {
		List<VoucherCruise> cruise = new ArrayList<VoucherCruise>();
		cruise.addAll(voucher);
		for (int i = 0; i < cruise.size() - 1; i++) {
			for (int j = i + 1; j < cruise.size(); j++) {

				if ((cruise.get(i).getPrice() > cruise.get(j).getPrice())) {
					VoucherCruise temp = cruise.get(i);
					cruise.set(i, cruise.get(j));
					cruise.set(j, temp);
				}
			}
		}
		return cruise;
	}

	public List<VoucherRest> sortOfPriceRest(List<VoucherRest> voucher) {
		List<VoucherRest> rest = new ArrayList<VoucherRest>();
		rest.addAll(voucher);
		for (int i = 0; i < rest.size() - 1; i++) {
			for (int j = i + 1; j < rest.size(); j++) {

				if ((rest.get(i).getPrice() > rest.get(j).getPrice())) {
					VoucherRest temp = rest.get(i);
					rest.set(i, rest.get(j));
					rest.set(j, temp);
				}
			}
		}
		return rest;
	}

	public List<VoucherTour> sortOfPriceTour(List<VoucherTour> voucher) {
		List<VoucherTour> tour = new ArrayList<VoucherTour>();
		tour.addAll(voucher);
		for (int i = 0; i < tour.size() - 1; i++) {
			for (int j = i + 1; j < tour.size(); j++) {

				if ((tour.get(i).getPrice() > tour.get(j).getPrice())) {
					VoucherTour temp = tour.get(i);
					tour.set(i, tour.get(j));
					tour.set(j, temp);
				}
			}
		}
		return tour;
	}

	public List<VoucherTreatment> sortOfPriceTreatment(List<VoucherTreatment> voucher) {

		List<VoucherTreatment> treatment = new ArrayList<VoucherTreatment>();
		treatment.addAll(voucher);

		for (int i = 0; i < treatment.size() - 1; i++) {
			for (int j = i + 1; j < treatment.size(); j++) {
				if ((treatment.get(i).getPrice() > treatment.get(j).getPrice())) {
					VoucherTreatment temp = treatment.get(i);
					treatment.set(i, treatment.get(j));
					treatment.set(j, temp);
				}
			}
		}
		return treatment;
	}

	public List<WeekendTour> sortOfPriceWeekend(List<WeekendTour> voucher) {

		List<WeekendTour> weekend = new ArrayList<WeekendTour>();
		weekend.addAll(voucher);

		for (int i = 0; i < weekend.size() - 1; i++) {
			for (int j = i + 1; j < weekend.size(); j++) {
				if ((weekend.get(i).getPrice() > weekend.get(j).getPrice())) {
					WeekendTour temp = weekend.get(i);
					weekend.set(i, weekend.get(j));
					weekend.set(j, temp);
				}
			}
		}
		return weekend;
	}

	public void choice(TravelVoucher voucher, String t, String m, int d, TravelVoucherLogic l) {

		boolean z = false;
		int p;
		p = 0;

		for (int i = 0; i < voucher.getCruise().size(); i++) {
			for (int j = 0; j < voucher.getCruise().get(i).getMeal().getMeals().size(); j++) {
				if (voucher.getCruise().get(i).getTransport().equalsIgnoreCase(t)
						& (voucher.getCruise().get(i).getMeal().getMeals().get(j).getMeals().equalsIgnoreCase(m))
						& ((voucher.getCruise().get(i).getNumberOfDays() == d))) {
					z = true;

					System.out.println(voucher.getCruise().get(i));
					p = l.price(voucher.getCruise().get(i), m);
					System.out.println("Общая стоимость тура с выбранным типом питания для одного человек: " + p);

				}

			}
		}

		for (int i = 0; i < voucher.getRest().size(); i++) {
			for (int j = 0; j < voucher.getRest().get(i).getMeal().getMeals().size(); j++) {
				if (voucher.getRest().get(i).getTransport().equalsIgnoreCase(t)
						& (voucher.getRest().get(i).getMeal().getMeals().get(j).getMeals().equalsIgnoreCase(m))
						& (voucher.getRest().get(i).getNumperOfDays() == d)) {
					z = true;
					System.out.println(voucher.getRest().get(i));
					p = l.price(voucher.getRest().get(i), m);
					System.out.println("Общая стоимость тура с выбранным типом питания для одного человек: " + p);

				}
			}
		}
		for (int i = 0; i < voucher.getTour().size(); i++) {
			if (voucher.getTour().get(i).getTransport().equalsIgnoreCase(t)
					& (voucher.getTour().get(i).getMeal().getMeals().equalsIgnoreCase(m))
					& (voucher.getTour().get(i).getNumberOfDays() == d)) {
				z = true;
				System.out.println(voucher.getTour().get(i));
				p = l.price(voucher.getTour().get(i), m);
				System.out.println("Общая стоимость тура с выбранным типом питания для одного человек: " + p);

			}
		}
		for (int i = 0; i < voucher.getTreatment().size(); i++) {
			for (int j = 0; j < voucher.getTreatment().get(i).getMeal().getMeals().size(); j++) {
				if (voucher.getTreatment().get(i).getTransport().equalsIgnoreCase(t)
						& (voucher.getTreatment().get(i).getMeal().getMeals().get(j).getMeals().equalsIgnoreCase(m))
						& (voucher.getTreatment().get(i).getNumberOfDays() == d)) {
					z = true;
					System.out.println(voucher.getTreatment().get(i));
					p = l.price(voucher.getTreatment().get(i), m);
					System.out.println("Общая стоимость тура с выбранным типом питания для одного человек: " + p);

				}
			}
		}
		for (int i = 0; i < voucher.getWeekend().size(); i++) {
			if (voucher.getWeekend().get(i).getTransport().equalsIgnoreCase(t)
					& (voucher.getWeekend().get(i).getMeal().getMeals().equalsIgnoreCase(m))
					& (voucher.getWeekend().get(i).getNumberOfDays() == d)) {
				z = true;
				System.out.println(voucher.getWeekend().get(i));
				p = l.price(voucher.getWeekend().get(i), m);
				System.out.println("Общая стоимость тура с выбранным типом питания для одного человек: " + p);

			}
		}
		if (z == false) {
			System.out.println("По заданным параметрам туров нет, попробуйте еще раз");
		}
	}

	public int price(VoucherCruise cruise, String f) {

		int p;
		p = 0;

		for (int i = 0; i < cruise.getMeal().getMeals().size(); i++) {
			if (cruise.getMeal().getMeals().get(i).getMeals().equalsIgnoreCase(f)) {
				p = cruise.getPrice() + cruise.getMeal().getMeals().get(i).getPrice();
			}
		}
		return p;

	}

	public int price(VoucherRest rest, String f) {

		int p;
		p = 0;

		for (int i = 0; i < rest.getMeal().getMeals().size(); i++) {
			if (rest.getMeal().getMeals().get(i).getMeals().equalsIgnoreCase(f)) {
				p = rest.getPrice() + rest.getMeal().getMeals().get(i).getPrice();
			}
		}
		return p;
	}

	public int price(VoucherTreatment treatment, String f) {

		int p;
		p = 0;

		for (int i = 0; i < treatment.getMeal().getMeals().size(); i++) {
			if (treatment.getMeal().getMeals().get(i).getMeals().equalsIgnoreCase(f)) {
				p = treatment.getPrice() + treatment.getMeal().getMeals().get(i).getPrice();
			}
		}
		return p;
	}

	public int price(VoucherTour tour, String f) {

		return tour.getPrice() + tour.getMeal().getPrice();
	}

	public int price(WeekendTour weekendTour, String f) {

		return weekendTour.getPrice() + weekendTour.getMeal().getPrice();

	}
}