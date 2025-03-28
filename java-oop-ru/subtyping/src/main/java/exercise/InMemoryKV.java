package exercise;

import java.util.LinkedHashMap;
import java.util.Map;

// BEGIN
public class InMemoryKV implements KeyValueStorage {

    private final Map<String, String> dictionary;

    public InMemoryKV(Map<String, String> dictionary) {
        this.dictionary = new LinkedHashMap<>(dictionary);
    }

    @Override
    public void set(String key, String value) {
        dictionary.put(key, value);
    }

    @Override
    public String get(String key, String defaultValue) {
        return dictionary.getOrDefault(key, defaultValue);
    }

    @Override
    public void unset(String key) {
        dictionary.remove(key);
    }

    @Override
    public LinkedHashMap<String, String> toMap() {
        return new LinkedHashMap<>(dictionary);
    }
}
// END
