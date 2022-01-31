package service;

import com.sparkpost.exception.SparkPostException;
import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;
import models.Users;

import java.beans.BeanProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AuthService {

    ArrayList <Users> users = new ArrayList<>();

    HashPassService hashPassService = new HashPassService();

    Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);
    SparkPostService sparkPostService = new SparkPostService();

    public Boolean register (Users user) throws SparkPostException {

        int i=0;
        while(i<users.size()){
            if(users.get(i).getEmail().equals(user.getEmail())){
                System.out.println("The email: " + user.getEmail() + " already exists!");
                return false;
            }
            i++;
        }

        users.add(user);

        sparkPostService.welcomeMail(user.getEmail());

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
            if(email.equals(users.get(i).getEmail())){
                System.out.println("The email: " + email + " exists!");
                vEmail = true;
                if(argon2.verify(users.get(i).getPassword(), password)){
                    System.out.println("The password is valid!");
                    vPassword = true;
                    break;
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
