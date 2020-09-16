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
    public static List<Message> whereMessageMatches(String regex, List<Message> messages){
        return messages.stream().filter(message -> {
            System.out.println(message.getContent().matches(regex));
            return message.getContent().matches(regex);
        }
        ).collect(Collectors.toList());
    }
    public static List<Message> whereMessageContains(String key, List<Message> messages, boolean caseSensitive){
        if(caseSensitive) {
            return whereMessageMatches(".*(" + key + ").*", messages);
        }
        return messages.stream().filter(message -> message.getContent().toUpperCase().contains(key.toUpperCase())).collect(Collectors.toList());
    }
}
