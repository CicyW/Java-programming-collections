package cn.school.thoughtworks.section2;

import java.util.*;

public class PracticeC {
    Map<String, Integer> countSameElements(List<String> collection1) {
        Set<String> unique = new HashSet(collection1);
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (String temp : unique) {
            int num = 0;
            if(temp.contains("-")||temp.contains(":")){//默认"-"或":"后是一个整数
                int location = temp.indexOf('-')>temp.indexOf(':')?temp.indexOf('-'):temp.indexOf(':');
                num = Integer.parseInt(temp.substring(location+1,temp.length()));
                temp = temp.substring(0,location);
            }else{
                num = Collections.frequency(collection1, temp);
            }
            if (temp.indexOf('[')>0&&temp.indexOf('[')<temp.indexOf(']')){
                num = Integer.parseInt(temp.substring(temp.indexOf('[')+1,temp.indexOf(']')));
                temp = temp.substring(0,temp.indexOf('['));
            }
            if(map.get(temp)!=null)
                map.put(temp,map.get(temp)+num);
            else
                map.put(temp,num);
        }
        return map;
    }
}
