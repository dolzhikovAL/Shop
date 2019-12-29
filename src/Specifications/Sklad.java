package Specifications;

import Goods.*;

public   class Sklad {
    public static void sklad(String[] args) {

    }
  public static Computer computer1 = new Computer(122133, 3, "computer1", "for games",
            24000, new TechSpecificationPC(new Ram(16, "AAA"),
            new Cpu(7, 3500), new VideoCard(4, 2048, new Ram(4, "BBB"))), 720);
  public static   SmartPhone smartPhone1 = new SmartPhone(312333, 2, "P20", "black metal", 13000,
            new TechSpecificationPhone("Android", new Ram(2, "CCC"),
                    new Cpu(4, 2000), 5.5, 9), 123);
    public static  Clothe clothe1 = new Clothe(545, 1212, "Socks", "Black Socks", 50,
            new Brand(2000, "Brestskie", 200, 15));
    public static   DrinkWater drinkWater1 = new DrinkWater(22121, 88, "Alaska", "Clean Water", 10);
    public static   SweetDrinks sweetDrinks1 = new SweetDrinks(986, 40, "HOHO", "Energy drink", 25, new ShelfLife("221119", 25, 730));
    public static  Sweets sweets1 = new Sweets(98765, 432, "Mars", "Chocolate without Nuts", 12, new ShelfLife("300119", 15, 365));
    public static  Vegetables vegetable1 = new Vegetables(346, 221, "Tomato", "Cocktail tomato", 70, "Cherry", new ShelfLife("010119", 8, 30));

}
