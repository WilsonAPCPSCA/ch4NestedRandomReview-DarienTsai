/**
 * Created by Darien on 10/18/2017.
 * This simulates a dice toss and reports it in a textual histogram
 */
import java.util.Scanner;
public class diceHistogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many times would you like the dice to be tossed?");
        int roll = 0;
        if (in.hasNextInt()) {
            roll = in.nextInt();
        } else {
            System.out.println("Invalid input");
        }
        int sum = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        int five = 0;
        int six = 0;
        int seven = 0;
        int eight = 0;
        int nine = 0;
        int ten = 0;
        int eleven = 0;
        int twelve = 0;
        int temp = 0;
        System.out.println("Here's the sequence of sums");
        for (int i = roll; i > 0; i--) {
            temp = (int) (Math.random() * 11 + 2);
            System.out.print(temp + " ");
            switch (temp) {
                case 2:
                    two++;
                    break;
                case 3:
                    three++;
                    break;
                case 4:
                    four++;
                    break;
                case 5:
                    five++;
                    break;
                case 6:
                    six++;
                    break;
                case 7:
                    seven++;
                    break;
                case 8:
                    eight++;
                    break;
                case 9:
                    nine++;
                    break;
                case 10:
                    ten++;
                    break;
                case 11:
                    eleven++;
                    break;
                case 12:
                    twelve++;
                    break;
            }
        }
        System.out.println("");
        for (int i = 2; i < 13; i++) {
            System.out.print(i + ":");
            switch(i) {
                case 2:
                    print(two);
                    break;
                case 3:
                    print(three);
                    break;
                case 4:
                    print(four);
                    break;
                case 5:
                    print(five);
                    break;
                case 6:
                    print(six);
                    break;
                case 7:
                    print(seven);
                    break;
                case 8:
                    print(eight);
                    break;
                case 9:
                    print(nine);
                    break;
                case 10:
                    print(ten);
                    break;
                case 11:
                    print(eleven);
                    break;
                case 12:
                    print(twelve);
                    break;
            }
            System.out.println("");
        }
    }
        public static void print(int x){
        for(int i = x; i > 0; i--){
            System.out.print("*");
        }
    }
}
