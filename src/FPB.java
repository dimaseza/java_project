
import java.util.*;


public class FPB {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bilangan 1: ");
        int angka1 = input.nextInt();
        
        System.out.print("Bilangan 2: ");
        int angka2 = input.nextInt();
        
        while (angka1 != angka2) {
            if (angka1 > angka2) {
                angka1 = angka1 - angka2;
            } else {
                angka2 = angka2 - angka1;
            }
        }
        
        System.out.println("FPB " + angka1);
    }
}
