import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {

  private HashMap<String, ArrayList<String>> dictionaryOfManyTranslations;

  public DictionaryOfManyTranslations() {
    dictionaryOfManyTranslations = new HashMap<>();
  }

  public void add(String word, String translation) {
    if (this.dictionaryOfManyTranslations.containsKey(word)) {
      this.dictionaryOfManyTranslations.get(word).add(translation);
      return;
    }
    ArrayList<String> translations = new ArrayList<>();
    translations.add(translation);
    this.dictionaryOfManyTranslations.put(word, translations);
  }

  public ArrayList<String> translate(String word) {
    if (this.dictionaryOfManyTranslations.get(word) == null) {
      return new ArrayList<>();
    }

    return this.dictionaryOfManyTranslations.get(word);
  }

  public void remove(String word) {
    this.dictionaryOfManyTranslations.remove(word);
  }
}
