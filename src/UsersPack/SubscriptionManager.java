package UsersPack;

import java.util.ArrayList;
import java.util.Scanner;

public class SubscriptionManager {

    private Sender sender = new Sender("alexyaaaaaa9@gmail.com", "w3L-Hd9-9ZF-55f");
    private String inputAddress = "alexyaaaaaa9@gmail.com";
    private static ArrayList<User> users = new ArrayList<User>();

    public static ArrayList<User> getUsers() {
        return users;
    }

    public static void setUsers(ArrayList<User> users) {
        SubscriptionManager.users = users;
    }

    public static void addUsersAtBegin() {
        users.addAll(UsersBeginList.initialization());
    }

    public void addUser() {
        boolean isExist = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя Клиента");
        String client = scanner.nextLine();
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getName().equals(client)) {
                isExist = true;
                System.out.println("Такой Клиент найден ");
                User.show(users.get(i));
                i = users.size();
            }
        }
        if (!isExist) {
            System.out.println("Введите ID клиента");
            int newId = scanner.nextInt();
            System.out.println("Введите email клиента");
            String newEmail = scanner.next();
            System.out.println("Введите дату регистрациив формате ДДММГГ клиента");
            String newDate = scanner.next();
            System.out.println("Введите разрешение на подписку 1- разрешаю 2 - неразрешаю");
            int subscribe = scanner.nextInt();
            boolean subscribeCheck = subscribe == 1 ? true : false;
            users.add(new User(newId, client, newEmail, newDate, subscribeCheck));
            System.out.println("Новый клиент добавлен" );
            User.show(users.get(users.size()-1));
        }
    }


    public void mailing() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите тему письма");
        String title = scanner.next();
        System.out.println("Введите тект письма");
        String contain = scanner.next();
        for (User i : users) {
            if (i.isSubscribe()) {
                sender.send(title, contain, inputAddress, i.getEmail());
            }
        }
    }


}
