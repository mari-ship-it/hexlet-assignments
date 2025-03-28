package exercise;

import java.util.Map;

// BEGIN
public class FileKV implements KeyValueStorage {

    private final String path;
    private Map<String, String> dictionary;

    public FileKV(String path, Map<String, String> dictionary) {
        this.path = path;
        this.dictionary = dictionary;
        String serialize = Utils.serialize(this.dictionary);
        Utils.writeFile(this.path, serialize);
    }

    @Override
    public void set(String key, String value) {
        String json = Utils.readFile(path);
        Map<String, String> deserialize = Utils.deserialize(json);
        deserialize.put(key, value);
        this.dictionary = deserialize;
        String serialize = Utils.serialize(this.dictionary);
        Utils.writeFile(path, serialize);
    }

    @Override
    public void unset(String key) {
        String json = Utils.readFile(path);
        Map<String, String> deserialize = Utils.deserialize(json);
        deserialize.remove(key);
        this.dictionary = deserialize;
        String serialize = Utils.serialize(this.dictionary);
        Utils.writeFile(path, serialize);
    }

    @Override
    public String get(String key, String defaultValue) {
        return dictionary.getOrDefault(key, defaultValue);
    }

    @Override
    public Map<String, String> toMap() {
        return dictionary;
    }
}
// END
