package com.example;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

public class GetData {

    // See the tuto/doc on
    // https://jersey.github.io/documentation/latest/user-guide.html#d0e4368
    private String data;
    private Client client = ClientBuilder.newClient();
    // URL of the RESTfull API
    private WebTarget webTarget = client.target("https://mastodon.zaclys.com/api/v1/");
    // The service I want to use
    private WebTarget ressourceWebTarget = webTarget.path("timelines/tag/");
    private WebTarget mastodondWebTarget = ressourceWebTarget.path("mastodon");
    // Invocation.Builder invocationBuilder =
    // mastodondWebTarget.request(MediaType.TEXT_PLAIN_TYPE);
    // Build and invoke the get request in a single step
    private Response response = mastodondWebTarget.request("text/plain").get();

    public GetData() {
        data = response.readEntity(String.class);
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "The data of this GetData object is : " + this.getData();
    }
}