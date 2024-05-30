public class Website {
    private String url;

    public Website(String url) {
        this.url = url;
    }

    public void enterUrl() {
        // Logic to enter/check URL
        System.out.println("Entering URL: " + url);
    }

    // Getter and Setter methods
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
