package tp_note_1;
import java.util.*;
public class Task4 {
    public static void main (String[] args){
        System.out.print("\n");
        System.out.print("Program for calculating cost of a call.");

        Scanner in = new Scanner (System.in);
        System.out.print("Please input start hours:");
        int hours = in.nextInt();

        System.out.print("Please input start minutes:");
        int mins = in.nextInt();

        System.out.print("Please input start seconds:");
        int secs = in.nextInt();

        System.out.print("Please input end hours:");
        int houre = in.nextInt();

        System.out.print("Please input end minutes:");
        int mine = in.nextInt();

        System.out.print("Please input end seconds:");
        int sece = in.nextInt();

      int h = houre - hours ;
      int m = mine - mins ;
      int s = sece - secs;

      int total = (h*3600) + (m*60) + s;

      int ss = total % 60;
      int hh = total / 60;
      int mm = hh %60;
        hh = hh /60;
      int new_min = total /60;
        double cost = new_min * 0.05;
        System.out.print("Total call duration: "+hh+" h "+mm+"mn "+ss+"s");
        System.out.print(cost+ "$");
        

    }
}