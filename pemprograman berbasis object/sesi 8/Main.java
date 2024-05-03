public class Main {

  public static void main(String[] args) {
    String name = "Ahmad Rofiqi";
    int length = name.length();
    System.out.println("Length of the string: " + length);

    String substr = name.substring(7);
    System.out.println("Substring from index 7: " + substr);

    char charAtIndex = name.charAt(4);
    System.out.println("Character at index 4: " + charAtIndex);

    String lowerCaseStr = name.toLowerCase();
    System.out.println("Lowercase string: " + lowerCaseStr);

    String upperCaseStr = name.toUpperCase();
    System.out.println("Uppercase string: " + upperCaseStr);

    String replacedStr = name.replace('o', '0');
    System.out.println("String after replacement: " + replacedStr);

    boolean contains = name.contains("Rofiqi");
    System.out.println("String contains 'Rofiqi': " + contains);

    String anotherStr = "ahmad rofiqi";
    boolean isEqual = name.equals(anotherStr);
    System.out.println("Strings are equal: " + isEqual);

    String caseInsensitiveStr = "AHMAD ROFIQI";
    boolean isEqualIgnoreCase = name.equalsIgnoreCase(caseInsensitiveStr);
    System.out.println("Strings are equal (ignore case): " + isEqualIgnoreCase);

    boolean endsWith = name.endsWith("i");
    System.out.println("String ends with 'i': " + endsWith);
  }
}
