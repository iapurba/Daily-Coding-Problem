public class DCP027RunningLengthEncodeDecode {

  public static String encode(String s) {
    if (s.length() == 0) {
      return "";
    }
    String result = "";
    int count = 1;
    char currentChar = s.charAt(0);

    for (int i = 1; i < s.length(); i++) {
      char ch = s.charAt(i);

      if (ch == currentChar) {
        count++;
      } else {
        result = count > 1 ? result + count + currentChar : result + currentChar;
        count = 1;
        currentChar = s.charAt(i);
      }
    }
    result = count > 1 ? result + count + currentChar : result + currentChar;
    return result;
  }

  public static String decode(String s) {
    if (s.length() == 0) {
      return "";
    }
    String result = "";
    int count = 0;

    for (int i = 0; i < s.length(); i++) {
      char currentChar = s.charAt(i);
      if (Character.isDigit(currentChar)) {
        count = count * 10 + Character.getNumericValue(currentChar);
      } else {
        if (count > 1) {
          for (int j = 0; j < count; j++) {
            result += currentChar;
          }
        } else {
          result += currentChar;
        }
        count = 0;
      }
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(encode("AAABCDDEFF"));
    System.out.println(decode("3ABC2DE2F"));
  }
}