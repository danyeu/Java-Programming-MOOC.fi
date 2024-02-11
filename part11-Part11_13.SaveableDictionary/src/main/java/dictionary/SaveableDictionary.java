package dictionary;

import java.io.File;
import java.io.PrintWriter;
import java.util.*;

public class SaveableDictionary {
    private Map<String,String> dict;
    private String file;

    public SaveableDictionary() {
        this.dict = new HashMap<>();
    }
    public SaveableDictionary(String file) {
        this.dict = new HashMap<>();
        this.file = file;
    }
    public boolean load() {
        try (Scanner fileReader = new Scanner(new File(file))) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(":");
                add(parts[0], parts[1]);
                add(parts[1], parts[0]);
            }
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    public boolean save() {
        Set<String> translationsWritten = new HashSet<>();
        try (PrintWriter writer = new PrintWriter(file)) {
            for (String key: dict.keySet()) {
                if (translationsWritten.contains(key)) {
                    continue;
                }
                writer.println(key + ":" + dict.get(key));
                translationsWritten.add(dict.get(key));
            }
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    public void add(String word, String translation) {
        if (!dict.containsKey(word)) {
            dict.put(word, translation);
        }
        if (!dict.containsKey(translation)) {
            dict.put(translation, word);
        }
    }
    public String translate(String word) {
        return dict.get(word);
    }
    public void delete(String word) {
        if (dict.containsKey(word)) {
            dict.remove(dict.get(word));
            dict.remove(word);
        }
    }
}
