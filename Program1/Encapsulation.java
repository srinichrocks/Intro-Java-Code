public class Foothill06 {
    public static void main(String[] args) {
        System.out.println(testValue.testValue());
    }
}

class testValue {
    public static String testValue() {
        //instantiate 4 objects of triplestring
        TripleString t1 = new TripleString();
        TripleString t2 = new TripleString("Warriors", "rockets", "thunder");
        TripleString t3 = new TripleString();
        TripleString t4 = new TripleString("cavs", "rockets", "thunder");
        //print them out
        System.out.println(t1.toString());
        System.out.println(t2.toString());
        System.out.println(t3.toString());
        System.out.println(t4.toString());
        //mutate one or more members of each object
        t1.setString1("hello");
        t2.setString1("yeet");
        t3.setString3("bye");
        t4.setString2("my name is jeff");
        //display all objects a second time
        System.out.println(t1.toString());
        System.out.println(t2.toString());
        System.out.println(t3.toString());
        System.out.println(t4.toString());
        return "";
    }
}

class TripleString {
    private String string1;
    private String string2;
    private String string3;
    private static final int MIN_LEN = 1;
    private static final int MAX_LEN = 50;
    private static final String DEFAULT_STRING = "(undefined)";
    TripleString() {
        string1 = DEFAULT_STRING;
        string2 = DEFAULT_STRING;
        string3 = DEFAULT_STRING;

    }
    TripleString(String str1, String str2, String str3) {
        string1 = str1;
        string2 = str2;
        string3 = str3;
    }
    boolean validateString(String str) {
        int stringLength = str.length();
        if (str != null || stringLength < MAX_LEN || stringLength < MIN_LEN) {
            return true;
        }
        return false;
    }
    public void setString1(String str) {
        if (!validateString(string1)) {
            return;
        }
        string1 = str;
    }
    public void setString2(String str) {
        if (!validateString(string2)) {
            return;
        }
        string2 = str;
    }
    public void setString3(String str) {
        if (!validateString(string3)) {
            return;
        }
        string3 = str;
    }
    public String toString() {
        return string1 + "" + string2 + "" + string3;
    }
    public String getString1() {
        return string1;
    }
    public String getString2() {
        return string2;
    }
    public String getString3() {
        return string3;
    }
}

//public int getYear() {//getter
//        return year;

//name of method must always be toString() for public String ____
