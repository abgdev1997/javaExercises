package service;

import com.sparkpost.exception.SparkPostException;
import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;

import java.beans.BeanProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AuthService {

    ArrayList <List<String>> users = new ArrayList<>();

    HashPassService hashPassService = new HashPassService();

    Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);
    SparkPostService sparkPostService = new SparkPostService();

    public Boolean register (String email, String userName, String password) throws SparkPostException {

        List<String> user = new ArrayList<>();

        user.add(email);
        user.add(userName);

        int i=0;
        while(i<users.size()){
            if(user.get(0).equals(users.get(i).get(0))){
                System.out.println("The email: " + user.get(0) + " already exists!");
                return false;
            }
            i++;
        }

        user.add(argon2.hash(4, 1024 * 1024, 8, password));

        users.add(user);

        sparkPostService.welcomeMail(email);

        return true;
    }

    public void getUsers() {
        users.forEach(System.out::println);
    }

    public int login (String email, String password){

        boolean vEmail = false;
        boolean vPassword = false;
        String keyString = hashPassService.log(password);

        int i = 0;
        while(i<users.size()){
            if(email.equals(users.get(i).get(0))){
                System.out.println("The email: " + email + " exists!");
                vEmail = true;
                if(argon2.verify(users.get(i).get(2), password)){
                    System.out.println("The password is valid!");
                    vPassword = true;
                }
            }
            i++;
        }

        if(!vEmail){
            System.out.println("The email: " + email + " does not exists!");
            return -1;
        }

        else if(!vPassword){
            System.out.println("The password is invalid!");
            return -2;
        }

        System.out.println("Login done");
        return 1;
    }
}
