package exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// BEGIN
class App{
    public static void swapKeyValue(KeyValueStorage map){
        String newKey = "";
        String newValue = "";
        for(Map.Entry<String, String> entry: map.toMap().entrySet()){
            newKey = entry.getValue();
            newValue = entry.getKey();
            map.unset(entry.getKey());
            map.set(newKey, newValue);

        }
    }
}
// END
