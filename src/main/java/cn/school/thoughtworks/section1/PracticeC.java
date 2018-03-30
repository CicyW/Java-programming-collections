package cn.school.thoughtworks.section1;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.toList;

public class PracticeC {
    List<String> collectSameElements(List<String> collection1, Map<String,List<String>> collection2) {
        List<String> list = collection2.get("value");
        List<String> intersection = collection1.stream().filter(item -> list.contains(item)).collect(toList());
        return intersection;
    }
}
