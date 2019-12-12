package com.techtorial;

import java.io.*;
import java.util.Properties;

public class ReadFromFileClass {


    public static void main(String[] args) {

    }

    public static String getproperties (String key) throws IOException {

        // specify the needed file
        File credsfFile=new File("src/test/Resources/credentials.properties");

        // read from a file
        FileReader filereader=new FileReader(credsfFile);

        Properties properties=new Properties();
        properties.load(filereader);

        String login=properties.getProperty("login");
        System.out.println("my login from properties file is: " +login);

        String url=properties.getProperty("https://google.com");
        System.out.println("my login from properties file is: " +url);

        String password=properties.getProperty("techtorialpassword");
        System.out.println("my login from properties file is: " +password);
        System.out.println(properties.stringPropertyNames());

        String value=properties.getProperty(key);
        return value;

        // read from properties file printout only existing keys, if we provided non-existing key, then printout a
        // message "sorry, no such key in properties file"

        // Find 20 elements using css from any website and do some JavaScriptExecutor operations on those

    }
}
