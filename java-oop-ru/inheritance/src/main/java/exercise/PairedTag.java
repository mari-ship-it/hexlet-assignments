package exercise;

import java.util.Map;
import java.util.List;
//import java.util.stream.Collectors;

// BEGIN
public class PairedTag extends Tag {

    private String bodyTag;
    List<Tag> children;

    PairedTag(String name, Map<String, String> map, String bodyTag, List<Tag> children) {
        super(name, map);
        this.bodyTag = bodyTag;
        this.children = children;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(super.toString()).append(bodyTag);

        for (var child : children) {
            String string = child.toString();
            result.append(string);
        }

        result.append("</").append(name).append(">");
        return result.toString();
    }
}
// END
