package models;

import java.util.List;

public class Candidates {

    String name;
    String surNames;
    String email;
    String phone;
    String country;
    String city;
    String presence;
    List<String> technologies;
    Boolean relocation;
    List<String> studies;
    List<String> complementaryStudies;
    List<String> experience;

    public Candidates() {
    }

    public Candidates(String name, String surNames, String email, String phone, String country, String city, String presence, List<String> technologies, Boolean relocation, List<String> studies, List<String> complementaryStudies, List<String> experience) {
        this.name = name;
        this.surNames = surNames;
        this.email = email;
        this.phone = phone;
        this.country = country;
        this.city = city;
        this.presence = presence;
        this.technologies = technologies;
        this.relocation = relocation;
        this.studies = studies;
        this.complementaryStudies = complementaryStudies;
        this.experience = experience;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurNames() {
        return surNames;
    }

    public void setSurNames(String surNames) {
        this.surNames = surNames;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPresence() {
        return presence;
    }

    public void setPresence(String presence) {
        this.presence = presence;
    }

    public List<String> getTechnologies() {
        return technologies;
    }

    public void setTechnologies(List<String> technologies) {
        this.technologies = technologies;
    }

    public Boolean getRelocation() {
        return relocation;
    }

    public void setRelocation(Boolean relocation) {
        this.relocation = relocation;
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

    public List<String> getExperience() {
        return experience;
    }

    public void setExperience(List<String> experience) {
        this.experience = experience;
    }
}
