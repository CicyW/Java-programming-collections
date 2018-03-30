package cn.school.thoughtworks.section2;

import java.util.*;


public class PracticeA {
    Map<String,Integer> countSameElements(List<String> collection1) {

        Set<String> unique = new HashSet(collection1);
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (String temp : unique) {
            map.put(temp,Collections.frequency(collection1, temp));
        }
        return map;

    }
}
