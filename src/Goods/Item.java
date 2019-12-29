package Goods;

import java.util.ArrayList;
import java.util.Scanner;

public class Item {
    private int id;
    private int value;
    private String name;
    private String explanation;
    private int price;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public Item(int id, int value, String name, String explanation, int price) {
        this.id = id;
        this.value = value;
        this.name = name;
        this.explanation = explanation;
        this.price = price;

    }

    public void show() {
        System.out.println("Товар найден");
        System.out.println("индентификационный номер --  " + id);
        System.out.println("название  --  " + name);
        System.out.println("количество --  " + value);
        System.out.println("описание --  " + explanation);
        System.out.println("цена --  " + price);


    }

    public static Item addOne(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведите ID нового товара");
        int newId = scanner.nextInt();
        System.out.println("Ведите количество  нового товара");
        int newValue = scanner.nextInt();
        System.out.println("Ведите название нового товара");
        String newName = scanner.next();
        System.out.println("Ведите описание нового товара");
        String newExplanation = scanner.next();
        System.out.println("Ведите цену нового товара");
        int newPrise = scanner.nextInt();
        return new Item(newId,newValue,newName,newExplanation,newPrise);
    }



}

