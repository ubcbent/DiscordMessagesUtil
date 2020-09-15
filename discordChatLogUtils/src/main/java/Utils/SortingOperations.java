package Utils;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortingOperations {

    public static List<Map.Entry<String,Integer>> sortMapByValue(Map<String,Integer> map){
        return map.entrySet().stream().sorted((e1,e2) -> e2.getValue().compareTo(e1.getValue())).collect(Collectors.toList());
    }
}
