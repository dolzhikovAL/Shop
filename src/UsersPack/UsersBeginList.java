package UsersPack;

import java.util.ArrayList;

public class UsersBeginList {

    static ArrayList<User> initialization() {
         User user1 = new User(123, "Alex1", "alexyaaaaaa9@gmail.com", "221217", false);
         User user2 = new User(124, "Alex2", "alexyaaaaaa9@gmail.com", "251217", true);
         User user3 = new User(125, "Alex3", "alexyaaaaaa9@gmail.com", "220218", true);
         User user4 = new User(126, "Alex4", "alexyaaaaaa9@gmail.coma", "111019", false);
        ArrayList<User> usersBegin= new ArrayList<>();

        usersBegin.add(user1);
        usersBegin.add(user2);

        usersBegin.add(user3);
        usersBegin.add(user4);
    return usersBegin;
    }

}
