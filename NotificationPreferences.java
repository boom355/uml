
public class NotificationPreferences {
    private int frequency;
    private String channel;

    public NotificationPreferences() {
        // Default values
        this.frequency = 1; // Example: 1 notification per day
        this.channel = "Email"; // Default channel
    }

    public void updatePreferences(int frequency, String channel) {
        this.frequency = frequency;
        this.channel = channel;
        System.out.println("Notification preferences updated to frequency: " + frequency + ", channel: " + channel);
    }

    // Getter and Setter methods
    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }
}
