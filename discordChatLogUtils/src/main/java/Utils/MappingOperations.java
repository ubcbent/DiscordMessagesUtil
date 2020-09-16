package Utils;

import MessageBeans.Message;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MappingOperations {

    /**
     *
     * @param messages
     * @return Map<String,Integer> - Map of words mapped to frequency
     */
    public static Map<String,Integer> mapWordsToFrequency(List<Message> messages){
        Map<String,Integer> frequencies = new HashMap<>();
        for(Message message : messages){
            String[] words = message.getContent().replaceAll("[^a-zA-Z ]","").toUpperCase().split(" ");
            for(String word : words){
                if(frequencies.containsKey(word)){
                    frequencies.put(word,frequencies.get(word)+1);
                }else{
                    frequencies.put(word,1);
                }
            }
        }
        return frequencies;
    }
}
