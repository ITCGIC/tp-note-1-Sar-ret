package tp_note_1;
import java.util.*;
public class Task3 {
    public static void main (String[] args) {
        System.out.print("\n");
        System.out.print("Program for converting time to seconds.\n");

        Scanner in = new Scanner (System.in);
        System.out.print("Please input hours: ");
        int hour = in.nextInt();

        System.out.print("Please input minutes: ");
        int min = in.nextInt();

        System.out.print("Please input seconds: ");
        int sec = in.nextInt();

        int result = sec+(60* min) + (3600*hour);
        System.out.print("Number of seconds = "+hour+"x3600 + "+min+"x60 + "+sec+" = " +result);


       
       
    }
}
