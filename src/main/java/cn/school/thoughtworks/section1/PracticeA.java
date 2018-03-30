package cn.school.thoughtworks.section1;

import java.util.List;
import static java.util.stream.Collectors.toList;

public class PracticeA {
    List<String> collectSameElements(List<String> collection1, List<String> collection2) {
        List<String> intersection = collection1.stream().filter(item -> collection2.contains(item)).collect(toList());
        return intersection;
    }
}
