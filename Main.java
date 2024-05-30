public class Main {
    public static void main(String[] args) {
        // Create a user
        User user = new User("Alice", "alice@example.com");
        user.register();
        user.login();

        // Set notification preferences
        NotificationPreferences preferences = user.getNotificationPreferences();
        preferences.updatePreferences(2, "SMS");

        // Create a subscription manager
        Subscription subscriptionManager = new Subscription(1);

        // Create websites and add subscriptions
        Website website1 = new Website("http://example.com");
        Website website2 = new Website("http://another-example.com");

        subscriptionManager.addSubscription(website1);
        subscriptionManager.addSubscription(website2);

        // Check for updates
        subscriptionManager.checkForUpdates();

        // Cancel a subscription
        subscriptionManager.cancelSubscription(website1);
    }
}
