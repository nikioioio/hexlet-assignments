package exercise;

// BEGIN
public class LabelTag implements TagInterface{

    String label;
    TagInterface labelTag;


    LabelTag(String label, TagInterface labelTag){
        this.label = label;
        this.labelTag = labelTag;
    }

    @Override
    public String render() {
        return "<label>Press Submit" + labelTag.render() + "</label>";
    }
}
// END
