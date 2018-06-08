import java.util.Scanner;

public class Foothill05 {


    private static Scanner userInput = new Scanner(System.in);
    public static void main(String[] args) {
        char charAnswer = getKeyCharacter().charAt(0);
        String stringAnswer = getString();

        String maskCharacter = maskCharacter(stringAnswer, charAnswer);
        System.out.println(maskCharacter);
        System.out.println("\n");
        String removeCharacter = removeCharacter(stringAnswer, charAnswer);
        System.out.println(removeCharacter);
        System.out.println("\n");
        int countKey = countKey(stringAnswer, charAnswer);
        System.out.println(countKey);
    }

    private static String getKeyCharacter() {
        System.out.println("Please enter a SINGLE character to act as key:");
        String UserInputChars = userInput.nextLine();
        //first one
        if (UserInputChars.length() == 1) {
            return UserInputChars;
        }

        while (true) {
            System.out.println("Please enter a SINGLE character to act as key:");
            UserInputChars = userInput.nextLine();
            int numofChars = UserInputChars.length();
            if (numofChars == 1) {
                return UserInputChars;
            }
        }
    }


    private static final int MIN_LENGTH_OF_STRING = 4;
    private static final int MAX_LENGTH_OF_STRING = 1500;

    private static String getString() {
        while (true) {
            System.out.println("Please enter a phrase or sentence >=4 and <=500");
            String UserInputString = userInput.nextLine();
            int numOfCharsInStrings = UserInputString.length();
            if (numOfCharsInStrings < MIN_LENGTH_OF_STRING || numOfCharsInStrings > MAX_LENGTH_OF_STRING) {
                continue;
            }
            System.out.println("\n");
            return UserInputString;
        }


    }

    private static String maskCharacter(String theString, char keyCharacter) {
        System.out.println("String with " + keyCharacter + " masked:");
        String newString = "";
        int length = theString.length();
        for (int t = 0; t < length; t++) {
            char letter = theString.charAt(t);
            if (letter != keyCharacter) {
                newString += letter;
            } else newString += "$";
        }
        return newString;
    }

    private static String removeCharacter(String theString, char keyCharacter) {
        String result = "";
        int length = theString.length();
        for (int t = 0; t < length; t++) {
            char letter = theString.charAt(t);
            if (letter != keyCharacter) {
                result += letter;
            }
        }
        System.out.println("String with " + keyCharacter + " removed:");
        return result;
    }

    private static int countKey(String theString, char keyCharacter) {
        System.out.println("#"+keyCharacter+"'s");
        int length = theString.length();
        int sum = 0;
        for (int t = 0; t < length; t++) {
            char letter = theString.charAt(t);
            if (letter != keyCharacter) {
                continue;
            }
            sum += 1;
        }
        return sum;
    }


}

