import Goods.*;
import Specifications.*;
import UsersPack.SubscriptionManager;
import UsersPack.User;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Store storeObject = new Store();
        storeObject.getClothes().add(Sklad.clothe1);
        storeObject.getComputers().add(Sklad.computer1);
        storeObject.getDrinkWaters().add(Sklad.drinkWater1);
        storeObject.getSmartPhones().add(Sklad.smartPhone1);
        storeObject.getSweetDrinks().add(Sklad.sweetDrinks1);
        storeObject.getSweets().add(Sklad.sweets1);
        storeObject.getVegetables().add(Sklad.vegetable1);
        SubscriptionManager subscription = new SubscriptionManager();
        subscription.addUsersAtBegin();
        ArrayList<User> users = SubscriptionManager.getUsers();
        mainMenu(storeObject, subscription);
    }

    public static void mainMenu(Store storeObject, SubscriptionManager subscriptionManager) {
        System.out.println("Выберите желаемое действие :" +
                "\n 1-- Проверить остояние кошелька" +
                "\n 2 -- Искать Товар по имени в категории" +
                "\n 3 -- Принимать товар от поставщиков" +
                "\n 4--nПродаватьтовры" +
                "\n 5 -- Добавить юзера" +
                "\n 6 -- Сделать рассылку" +
                "\n 7 -- Выход");
        Scanner scanner = new Scanner(System.in);
        int usersChoice = scanner.nextInt();
        switch (usersChoice) {
            case 1: {
                System.out.println(storeObject.getStoreWallet());
                break;
            }
            case 2: {
                storeObject.lookingForItemBYName();
                break;
            }
            case 3:
            case 4: {
                storeObject.lookingByID(usersChoice);
                break;
            }
            case 5: {
                subscriptionManager.addUser();
                break;
            }
            case 6: {
                subscriptionManager.mailing();
            }
        }
    }


}
