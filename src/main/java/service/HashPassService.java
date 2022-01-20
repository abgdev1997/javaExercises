package service;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashPassService {

    HashMap<String, String> keys = new HashMap<>();

    public String hash (String password){

        long key = (long) (Math.random()*10000);
        String keyString = String.valueOf(key);
        keys.put(keyString, password);

        return keyString;
    }

    public String log (String password){

        String keyString = "";

        for (Map.Entry<String, String> entry : keys.entrySet()) {
            if(password.equals(entry.getValue())){
                keyString = entry.getKey();
            }
        }

        return keyString;
    }

}
