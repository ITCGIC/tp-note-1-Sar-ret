package tp_note_1;
import java.util.*;

public class Task5 {
    public static void main (String[] args){
        System.out.print("\n");
        System.out.println("Program for converting money in Riels to Dollars.");
        
        System.out.println("Conversion rate is: 1 USD = 4000 RIELS");

        Scanner sca = new Scanner(System.in);
        
        System.out.print("Please input money in Riels: ");
        double Riels = sca.nextDouble();
        double rate = Riels / 4000;
        System.out.print(Riels+" Riels = "+rate+" USD");
    }
}