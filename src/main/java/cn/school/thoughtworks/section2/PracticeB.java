package cn.school.thoughtworks.section2;

import java.util.*;

public class PracticeB {
    Map<String, Integer> countSameElements(List<String> collection1) {
        Set<String> unique = new HashSet(collection1);
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (String temp : unique) {
            int num = 0;
            if(temp.contains("-")){
                num = Integer.parseInt(temp.substring(temp.indexOf('-')+1,temp.length()));
                temp = temp.substring(0,temp.indexOf('-'));
            }else{
                num = Collections.frequency(collection1, temp);
            }
            if(map.get(temp)!=null)
                map.put(temp,map.get(temp)+num);
            else
                map.put(temp,num);
        }
        return map;
    }
}
