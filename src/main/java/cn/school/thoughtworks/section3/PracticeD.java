package cn.school.thoughtworks.section3;

import java.util.*;

public class PracticeD {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        Set<String> unique = new HashSet(collectionA);
        Map<String, Integer> collection3 = new HashMap<String, Integer>();
        for (String temp : unique) {
            int num = 0;
            if(temp.contains("-")){
                num = Integer.parseInt(temp.substring(temp.indexOf('-')+1,temp.length()));
                temp = temp.substring(0,temp.indexOf('-'));
            }else{
                num = Collections.frequency(collectionA, temp);
            }
            if(collection3.get(temp)!=null)
                collection3.put(temp,collection3.get(temp)+num);
            else
                collection3.put(temp,num);
        }
        List<String> value = object.get("value");
        for (String s:value){
            collection3.put(s,collection3.get(s)-collection3.get(s)/3);
        }
        return collection3;
    }
}
