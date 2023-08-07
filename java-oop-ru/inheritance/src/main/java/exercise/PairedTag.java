package exercise;

import java.util.ArrayList;
import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class PairedTag extends Tag{

    List<Tag> tags;
    String value;

    public PairedTag(
            String tagName,
            Map<String, String> attrs,
            String value,
            List<Tag> tags
    ) {
        super(tagName, attrs);
        this.tags = tags;
        this.value = value;
    }

    private String collectChildTags(){
        String result = "";
        for (Tag el: tags){
            result += "<" + el.tagName + " " + new StringBuilder(el.getStringFromMap()).delete(0,1) + ">";
        }
        return result;
    }

    @Override
    public String toString(){
        return "<" + this.tagName  + this.getStringFromMap() + ">" + this.collectChildTags() + this.value +   "</" + this.tagName +">";
    }

}
// END
