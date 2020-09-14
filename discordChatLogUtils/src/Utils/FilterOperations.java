package Utils;

import MessageBeans.Message;

import java.sql.Timestamp;
import java.util.List;
import java.util.stream.Collectors;

public class FilterOperations {

    public static List<Message> whereTimeGreaterEqual(Timestamp time, List<Message> messages){
        return messages.stream().filter(message -> message.getTime().getTime() >= time.getTime()).collect(Collectors.toList());
    }
    public static List<Message> whereTimeLessEqual(Timestamp time, List<Message> messages){
        return messages.stream().filter(message -> message.getTime().getTime() <= time.getTime()).collect(Collectors.toList());
    }
}
