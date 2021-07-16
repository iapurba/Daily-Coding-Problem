import java.util.ArrayList;
import java.util.List;

public class DCP011AutocompleteSystem {
  /*
   * Implement an autocomplete system. That is, given a query string s and a set
   * of all possible query strings, return all strings in the set that have s as a
   * prefix. For example, given the query string de and the set of strings [dog,
   * deer, deal], return [deer, deal].
   */
  
  public static List<String> autocomplete(List<String> wordlist, String prefix) {
    if (wordlist.isEmpty() || prefix.isEmpty() || prefix == null) {
      return new ArrayList<String>();
    }
    Trie trie = new Trie();
    // Inserting all the words in to trie
    for (String word : wordlist) {
      trie.insert(word);
    }

    List<String> result = new ArrayList<>();
    TrieNode current = trie.root;

    if (current.children.isEmpty()) {
      return result;
    }
    for (Character ch : prefix.toCharArray()) {
      current = current.children.get(ch);
      if (current == null) {
        return result;
      }
    }
    autocompleteHelper(current, result, prefix);

    return result;
  }

  public static void autocompleteHelper(TrieNode root, List<String> result, String prefix) {
    if (root.endOfWord) {
      result.add(prefix);
    }
    if (root.children.isEmpty()) {
      return;
    }

    for (char ch : root.children.keySet()) {
      StringBuffer curr = new StringBuffer();
      curr.append(prefix);
      autocompleteHelper(root.children.get(ch), result, curr.append(Character.toString(ch)).toString());
    }
  }

  public static void main(String[] args) {

    List<String> words = List.of("deer", "dog", "deal");
    System.out.println(autocomplete(words, "de"));
    System.out.println(autocomplete(new ArrayList<String>(), null));
  }
}
