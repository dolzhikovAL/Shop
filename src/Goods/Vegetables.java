package Goods;


import Specifications.ShelfLife;

import java.util.Scanner;

public class Vegetables extends Item {
    private String sort;
    private ShelfLife shelfLife;

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public ShelfLife getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(ShelfLife shelfLife) {
        this.shelfLife = shelfLife;
    }

    public Vegetables(int id, int value, String name, String explanation, int price, String sort, ShelfLife shelfLife) {
        super(id, value, name, explanation, price);
        this.shelfLife = shelfLife;
        this.sort = sort;

    }

    @Override
    public void show() {
        super.show();
        System.out.println("Сорт товара --  " + sort+
                "\nСрок годности дата производства DDMMYY--  " + shelfLife.getWasMade()+
                "\nДлительность хранения в днях  при заданной температуре -- "+ shelfLife.getTermsOfUse() + " при  "+ shelfLife.getTemperature()+ " градусах"  );
    }

    public static Vegetables createOne() {
        Scanner scanner = new Scanner(System.in);
        Item item = Item.addOne();
        System.out.println("Введите сорт овощей ");
        String newSort = scanner.next();
        System.out.println("Введите дату производства в формате ДДММГГ ");
        String newWasMade = scanner.next();
        System.out.println("Введите температуру хранения ");
        int newTemperature = scanner.nextInt();
        System.out.println("Введите срок ханения в днях ");
        int newTermsOfUse = scanner.nextInt();
        Vegetables newOne = new Vegetables(item.getId(), item.getValue(), item.getName(), item.getExplanation(), item.getPrice(),newSort,
                new ShelfLife(newWasMade, newTemperature, newTermsOfUse));
        return newOne;
    }
}
