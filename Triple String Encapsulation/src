public class Foothill06 {
    public static void main(String[] args) {
        //instantiate 4 objects of TripleString

        TripleString t1 = new TripleString();
        TripleString t2 = new TripleString("bob", "joe", "hello");
        TripleString t3 = new TripleString();
        TripleString t4 = new TripleString("say", "bye", "dave " + "\n");
        System.out.println("Original 4 objects of triple string: ");
        System.out.println(t1.toString());
        System.out.println(t2.toString());
        System.out.println(t3.toString());
        System.out.println(t4.toString());
        //copy variables for later testing
        String originalT2 = t2.getString1();
        String originalT4 = t4.getString2();
        //mutate one or more members of each object
        t1.setString1("john");
        Boolean T2 = t2.setString1("asadfffffffffffffffffffffffffffffffffffffffffffffffffffffffffs");
        t3.setString3("bad");
        Boolean T4 = t4.setString2("great");
        System.out.println("4 objects of triple string after mutation: ");
        System.out.println(t1.toString());
        System.out.println(t2.toString());
        System.out.println(t3.toString());
        System.out.println(t4.toString());
        //2 accessor calls
        String t2Getstring1 = t2.getString1();
        String t4Getstring2 = t4.getString2();
        System.out.println("The mutator test found the calls a ");
        if ((t2Getstring1 != originalT2) && T2) {//check to see if the set string is false or tru
            System.out.println("Success");
        } else {
            System.out.println("Fail");
        }
        if ((t4Getstring2 != originalT4) && T4) {
            System.out.println("Success");
        } else {
            System.out.println("Fail");
        }
        System.out.println("\n" + "Two accessor call outputs: ");
        System.out.println(t4.getString1());
        System.out.println(t2.getString2());
        System.out.println("\n" + "Testing toString(): ");
        System.out.println(t1.toString());
        System.out.println(t2.toString());
        System.out.println(t3.toString());
        System.out.println(t4.toString());
    }
}

class TripleString {
    public static final int MIN_LEN = 1;
    public static final int MAX_LEN = 50;
    public static final String DEFAULT_STRING = "(undefined)";
    private String string1;
    private String string2;
    private String string3;

    TripleString() {
        string1 = DEFAULT_STRING;
        string2 = DEFAULT_STRING;
        string3 = DEFAULT_STRING;
    }

    TripleString(String str1, String str2, String str3) {
        string1 = str1;
        string2 = str2;
        string3 = str3;
        if (!setString1(str1)) {
            string1 = DEFAULT_STRING;
        } else {
            string1 = str1;
        }
        if (!setString2(str2)) {
            string2 = DEFAULT_STRING;
        } else {
            string2 = str2;
        }
        if (!setString3(str3)) {
            string3 = DEFAULT_STRING;
        } else {
            string3 = str3;
        }
    }

    boolean validateString(String str) {
        //System.out.println("V"+str+"E");
        int stringLength = str.length();
        if (str == null || stringLength > MAX_LEN || stringLength < MIN_LEN) {
            return false;
        } else {
            return true;
        }
    }

    public boolean setString1(String str) {
        if (!validateString(str)) {
            return false;
        }
        this.string1 = str;
        return true;
    }

    public boolean setString2(String str) {
        if (validateString(str)) {
            string2 = str;
            return true;
        }
        return false;
    }

    public boolean setString3(String str) {
        if (validateString(str)) {
            string3 = str;
            return true;
        }
        return false;
    }

    public String toString() {
        return string1 + "  " + string2 + "  " + string3;
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
