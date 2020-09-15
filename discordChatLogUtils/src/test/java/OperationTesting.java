
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class OperationTesting {

    @Test
    public void testComparisonOperations(){

        Map<String,Integer> oldWords = new HashMap<>();
        oldWords.put("a",2);
        oldWords.put("b",3);
        oldWords.put("c",4);

        Map<String,Integer> newWords = new HashMap<>();
        newWords.put("b",1);
        newWords.put("c",5);
        newWords.put("d",5);

        Map<String,Integer> difference = Utils.ComparisonOperations.mapValueDifference(oldWords,newWords);

        assert difference.get("a") == -2;
        assert difference.get("b") == -2;
        assert difference.get("c") == 1;
        assert difference.get("d") == 5;

    }

}
