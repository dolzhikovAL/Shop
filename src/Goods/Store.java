package Goods;

import java.util.ArrayList;
import java.util.Scanner;

public class
Store {
    private ArrayList<Clothe> clothes = new ArrayList<Clothe>();
    private ArrayList<Computer> computers = new ArrayList<Computer>();
    private ArrayList<DrinkWater> drinkWaters = new ArrayList<DrinkWater>();
    private ArrayList<SmartPhone> smartPhones = new ArrayList<SmartPhone>();
    private ArrayList<SweetDrinks> sweetDrinks = new ArrayList<SweetDrinks>();
    private ArrayList<Sweets> sweets = new ArrayList<Sweets>();
    private ArrayList<Vegetables> vegetables = new ArrayList<Vegetables>();
    private double storeWallet = 0;


    public ArrayList<Clothe> getClothes() {
        return clothes;
    }

    public void setClothes(ArrayList<Clothe> clothes) {
        this.clothes = clothes;
    }

    public ArrayList<Computer> getComputers() {
        return computers;
    }

    public void setComputers(ArrayList<Computer> computers) {
        this.computers = computers;
    }

    public ArrayList<DrinkWater> getDrinkWaters() {
        return drinkWaters;
    }

    public void setDrinkWaters(ArrayList<DrinkWater> drinkWaters) {
        this.drinkWaters = drinkWaters;
    }

    public ArrayList<SmartPhone> getSmartPhones() {
        return smartPhones;
    }

    public void setSmartPhones(ArrayList<SmartPhone> smartPhones) {
        this.smartPhones = smartPhones;
    }

    public ArrayList<SweetDrinks> getSweetDrinks() {
        return sweetDrinks;
    }

    public void setSweetDrinks(ArrayList<SweetDrinks> sweetDrinks) {
        this.sweetDrinks = sweetDrinks;
    }

    public ArrayList<Sweets> getSweets() {
        return sweets;
    }

    public void setSweets(ArrayList<Sweets> sweets) {
        this.sweets = sweets;
    }

    public ArrayList<Vegetables> getVegetables() {
        return vegetables;
    }

    public void setVegetables(ArrayList<Vegetables> vegetables) {
        this.vegetables = vegetables;
    }

    public double getStoreWallet() {
        return storeWallet;
    }

    public void setStoreWallet(double storeWallet) {
        this.storeWallet = storeWallet;
    }



    public void lookingForItemBYName() {
        int category = chooseCategory();
        if (category > 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите название товара ");
            String newName = scanner.nextLine();
            ArrayList<? extends Item> areaForLooking = takeCategory(category);
            boolean wasFound = false;
            for (int i = 0; i < areaForLooking.size(); i++) {
                if (areaForLooking.get(i).getName().contains(newName)) {
                    wasFound = true;
                    areaForLooking.get(i).show();
                }

            }
            if (wasFound == false)
                System.out.println("Таково наименования нет в этой категории");
        }

    }

    public int foundInList(ArrayList<? extends Item> items, int askID) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getId() == askID) {
                System.out.println("Товар найден");
                return i;
            }
        }
        return -1;
    }

    public int changeValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество  товара");
        int countPoint = scanner.nextInt();
        return countPoint;
    }

    public boolean checkId(ArrayList<? extends Item> noNameArray, int askID, int passFromMenu) {
        boolean flag = false;
        int j = 0;
        int enterFromMenuAdd = 3;
        int enterSale = 4;
        j = foundInList(noNameArray, askID);
        if (j >= 0) {
            noNameArray.get(j).show();
            if (passFromMenu == enterFromMenuAdd) {
                flag = true;
                System.out.println("Старое количество товара = " +noNameArray.get(j).getValue());
                noNameArray.get(j).setValue(noNameArray.get(j).getValue() + changeValue());
                System.out.println("Новое количество товара = " +noNameArray.get(j).getValue());
            } else if (passFromMenu == enterSale) {
                int wantToBuy = changeValue();
                if (noNameArray.get(j).getValue() > wantToBuy) {
                    noNameArray.get(j).setValue(noNameArray.get(j).getValue() - wantToBuy);
                    setStoreWallet(getStoreWallet() + wantToBuy * noNameArray.get(j).getPrice());
                    System.out.println(" Терпеоь сума в кошельке составляет " + getStoreWallet());
                } else
                    System.out.println("Такого количества нет на складе");
            }
        }
        return flag;
    }

    public void lookingByID(int passFromMenu) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ВВедите ID товара");
        int askID = scanner.nextInt();
        int countPoint = 1;
        boolean found = false;
        switch (countPoint) {
            case 1: {
                if (checkId(clothes, askID, passFromMenu)) {
                    found = true;
                    break;
                }
            }
            case 2: {
                if (checkId(computers, askID, passFromMenu)) {
                    found = true;
                    break;
                }
            }
            case 3: {
                if (checkId(drinkWaters, askID, passFromMenu)) {
                    found = true;
                    break;
                }
            }
            case 4: {
                if (checkId(smartPhones, askID, passFromMenu)) {
                    found = true;
                    break;
                }
            }
            case 5: {
                if (checkId(sweetDrinks, askID, passFromMenu)) {
                    found = true;
                    break;
                }
            }
            case 6: {
                if (checkId(sweets, askID, passFromMenu)) {
                    found = true;
                    break;
                }
            }
            case 7: {
                if (checkId(vegetables, askID, passFromMenu)) {
                    found = true;
                    break;
                }
            }
        }
        if (!found && passFromMenu == 3) {
            System.out.println("Такого товара не найдно. Давайте добавим его");
            addNewItem();
        }
    }

    public void addNewItem() {
        int choose = chooseCategory();
        switch (choose) {
            case 0:
                break;
            case 1: {
                clothes.add(Clothe.createOne());
                break;
            }
            case 2: {
                computers.add(Computer.createOne());
                break;
            }
            case 3: {
                drinkWaters.add(DrinkWater.createOne());
                break;
            }
            case 4: {
                smartPhones.add(SmartPhone.createOne());
                break;
            }
            case 5: {
                sweetDrinks.add(SweetDrinks.createOne());
                break;
            }
            case 6: {
                sweets.add(Sweets.createOne());
                break;
            }
            case 7: {
                vegetables.add(Vegetables.createOne());
                break;
            }
        }
    }

    public int chooseCategory() {
        System.out.println("Введите номер категории которая вас интересует");
        System.out.println("1 -- Одежда " + "\n2 -- Компьютер " + "\n3 -- Питьевая вода " + "\n4 -- Смартфоны " +
                "\n5 -- Сладкие напитки " + "\n6 -- Сладости " + "\n7 -- Овощи ");
        Scanner scanner = new Scanner(System.in);
        int choose = scanner.nextInt();
        if (choose < 1 || choose > 7) {
            System.out.println("Такой категори не существует");
            return 0;
        } else return choose;
    }


    public ArrayList<? extends Item> takeCategory(int i) {
        ArrayList<? extends Item> buff = new ArrayList<>();
        switch (i) {
            case 1: {
                buff = clothes;
                break;
            }
            case 2: {
                buff = computers;
                break;
            }
            case 3: {
                buff = drinkWaters;
                break;
            }
            case 4: {
                buff = smartPhones;
                break;
            }
            case 5: {
                buff = sweetDrinks;
                break;
            }
            case 6: {
                buff = sweets;
                break;
            }
            case 7: {
                buff = vegetables;
            }
        }
        return buff;
    }

}

