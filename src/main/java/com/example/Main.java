package com.example;

import java.io.IOException;

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

        for (String tag: args) {
            System.out.println(tag);
        
            data = new GetData(tag);
            System.out.println(data.getTagsCount()); 

        }
    }
}
