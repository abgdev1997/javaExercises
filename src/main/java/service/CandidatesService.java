package service;

import models.Candidates;

import java.util.ArrayList;

public class CandidatesService {

    ArrayList<Candidates> candidates = new ArrayList<>();

    public void addCandidate(Candidates candidate){
        candidates.add(candidate);
        System.out.println("Candidate added successfully!");
    }

    public void deleteCandidate(String email){
        candidates.removeIf(candidate -> candidate.getEmail().equals(email));
    }

    public ArrayList<Candidates> cityFilter(String city){
        ArrayList<Candidates> candidatesCity = new ArrayList<>();
        for (Candidates candidate : candidates){
            if(candidate.getCity().equals(city)){
                candidatesCity.add(candidate);
            }
        }
        return candidatesCity;
    }

    public ArrayList<Candidates> countryFilter(String country){
        ArrayList<Candidates> candidatesCity = new ArrayList<>();
        for (Candidates candidate : candidates){
            if(candidate.getCountry().equals(country)){
                candidatesCity.add(candidate);
            }
        }
        return candidatesCity;
    }

    public ArrayList<Candidates> presenceFilter(String presence){
        ArrayList<Candidates> candidatesPresence = new ArrayList<>();
        for (Candidates candidate : candidates){
            if(candidate.getPresence().equals(presence)){
                candidatesPresence.add(candidate);
            }
        }
        return candidatesPresence;
    }

    public ArrayList<Candidates> relocationFilter(Boolean relocation){
        ArrayList<Candidates> candidatesRelocation = new ArrayList<>();
        for (Candidates candidate : candidates){
            if(relocation.equals(candidate.getRelocation())){
                candidatesRelocation.add(candidate);
            }
        }
        return candidatesRelocation;
    }

    public ArrayList<Candidates> multipleFilter(String city, String presence, Boolean relocation){
        ArrayList<Candidates> candidatesMultiple = new ArrayList<>();
        for (Candidates candidate : candidates){
            if(candidate.getCity().equals(city)){
                if (candidate.getPresence().equals(presence)){
                    if(candidate.getRelocation().equals(relocation)){
                        candidatesMultiple.add(candidate);
                    }
                }
            }
        }
        return candidatesMultiple;
    }

    public Candidates seachByEmail(String email){
        for (Candidates candidate : candidates){
            if(email.equals(candidate.getEmail())){
                return candidate;
            }
        }
        return null;
    }

    public Candidates seachByPhone(String phone){
        for (Candidates candidate : candidates){
            if(phone.equals(candidate.getPhone())){
                return candidate;
            }
        }
        return null;
    }
}
