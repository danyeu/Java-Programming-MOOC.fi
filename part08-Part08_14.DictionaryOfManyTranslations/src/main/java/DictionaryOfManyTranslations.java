import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;

public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> dict;
    public DictionaryOfManyTranslations() {
        this.dict = new HashMap<>();
    }
    public void add(String key, String value) {
        if (dict.containsKey(key)) {
            for (String translation : dict.get(key)) {
                if (translation.equals(value)) {
                    return;
                }
            }
            dict.get(key).add(value);
        } else {
            ArrayList<String> list = new ArrayList<>();
            list.add(value);
            dict.put(key, list);
        }
    }
    public ArrayList<String> translate(String word) {
        if (dict.containsKey(word)) {
            return dict.get(word);
        }
        return new ArrayList<>();
    }
    public void remove(String word) {
        dict.remove(word);
    }
}
