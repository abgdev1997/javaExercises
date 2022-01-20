package service;

import com.sparkpost.Client;
import com.sparkpost.exception.SparkPostException;

public class SparkPostService {

    public void welcomeMail(String email) throws SparkPostException {
        String API_KEY = "APIKEY";
        Client client = new Client(API_KEY);
        client.sendMessage(
                "ejercicio2@ejercicio2.com", email,
                "Welcome to the exercise 2",
                "The exercise 2:", "<p>Welcome</p>");
    }
}
