package com.vytrack.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    // 1. Create an object of Properties class
    // We need properties class to use methods coming from class like load(), getProperty("key")
    // it is static because we are using it in static method and static block
    // it is private because I will be using it only in this class
    private static Properties properties = new Properties();

    // we want to open the properties file and load to properties object ONLY ONCE before reading
    // having static block because static runs first
    static {
        try {
            // 2. Create an object of FileInputStream
            // We need this object to open file as a stream in Java memory
            FileInputStream file = new FileInputStream("config.properties");

            // 3. Load the properties object using FileInputStream object
            // Load "properties" object with the "file" we opened using FileInputStream
            properties.load(file);

            // close the file after loading
            // if we don't close the file, it will take the space from computer memory
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String keyword){
        return properties.getProperty(keyword);
    }
}
