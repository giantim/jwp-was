package webserver.http;

public class Url {
    private final String url;

    private Url(String url) {
        this.url = url;
    }

    public static Url of(String url) {
        return new Url(url);
    }

    public boolean isResource() {

        return false;
    }
}
