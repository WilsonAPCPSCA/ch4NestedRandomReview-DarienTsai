/**
 * Created by Darien on 10/18/2017.
 * This was created to simulate coin flips
 */
import java.util.Scanner;
public class CoinFlip {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("This simulates flipping a fair coin \n");
        System.out.print("How many times would you like the coin to be flipped?");
        int flip = 0;
        if(in.hasNextInt())
            flip = in.nextInt();
        else
            System.out.println("bad input");

        double temp = 0;
        int head = 0;
        int tail = 0;
        System.out.println("Here's the sequence");
        for (int i = flip; i > 0; i--){
            temp = Math.random();
            if (temp > 0.5) {
                head++;
                System.out.print("T");
            }
            else {
                tail++;
                System.out.print("F");
            }
        }
        System.out.println("");
        System.out.println("There were " + head + " heads and " + tail + " tails.");

    }
}
