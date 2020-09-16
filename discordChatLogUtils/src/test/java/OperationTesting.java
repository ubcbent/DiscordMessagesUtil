
import MessageBeans.Message;
import Utils.FilterOperations;
import org.junit.Test;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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

    @Test
    public void testFilterOperations(){

        Message m1 = new Message("Test_User",new Timestamp(0),"This message contains the word 'yeet'");
        Message m2 = new Message("Test_User",new Timestamp(0),"This message does not");
        List<Message> messages = new ArrayList<>();
        messages.add(m1);
        messages.add(m2);

        //Test whereMessageContains
        List<Message> m = FilterOperations.whereMessageContains("yeet",messages,true);
        assert m.size()==1;
        assert m.get(0).equals(m1);


    }

}
