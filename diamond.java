/**
 * Created by Darien on 10/18/2017.
 * This was created to print a diamond
 *
 */
import java.util.Scanner;
public class diamond {
    public static void main(String[] args){
        //input and variables
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a side length");
        int side = in.nextInt();
        int rows = side*2-1;
        int poles = rows/2;
        //max row
        int max = 1+ 2*(side-1);

        //increment loop
        for(int i = 1; i < poles*2; i+=2){
            //number of spaces
            int spaces = (max-i)/2;
            for(int j = spaces; j > 0; j--) {
                System.out.print(" ");
            }
            //number of stars
            for (int j = i; j > 0; j--){
                System.out.print("*");
            }
            System.out.println("");
        }
        //max loop

        for (int i = max; i > 0; i--){
            System.out.print("*");
        }
        System.out.println("");

        //decrement loop
        for(int i = poles*2-1; i > 0; i-=2){
            //number of spaces
            int spaces = (max-i)/2;
            for(int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            //number of stars
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
