package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        List<String> value = object.get("value");
        for (String s:value){
            collectionA.put(s,collectionA.get(s)-collectionA.get(s)/3);
        }
        return collectionA;
    }
}
