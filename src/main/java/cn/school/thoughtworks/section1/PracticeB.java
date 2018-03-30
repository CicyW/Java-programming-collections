package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class PracticeB {
    List<String> collectSameElements(List<String> collection1, List<List<String>> collection2) {
        List<String> intersections = new ArrayList<String>();
        for(List<String> l:collection2){
            List<String> intersection = collection1.stream().filter(item -> l.contains(item)).collect(toList());
            intersections.addAll(intersection);
        }
        return intersections;
    }
}
