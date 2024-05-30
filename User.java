public class User {
    private String name;
    private String email;
    private NotificationPreferences notificationPreferences;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
        this.notificationPreferences = new NotificationPreferences();
    }

    public void register() {
        System.out.println("User registered: " + name);
    }

    public void login() {
        System.out.println("User logged in: " + name);
    }

    public NotificationPreferences getNotificationPreferences() {
        return notificationPreferences;
    }

    public void setNotificationPreferences(NotificationPreferences notificationPreferences) {
        this.notificationPreferences = notificationPreferences;
    }
}
