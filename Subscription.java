import java.util.ArrayList;
import java.util.List;

public class Subscription {
    private int subscriptionID;
    private List<Website> websites;
    private List<Notification> notifications;

    public Subscription(int subscriptionID) {
        this.subscriptionID = subscriptionID;
        this.websites = new ArrayList<>();
        this.notifications = new ArrayList<>();
    }

    public void addSubscription(Website website) {
        websites.add(website);
        System.out.println("Subscription added for website: " + website.getUrl());
    }

    public void cancelSubscription(Website website) {
        websites.remove(website);
        System.out.println("Subscription cancelled for website: " + website.getUrl());
    }

    public void checkForUpdates() {
        for (Website website : websites) {
            website.enterUrl();
            triggerNotification("Update detected for website: " + website.getUrl());
        }
    }

    private void triggerNotification(String message) {
        Notification notification = new Notification(message);
        notification.sendNotification();
        notifications.add(notification);
    }
}
