package Lesson11;

import Lesson11.Rada.Deputy;
import Lesson11.Rada.Partia;
import Lesson11.Rada.Util;

import java.util.*;

import static java.util.List.*;

public class Main {
    public static void main(String[] args){

        Map<String, Partia> rada = new HashMap<>();
        Util util = new Util();
        Deputy deputy1 = new Deputy("deputy1", false);
        Deputy deputy2 = new Deputy("deputy2", false);
        Deputy deputy3 = new Deputy("deputy3", false);
        Deputy deputy4 = new Deputy("deputy4", false);
        Deputy deputy5 = new Deputy("deputy5", false);
        Deputy deputy6 = new Deputy("deputy6", false);
        Deputy deputy7 = new Deputy("deputy7", false);
        Deputy deputy8 = new Deputy("deputy8", false);

        List<Deputy> koalitionList = new ArrayList<>();
        koalitionList.add(deputy1);
        koalitionList.add(deputy2);
        koalitionList.add(deputy3);
        koalitionList.add(deputy4);

        List<Deputy> oppositionList = new ArrayList<>();
        oppositionList.add(deputy5);
        oppositionList.add(deputy6);
        oppositionList.add(deputy7);
        oppositionList.add(deputy8);

        Partia koalition = new Partia(koalitionList);
        Partia opposition = new Partia(oppositionList);

        rada.put("koalition", koalition);
        rada.put("opposition", opposition);

        util.takeBribe(rada);
        util.findBribeTaker(rada);
        util.findBribeTaker(rada);

        if (Objects.nonNull(util.bribeTakersInPartia(rada, koalition.toString()))){
            String bribeTaker = util.bribeTakersInPartia(rada, oppositionList.toString());
            System.out.println("Bribe taker is " + bribeTaker);

            String partiaWithBribes = util.bribeTakersInPartia(rada, bribeTaker);
            System.out.println("Deputy from partia " + partiaWithBribes);

            util.getRidOfPartiaOfBribeTakers(rada.get(bribeTaker), bribeTaker);
            System.out.println("Partia got rid of bribe taker");}
            else{
            System.out.println("No bribe takers.");
        }

        util.suggestBribeToEveryDeputy(rada);

    }
}
