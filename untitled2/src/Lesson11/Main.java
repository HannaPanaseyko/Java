package Lesson11;

import Lesson11.Rada.Deputy;
import Lesson11.Rada.Partia;
import Lesson11.Rada.Util;

import java.util.*;

import static java.util.List.*;

public class Main {
    public static void main(String[] args){

        //List list = new ArrayList();
        //list.add("st");
        //list.add(1);
        //list.add(false);
        //list.add("123");
        //list.add(222);
        //list.add(true);
        //
        //System.out.println(list.get(0));
        //System.out.println(list.get(1));
        //System.out.println(list.get(2));
        //System.out.println(list.lastIndexOf(list));
        //System.out.println(list.remove(1));
        //System.out.println(list);
        //System.out.println(list.set(1, "dff"));
        //System.out.println(list.get(1));
        //System.out.println(list.subList(1, 5));
        //System.out.println(list);
        //
        //Set<String> set = new HashSet<>();
        //set.add("fff");
        //set.add("aaa");
        //set.add("fff");
        //
        //System.out.println(set);
        //
        //Map<String, Integer> map = new HashMap();
        //Map map2 = new LinkedHashMap();
        //Map map3 = new TreeMap();
        //map.put("ff", 1);
        //System.out.println(map);
        //map.put("ff", 2);
        //System.out.println(map);
        //
        //System.out.println(map.containsKey("1"));
        //System.out.println( map.entrySet());
        //System.out.println(map.equals("1"));
        //
        //List<String> strings = new ArrayList<>();
        //strings.add("Af");
        //strings.add("Bg");
        //strings.add("Ch");
        //strings.add("Di");
        //strings.add("Eg");
        //
        //Iterator <String> iterator = strings.iterator();
        //while (iterator.hasNext()) {
        //    if (iterator.next().contains("b")) {
        //        iterator.remove();
        //    }
        //
        //
        //    System.out.println(iterator.next());
        //
        //}
        // дописать метод, который бы давал взятки депутатам нескольким случайным образом
        // второй метод: вывести всех взяточников
        // третий метод: приходит нбу и удаляет всех взяточников из партии
        // если все в партии в взяточники, то удалить партию из мар
        // четвертый метод: дать всем взятку



        //контакт:
        //добавить комператор
        // метод compareTo
        //вместо list использовать set

        //сравнивать по номеру телефона // от большего к меньшему сортировка по числу в номере
        //сравнивать контакты и выводить по имени

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
