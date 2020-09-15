package Utils;

import java.util.HashMap;
import java.util.Map;

public class ComparisonOperations {

    /**
     *
     * @param oldWords - the first set of words, these will be subtracted from the second set
     * @param newWords - the second set of words, these define the later stage which will have the first subtracted to find the difference
     * @return A map containing each word and the difference the second wordset had from the first
     */
    public static Map<String,Integer> mapValueDifference(Map<String,Integer> oldWords, Map<String,Integer> newWords){
        Map<String,Integer> output = new HashMap<>(newWords);

        for(Map.Entry<String,Integer> entry : oldWords.entrySet()){
            if(output.get(entry.getKey())==null){
                output.put(entry.getKey(),entry.getValue()*-1);
            }else{
                output.put(entry.getKey(),(output.get(entry.getKey()).intValue())-(entry.getValue().intValue()));
            }
        }

        return output;
    }
}
