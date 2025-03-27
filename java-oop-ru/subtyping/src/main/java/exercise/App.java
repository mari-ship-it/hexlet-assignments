package exercise;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

// BEGIN
public class App {

    public static void swapKeyValue(KeyValueStorage storage) {

        var entries = storage.toMap().entrySet();

        for (var entry : entries) {
            storage.unset(entry.getKey());
            storage.set(entry.getValue(), entry.getKey());
        }
    }
}
// END
