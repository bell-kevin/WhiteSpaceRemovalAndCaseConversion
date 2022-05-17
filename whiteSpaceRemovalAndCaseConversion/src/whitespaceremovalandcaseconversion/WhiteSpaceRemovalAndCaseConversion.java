package whitespaceremovalandcaseconversion;

public class WhiteSpaceRemovalAndCaseConversion {

    public static void main(String[] args) {
        String hamlet = "To be, or not to be: that is the question;";
        int index = hamlet.indexOf(':');
        String hamlet2 = hamlet.substring(index + 1);
        System.out.println(hamlet2);
        hamlet2 = hamlet2.trim();
        hamlet2 = hamlet2.toUpperCase();
        System.out.println(hamlet2);
    }
}
