package models;

import java.util.List;

public class Users {

    String userName;
    String email;
    String password;
    String nationality;
    String city;
    List<String> studies;
    List<String> complementaryStudies;
    List<String> workExperience;

    public Users() {
    }

    public Users(String userName, String email, String password, String nationality, String city, List<String> studies, List<String> complementaryStudies, List<String> workExperience) {
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.nationality = nationality;
        this.city = city;
        this.studies = studies;
        this.complementaryStudies = complementaryStudies;
        this.workExperience = workExperience;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<String> getStudies() {
        return studies;
    }

    public void setStudies(List<String> studies) {
        this.studies = studies;
    }

    public List<String> getComplementaryStudies() {
        return complementaryStudies;
    }

    public void setComplementaryStudies(List<String> complementaryStudies) {
        this.complementaryStudies = complementaryStudies;
    }

    public List<String> getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(List<String> workExperience) {
        this.workExperience = workExperience;
    }
}
