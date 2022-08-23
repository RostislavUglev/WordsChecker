import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordsChecker {
    protected String text;

    public WordsChecker(String text) {
        this.text = text;
    }

    public boolean hasWord(String word, String text) {
        Set<String> set = new HashSet<>();
        String[] SplitText = text.split("\\P{IsAlphabetic}+");
        set.addAll(List.of(SplitText));
        if (set.contains(word)) {
            return true;
        }
        return false;
    }

}
