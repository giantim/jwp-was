package webserver.filter;

import webserver.http.request.HttpRequest;

public class ResourceFilter {
    public String resource(HttpRequest httpRequest) {
        if (httpRequest.isStaticResourceRequest()) {
            return "index.html";
        }
        return null;
    }
}
