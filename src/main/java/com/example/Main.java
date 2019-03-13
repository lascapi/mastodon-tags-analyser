package com.example;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.json.JsonArray;
import javax.json.JsonObject;

/**
 * Main class.
 */
public class Main {

    public static GetData data;


    /**
     * Main method.
     * 
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {

        test();
    }

    private static void test() {
        data = new GetData("zaclys");

        ArrayList<String> tags = new ArrayList<>(); 

        ArrayList<JsonObject> listData = data.getDataObjects();
        for (int i = 0; i < listData.size(); i++) {

            JsonArray tagsArrayList = listData.get(i).getJsonArray("tags");
            for (int j = 0; j < tagsArrayList.size(); j++) {
                tags.add(tagsArrayList.get(j).asJsonObject().getString("name"));
            }
        }

        Map<String,Integer> tagsCount = new HashMap<String,Integer>(); 
        for (String tag : tags) {
            if (tagsCount.get(tag) != null ){
                tagsCount.put(tag, tagsCount.get(tag) + 1);
            }else{
                tagsCount.put(tag, 1);
            }
        }

        System.out.println(tagsCount);
    }
}
