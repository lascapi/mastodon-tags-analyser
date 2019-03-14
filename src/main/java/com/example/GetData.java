package com.example;

import java.util.ArrayList;
import java.util.Comparator;

import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonValue;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

public class GetData {

    private JsonArray jsonArray;
    private ArrayList<JsonObject> listJsonObject;

    // Constructor
    public GetData() {
        jsonArray = getJson("mastodon");
        listJsonObject = getDataObjects();
    }

    // Constructor
    public GetData(String tag) {
        jsonArray = getJson(tag);
        listJsonObject = getDataObjects();
    }

    private JsonArray getJson(String tag) {
        Client client = ClientBuilder.newClient();
        WebTarget webTarget = client.target("https://mastodon.zaclys.com/api/v1/"); // URL of the RESTfull API
        WebTarget ressourceWebTarget = webTarget.path("timelines/tag/"); // The service I want to use
        WebTarget mastodondWebTarget = ressourceWebTarget.path(tag); // The param : the tag I search
        Response response = mastodondWebTarget.request("xml/json").get(); // Build and invoke the get request in a
                                                                          // single step
        return response.readEntity(JsonArray.class);
    }

    /**
     * @return a list of Json Object
     */
    public ArrayList<JsonObject> getDataObjects() {
        ArrayList<JsonObject> list = new ArrayList<JsonObject>();
        for (JsonValue obj : jsonArray) {
            list.add((JsonObject) obj);
        }
        return list;
    }

    /**
     * @return a list of tags
     */
    public ArrayList<TagCount> getTagsCount() {

        ArrayList<TagCount> result = new ArrayList<TagCount>(1000);
        TagCount tagc1 = new TagCount("test", 1);
        TagCount tagc2 = new TagCount("TESSSTTTTT", 2);
        result.add(tagc1);
        result.add(tagc2);

        ArrayList<String> tags = new ArrayList<>();

        // Parcour de la liste des objets du json
        for (int i = 0; i < listJsonObject.size(); i++) {

            // Recupère le tableau des tags
            JsonArray tagsArrayList = listJsonObject.get(i).getJsonArray("tags");
            // Parcour du tableau
            for (int j = 0; j < tagsArrayList.size(); j++) {
                // Recupération du nom du tag et ajout dans la liste temporaire
                tags.add(tagsArrayList.get(j).asJsonObject().getString("name"));

                // TODO Test pour ajouter les objects TagCount dans le tableau
                // Il faut encore faire l'incrementation du count 
                tagc1 = new TagCount(tagsArrayList.get(j).asJsonObject().getString("name"), 1);
                result.add(tagc1);
            }
        }
        return result;
    }

    public ArrayList<String> getTagsList(){

        ArrayList<String> tags = new ArrayList<>();

        // Parcour de la liste des objets du json
        for (int i = 0; i < listJsonObject.size(); i++) {

            // Recupère le tableau des tags
            JsonArray tagsArrayList = listJsonObject.get(i).getJsonArray("tags");
            // Parcour du tableau
            for (int j = 0; j < tagsArrayList.size(); j++) {
                // Recupération du nom du tag et ajout dans la liste temporaire
                tags.add(tagsArrayList.get(j).asJsonObject().getString("name"));
            }
        }
        // tags.iterator().forEachRemaining(
        //     tag -> {System.out.println("#" + tag);}
        // );
        tags.sort(Comparator.naturalOrder());

        ArrayList<String> tagsListSingle = new ArrayList<>();
        for(int i = 0; i < tags.size()-1; i++){
            if( ! tags.get(i).equals(tags.get(i + 1))){
                tagsListSingle.add(tags.get(i));
            }
        }
        return tagsListSingle; 
    }

    @Override
    public String toString() {
        return "The data of this GetData object is : " + this.getListJsonObject();
    }

    /**
     * @return the jsonArray
     */
    public JsonArray getJsonArray() {
        return jsonArray;
    }

    /**
     * @param jsonArray the jsonArray to set
     */
    public void setJsonArray(JsonArray jsonArray) {
        this.jsonArray = jsonArray;
    }

    /**
     * @return the listJsonObject
     */
    public ArrayList<JsonObject> getListJsonObject() {
        return listJsonObject;
    }

    /**
     * @param listJsonObject the listJsonObject to set
     */
    public void setListJsonObject(ArrayList<JsonObject> listJsonObject) {
        this.listJsonObject = listJsonObject;
    }
}