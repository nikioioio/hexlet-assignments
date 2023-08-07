package exercise;

import java.util.stream.Collectors;
import java.util.Map;

// BEGIN
public class Tag {

    String tagName;
    Map<String, String> attrs;

    public Tag(String tagName, Map<String, String> attrs){
        this.tagName = tagName;
        this.attrs = attrs;
    }

    protected String getStringFromMap(){
        String mapAsString = attrs.keySet().stream()
                .map(key -> key + "=" + "\"" + attrs.get(key) + "\"" )
                .collect(Collectors.joining(" "));
        if (!mapAsString.isEmpty())
            return " " + mapAsString;
        return mapAsString;
    }
}
// END
