package exercise;

import java.util.Map;

// BEGIN
public class SingleTag extends Tag {
    SingleTag(String tagName, Map<String, String> attrs){
        super(tagName, attrs);
    }

    @Override
    public String toString() {
        return "<" + this.tagName  + this.getStringFromMap() + ">";
    }
}
// END
