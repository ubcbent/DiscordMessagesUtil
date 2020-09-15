
import Utils.FilterOperations;
import Utils.MappingOperations;
import Utils.MessageFileParser;
import Utils.SortingOperations;
import MessageBeans.Message;

import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

public class Sandbox {

    public static void main(String[] args) {
        List<Message> messages = new MessageFileParser().parseMessages("C:\\Users\\benti\\OneDrive\\Documents\\Direct Messages - Private - RadiantRobyn [592447353487622161].txt");

        List<Map.Entry<String,Integer>> entries = SortingOperations.sortMapByValue(
                MappingOperations.mapWordsToFrequency(
                        FilterOperations.whereTimeLessEqual(new Timestamp(1580515200),
                                FilterOperations.whereTimeGreaterEqual(
                                        new Timestamp(1577836800),messages
                                )
                        )
                )
        );
        for(Map.Entry<String,Integer> entry : entries){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
