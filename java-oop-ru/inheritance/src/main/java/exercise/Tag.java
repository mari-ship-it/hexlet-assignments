package exercise;

//import java.util.stream.Collectors;
import java.util.Map;

// BEGIN
public class Tag {

    protected final String name;
    private final Map<String, String> map;

    Tag(String name, Map<String, String> map) {
        this.name = name;
        this.map = map;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("<").append(name).append(" ");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            result.append(key).append("=\"").append(value).append("\" ");
        }

        return result.toString().trim() + ">";
    }
}
// END
