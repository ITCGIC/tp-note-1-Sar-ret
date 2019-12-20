
import java.util.*;
public class Task2 {
        public static void main (String[] args) {
            Scanner in = new Scanner (System.in);
            System.out.print("Input number of seconds: ");
            int seconds = in.nextInt(); 
            int sec = seconds % 60;
            int hour = seconds / 60;
            int min = hour % 60;
                hour = hour / 60;
            System.out.print("Time corresponding to " + seconds + "second is " + hour + ":" + min + ":" + sec);
            
        }
    }