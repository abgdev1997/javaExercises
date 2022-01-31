package service;

import models.Candidates;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ColectionService {
    
    CandidatesService candidatesService = new CandidatesService();
    
    ArrayList<Candidates> candidates = candidatesService.candidates;

    public void printTopCities(){
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Madrid", candidatesService.cityFilter("Madrid").size());
        map.put("Barcelona", candidatesService.cityFilter("Barcelona").size());
        map.put("Valencia", candidatesService.cityFilter("Valencia").size());
        map.put("Sevilla", candidatesService.cityFilter("Sevilla").size());
        map.put("Malaga", candidatesService.cityFilter("Malaga").size());
        map.put("Cordoba", candidatesService.cityFilter("Cordoba").size());

        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);
    }

    public void printTopCountries(){
        HashMap<String, Integer> map = new HashMap<>();
        map.put("España", candidatesService.countryFilter("España").size());
        map.put("Francia", candidatesService.countryFilter("Francia").size());
        map.put("Argentina", candidatesService.countryFilter("Argentina").size());
        map.put("Italia", candidatesService.countryFilter("Italia").size());
        map.put("Alemania", candidatesService.countryFilter("Alemania").size());
        map.put("EEUU", candidatesService.countryFilter("EEUU").size());

        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);
    }
    
    public int totalRemote(){
        return candidatesService.presenceFilter("Remote").size();
    }

    public int possibilityRelocation(){
        return candidatesService.relocationFilter(true).size();
    }

    public int noPossibilityRelocation(){
        return candidatesService.relocationFilter(false).size();
    }
}
