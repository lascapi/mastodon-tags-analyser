package com.example;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Main class.
 */
public class Main {

    /**
     * Main method.
     * 
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {

        GetData data;
        for (String tag : args) {
            System.out.println(tag);

            data = new GetData(tag);
            // ArrayList<TagCount>tagsArrayList = data.getTagsCount();
            // System.out.println(tagsArrayList);
            ArrayList<String> tagsList = data.getTagsList();
            for (String subtag : tagsList) {
                System.out.println("\t" + subtag);

                GetData subData = new GetData(subtag);

                System.out.println("\t\t" + subData.getTagsList());
            }
        }
    }
}
