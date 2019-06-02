package Lesson11.Rada;

import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.Set;

public class Util {
    public void takeBribe(Map<String, Partia> rada){
        int random = new Random().nextInt();
        int quantity = 0;
        Set<Map.Entry<String, Partia>> entry = rada.entrySet();
        for (Map.Entry<String, Partia> nameOfDeputy : entry){
            for (Deputy deputy:nameOfDeputy.getValue().getDeputies()){
                quantity++;
                if(quantity == random){
                    deputy.setBribeTaker(true);
                    System.out.println("Deputy took a bribe");
                    break;
                }
            }
        }
    }

    public Deputy findBribeTaker(Map<String,Partia>rada){
        Set<Map.Entry<String, Partia>> entries = rada.entrySet();
        for (Map.Entry<String, Partia> deputyName:entries){
            for(Deputy deputy : deputyName.getValue().getDeputies()){
                if(deputy.isBribeTaker()){
                    System.out.println(deputy);
                    return deputy;
                }
            }
        } return null;
    }

    public String bribeTakersInPartia(Map<String, Partia> council, String bribeTaker){
        Set<Map.Entry<String,Partia>> entries = council.entrySet();
        for (Map.Entry<String, Partia> deputyName : entries){
            for (Deputy deputy : deputyName.getValue().getDeputies()){
                if (Objects.equals(deputy.getName(), bribeTaker)){
                    System.out.println(deputy);
                    return deputyName.getKey();
                }
            }
        } return null;
    }

    public boolean getRidOfPartiaOfBribeTakers(Partia partia, String deputy){
        return partia.getDeputies().remove(deputy);
    }

    public void suggestBribeToEveryDeputy(Map<String, Partia> rada){
        Set<Map.Entry<String,Partia>> entries = rada.entrySet();
        for (Map.Entry<String, Partia> deputyName : entries){
            for (Deputy deputy: deputyName.getValue().getDeputies()){
                deputy.setBribeTaker(true);
                System.out.println(deputy);
            }
        }
    }


}
