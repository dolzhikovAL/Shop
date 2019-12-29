package UsersPack;

public class User {
    private int id;
    private String name;
    private String email;
    private String registrationDate;
    private boolean subscribe;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    public boolean isSubscribe() {
        return subscribe;
    }

    public void setSubscribe(boolean subscribe) {
        this.subscribe = subscribe;
    }

    public User(int id, String name, String email, String registrationDate, boolean subscribe) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.registrationDate = registrationDate;
        this.subscribe = subscribe;
    }

    public static void show(User user){
        System.out.println("Имя клиента = " + user.getName() +
                "\n ID Клиента = " + user.getId() +
                "\n Почта  = " + user.getEmail() +
                "\n Дата регистрации = "+ user.getRegistrationDate()+
                "\n Наличие подписки =" + user.isSubscribe());
    }
}