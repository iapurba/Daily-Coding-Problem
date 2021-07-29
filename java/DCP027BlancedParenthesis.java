import java.util.Stack;

public class DCP027BlancedParenthesis {
  public static boolean isBalanced(String s) {
    Stack<Character> leftChars = new Stack<>();

    for (int i = 0; i < s.length(); i++) {
      // Push left brackets
      if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
        leftChars.push(s.charAt(i));
      } else {
        // Unmatch right brackets
        if (leftChars.isEmpty()) {
          return false;
        }
        // Ensure a match 
        if (s.charAt(i) == ')' && leftChars.peek() != '(' || s.charAt(i) == '}' && leftChars.peek() != '{'
            || s.charAt(i) == ']' && leftChars.peek() != '[') {
          return false;
        }
        // Good match, pop
        leftChars.pop();
      }
    }
    return leftChars.isEmpty();
  }

  public static void main(String[] args) {
    System.out.println(isBalanced("{[](){[]}}"));
    System.out.println(isBalanced("(((({["));
  }
}
