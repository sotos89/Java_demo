package gr.aueb.elearn.ch8.maps;

import com.sun.xml.internal.xsom.impl.scd.Step;

import java.util.*;

public class MapsDemo {

    public static void main(String[] args) {
        Map<String, String> countries = new HashMap<>();
//        Map<String, String> countries = new LinkedHashMap<>(); // καταταξη κατά της σειρά εισαγωγής
//        Map<String, String> countries = new TreeMap<>(); //Λεξικογραφική ascii based καταταξη



        countries.put("GR", "Greece");
        countries.put("FR", "France");
        countries.put("USA", "United State of America");
        countries.put("IT", "Italy");

        Iterator<Map.Entry<String, String>> iterator = countries.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> entry = iterator.next();
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }

        for (Map.Entry<String, String> entry : countries.entrySet()){
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }

        countries.forEach((k, v) -> System.out.println(k + "\t" + v));

        Iterator<Map.Entry<String, String>> iterator1 = countries.entrySet().iterator();
        while (iterator1.hasNext()){
            Map.Entry<String, String> entry = iterator1.next();
            if(entry.getKey().equals("FR")){
                iterator1.remove();
            }
        }
        countries.forEach((k, v) -> System.out.println(k + "\t" + v));

        Iterator<Map.Entry<String, String>> iterator2 = countries.entrySet().iterator();
        List<String> toBeRemoved = new ArrayList<>();

        while (iterator2.hasNext()){
            Map.Entry<String, String> entry = iterator2.next();
            if(entry.getKey().matches("[A-Z]{2}")){
                toBeRemoved.add(entry.getKey());
            }
        }
        toBeRemoved.forEach(countries::remove);
        countries.forEach((k,v) -> System.out.println(k + "\t" + v));
    }
}
