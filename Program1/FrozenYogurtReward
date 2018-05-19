import java.util.Scanner;

public class Foothill04 {

    private static final int NUM_OF_STAMPS_FREE_YOGURT = 7;

    public static void main(String[] args) {
        int userStampBalance = 0;
        while (true) {
            System.out.println("Options:");
            System.out.println("p(process purchase)");
            System.out.println("s(shut down)");
            System.out.println("Please choose an option...");
            Scanner scanner = new Scanner(System.in);
            String customerResponse = scanner.nextLine();
            if (customerResponse.charAt(0) == ('s')) {
                System.out.println("Goodbye");
                break;
            }
            if (customerResponse.charAt(0) != ('p')) {
                System.out.println("Error");
                continue;
            }
            if (userStampBalance >= 7) {
                System.out.println("Options:");
                System.out.println("n(no)");
                System.out.println("y(yes)");
                System.out.println("You qualify for a free yogurt, do you want to use your credits?");
                Scanner scanner2 = new Scanner(System.in);
                String customerResponse2 = scanner2.next();
                if (customerResponse2.charAt(0) == ('n')) {
                    continue;
                } else if (customerResponse2.charAt(0) == ('y')) {
                    userStampBalance -= NUM_OF_STAMPS_FREE_YOGURT;
                    System.out.println("Here is your 1 free yogurt and you now have " + userStampBalance +
                            " stamps left in your account");
                    continue;
                } else {
                    System.out.println("Error,invalid response!");
                }

            }//less than 7
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("How many yogurts do you want to purchase:");
            int numberOfYogurts = scanner1.nextInt();
            if (numberOfYogurts < 0) {
                System.out.println("Error");
                continue;
            }
            userStampBalance += numberOfYogurts;
            System.out.println("You have " + userStampBalance + " stamps");

        }


    }
}









/*Normal Transaction
Ask the user/operator how many yogurts are being purchased, and add this number to the customers account/wallet/stamps.
At the end of the transaction, display the total/accumulated number of stamps earned so far, including the current transaction.


 */


//If the user opts for a free yogurt, give them one yogurt, display the new, reduced total number of stamps available
// and end the transaction, moving on to the next pass.  To keep things simple, we will not allow purchase of multiple
// yogurts when an award yogurt is being redeemed.  We reduce the number of credits by 7 (or whatever the qualifying
// number is for our system).  We don't add any credits/stamps for the award yogurt.  Even if the user has, say, 24
// stamps, they can only get one yogurt in a single transaction, and the new balance will be 24 - 7 = 17, allowing
// the user to get another free yogurt on the next transaction.
//If the user opts to not take the award, then the sequence of events turns into a Normal Transaction, in which the user
// can request to purchase one or more yogurts and the corresponding number of stamps is credited to the customer's balance.
