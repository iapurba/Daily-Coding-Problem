import java.util.HashMap;
import java.util.Map;

public class TrieNode {
  Map<Character, TrieNode> children;
  boolean endOfWord;

  public TrieNode() {
    this.children = new HashMap<>();
  }
}
