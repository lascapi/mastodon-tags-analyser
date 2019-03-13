package com.example;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import java.util.ArrayList;

import javax.json.JsonArray;
import javax.json.JsonObject;

public class GetData {

    private JsonArray jsonArray;

    // Constructor
    public GetData() {
        jsonArray = getJson("mastodon").readEntity(JsonArray.class);
    }

    public GetData(String tag) {
        jsonArray = getJson(tag).readEntity(JsonArray.class);
    }

    private Response getJson(String tag) {
        Client client = ClientBuilder.newClient();
        WebTarget webTarget = client.target("https://mastodon.zaclys.com/api/v1/"); // URL of the RESTfull API
        WebTarget ressourceWebTarget = webTarget.path("timelines/tag/"); // The service I want to use
        WebTarget mastodondWebTarget = ressourceWebTarget.path(tag); // The param : the tag I search
        Response response = mastodondWebTarget.request("xml/json").get(); // Build and invoke the get request in a
                                                                          // single step
        return response;
    }

    /**
     * @return a list of Json Object
     */
    public ArrayList<JsonObject> getDataObjects() {
        ArrayList<JsonObject> list = new ArrayList<JsonObject>();

        for (int i = 0; i < jsonArray.size(); i++) {
            list.add((JsonObject) jsonArray.get(i));
        }
        return list;
    }

    /**
     * @return the data
     */
    public JsonArray getData() {
        return jsonArray;
    }

    /**
     * @param data the data to set
     */
    public void setData(JsonArray data) {
        this.jsonArray = data;
    }

    @Override
    public String toString() {
        return "The data of this GetData object is : " + this.getData();
    }
}