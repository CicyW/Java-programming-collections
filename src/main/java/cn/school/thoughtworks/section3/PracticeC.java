package cn.school.thoughtworks.section3;

import java.util.*;

public class PracticeC {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        Set<String> unique = new HashSet(collectionA);
        Map<String, Integer> collection3 = new HashMap<String, Integer>();
        for (String temp : unique) {
            collection3.put(temp,Collections.frequency(collectionA, temp));
        }
        List<String> value = object.get("value");
        for (String s:value){
            collection3.put(s,collection3.get(s)-collection3.get(s)/3);
        }
        return collection3;
    }
}
