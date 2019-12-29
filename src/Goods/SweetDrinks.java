package Goods;

import Specifications.ShelfLife;

import java.util.Scanner;

public class SweetDrinks extends Item {

    private ShelfLife shelfLife;

    public ShelfLife getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(ShelfLife shelfLife) {
        this.shelfLife = shelfLife;
    }

    public SweetDrinks(int id, int value, String name, String explanation, int price, ShelfLife shelfLife) {
        super(id, value, name, explanation, price);
        this.shelfLife = shelfLife;
    }

    @Override
    public void show() {
        super.show();
        System.out.println(" Дата производства  ДДММГГ -- " + shelfLife.getWasMade() +
                "\nДлительность хранения в днях  при заданной температуре -- " + shelfLife.getTermsOfUse() + " при  " + shelfLife.getTemperature() + " градусах");
    }

    public static SweetDrinks createOne() {
        Scanner scanner = new Scanner(System.in);
        Item item = Item.addOne();
        System.out.println("Введите дату производства в формате ДДММГГ ");
        String newWasMade = scanner.next();
        System.out.println("Введите температуру хранения ");
        int newTemperature = scanner.nextInt();
        System.out.println("Введите срок ханения в днях ");
        int newTermsOfUse = scanner.nextInt();
        SweetDrinks newOne = new SweetDrinks(item.getId(), item.getValue(), item.getName(), item.getExplanation(), item.getPrice(),
                new ShelfLife(newWasMade, newTemperature, newTermsOfUse));
        return newOne;
    }
}