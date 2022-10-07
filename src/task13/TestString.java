package task13;

public class TestString {
    private String str;
    public void setStr(String str) {
        this.str = str;
    }
    public String getStr() {
        return str;
    }

    public static void main(String[] args) {
        TestString test = new TestString();
        test.setStr("I like Java!!!");
        String st = test.getStr();
        System.out.println("Last symbol is: " + st.charAt(st.length()-1));
        System.out.println("String ends with !!!: " + st.endsWith("!!!"));
        System.out.println("String starts with I like: " + st.startsWith("I like"));
        System.out.println("String contains Java: " + st.contains("Java"));
        System.out.println("Index of Java in the string: " + st.indexOf("Java"));
        System.out.println("A replaced by o: " + st.replace('a', 'o'));
        System.out.println("String to upper case: " + st.toUpperCase());
        System.out.println("String to lower case: " + st.toLowerCase());
        System.out.println("Cut substring Java: " + st.substring(7, 11));
    }
}
