package Goods;

import Specifications.Brand;

import java.util.ArrayList;
import java.util.Scanner;

public class Clothe extends Item {
    private Brand brand;

    public Clothe(int id, int value, String name, String explanation, int price, Brand brand) {
        super(id, value, name, explanation, price);
        this.brand = brand;
    }


    public void show() {
        super.show();
        System.out.println("Brand name -- " + brand.getBrandName() + "\nYear of foundation -- " + brand.getYearOfFoundation() +
                "\nКоличество работников -- " + brand.getWorkersNumber() + "\n количество стран партнеров --  " + brand.getCountriesNumber());
    }

    public static Clothe createOne() {
        Scanner scanner = new Scanner(System.in);
        Item item = Item.addOne();
        System.out.println("Введите год основания Бренда ");
        int newYear = scanner.nextInt();
        System.out.println("Введите Название бренда ");
        String newBrandName = scanner.next();
        System.out.println("Ведите количество сотрудников");
        int newNumber = scanner.nextInt();
        System.out.println("Ведите колисество стран импортеров ");
        int newCountries = scanner.nextInt();
        Clothe newOne = new Clothe(item.getId(), item.getValue(), item.getName(), item.getExplanation(), item.getPrice(),
                new Brand(newYear, newBrandName, newNumber, newCountries));
        return newOne;
    }
}
