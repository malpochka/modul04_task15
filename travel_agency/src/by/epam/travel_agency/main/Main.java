package by.epam.travel_agency.main;

import java.util.List;

import by.epam.travel_agency.entity.*;
import by.epam.travel_agency.include_in_entity.*;
import by.epam.travel_agency.logic.*;
import by.epam.travel_agency.view.*;

/*Туристические путевки.Сформировать набор предложений клиенту по выбору туристической путевки различного типа
 * (отдых, экскурсии, лечение, шопинг, круиз, и т.д.) для оптимального выбора. Учитывать возможность выбора транспорта,
 * питания и числа дней.Реализовать выбор и сортировку путевок.*/

public class Main {

	public static void main(String[] args) {

		String transport;
		String food;
		int days;

		TravelVoucher voucher = new TravelVoucher();
		TypeOfMeal meal = new TypeOfMeal();
		TravelVoucherLogic logic = new TravelVoucherLogic();
		TravelVoucherView view = new TravelVoucherView();

		Country country1 = new Country();
		Country country2 = new Country();
		Country country3 = new Country();

		country1.addCountry("Польша");
		country1.addCountry("Чехия");
		country1.addCountry("Германия");
		country1.addCountry("Италия");

		country2.addCountry("Польша");
		country2.addCountry("Германия");
		country2.addCountry("Нидерланды");
		country2.addCountry("Бельгия");
		country2.addCountry("Франция");

		country3.addCountry("Литва");
		country3.addCountry("Латвия");
		country3.addCountry("Эстония");

		meal.addMeal(new Meal("R0", 0));
		meal.addMeal(new Meal("BB", 100));
		meal.addMeal(new Meal("HB", 150));
		meal.addMeal(new Meal("FB", 200));
		meal.addMeal(new Meal("AI", 300));

		voucher.addVoucherCruise(new VoucherCruise("Средиземное море",
				"Барселона, Испания - Марсель, Франция - Генуя, Италия - Чивитавеккья/Рим,Мальта - Барселона, Испания ",
				"Лайнер", meal, 8, 800));
		voucher.addVoucherCruise(new VoucherCruise("Франция- Италия- Испания",
				"Марсель, Франция - Генуя, Италия - Ла Специя, Италия - Валенсия, Испания - Барселона, Испания - Марсель, Франция ",
				"Лайнер", meal, 8, 1100));
		voucher.addVoucherRest(new VoucherRest("Египет", "Самолет", meal, 8, 310));
		voucher.addVoucherRest(new VoucherRest("Египет", "Самолет", meal, 11, 420));
		voucher.addVoucherRest(new VoucherRest("Турция", "Самолет", meal, 8, 250));
		voucher.addVoucherRest(new VoucherRest("Турция", "Самолет", meal, 11, 350));
		voucher.addVoucherRest(new VoucherRest("Турция", "Самолет", meal, 14, 500));
		voucher.addVoucherRest(new VoucherRest("Болгария", "Самолет", meal, 11, 550));
		voucher.addVoucherRest(new VoucherRest("Болгария", "Самолет", meal, 14, 720));
		voucher.addVoucherTour(new VoucherTour(country1, "Автобус", meal.getMeals().get(0), 21, 530));
		voucher.addVoucherTour(new VoucherTour(country2, "Автобус", meal.getMeals().get(0), 21, 700));
		voucher.addVoucherTour(new VoucherTour(country3, "Автобус", meal.getMeals().get(1), 21, 450));
		voucher.addVoucherTreatment(
				new VoucherTreatment("Россия", "Поезд", "Опорнодвигательная система", meal, 14, 550));
		voucher.addVoucherTreatment(
				new VoucherTreatment("Россия", "Поезд", "Опорнодвигательная система", meal, 21, 850));
		voucher.addVoucherTreatment(
				new VoucherTreatment("Украина", "Поезд", "Верхние дыхательные пути", meal, 14, 450));
		voucher.addVoucherTreatment(
				new VoucherTreatment("Украина", "Поезд", "Верхние дыхательные пути", meal, 21, 750));
		voucher.addWeekendTour(
				new WeekendTour("Тур выходного дня", "Украина", "Автобус", meal.getMeals().get(3), 4, 200));
		voucher.addWeekendTour(new WeekendTour("Новогодний тур", "Украина", "Автобус", meal.getMeals().get(4), 3, 150));
		voucher.addWeekendTour(new WeekendTour("Шоп-тур", "Украина", "Автобус", meal.getMeals().get(0), 3, 150));

		List<VoucherCruise> sorted;
		sorted = logic.sortOfPriceCruise(voucher.getCruise());
		view.printSortCruise("Сортировка туристических путевок по цене", sorted);
		System.out.println();

		List<VoucherRest> sortRest;
		sortRest = logic.sortOfPriceRest(voucher.getRest());
		view.printSortRest(sortRest);
		System.out.println();

		List<VoucherTour> sortTour;
		sortTour = logic.sortOfPriceTour(voucher.getTour());
		view.printSortTour(sortTour);
		System.out.println();

		List<VoucherTreatment> sortTreatment;
		sortTreatment = logic.sortOfPriceTreatment(voucher.getTreatment());
		view.printSortTreatment(sortTreatment);
		System.out.println();

		List<WeekendTour> sortWeekend;
		sortWeekend = logic.sortOfPriceWeekend(voucher.getWeekend());
		view.printSortWeekendTour(sortWeekend);
		System.out.println();

		transport = logic.enterFromConsole("Введите вид транспорта ");
		food = logic.enterFromConsole("Введите тип питания");
		days = logic.enterFromConsole2("Введите количество дней");

		logic.choice(voucher, transport, food, days, logic);

	}

}
