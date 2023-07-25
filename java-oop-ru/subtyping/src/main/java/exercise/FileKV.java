package exercise;

import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

// BEGIN
class FileKV implements KeyValueStorage{

    Map<String, String> map;
    String pathFile;

    FileKV(String pathFileInput, Map<String, String> mapInput){
        map = new HashMap<>(mapInput);
        pathFile = pathFileInput;
    }

    @Override
    public void set(String key, String value) {
        map.put(key, value);
//        Map<String, String> newKV = new HashMap<>(Map.of(key, value));
//        System.out.println("");
//        Utils.writeFile(pathFile,Utils.serialize(newKV));
    }

    @Override
    public void unset(String key) {
        map.remove(key);
    }

    @Override
    public String get(String key, String defaultValue) {
        return map.getOrDefault(key, defaultValue);
    }

    @Override
    public Map<String, String> toMap() {
        Utils.writeFile(pathFile,Utils.serialize(map));
        return new HashMap<>(map);
    }
}
// END
