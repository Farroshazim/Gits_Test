package gits_1811082022;
import java.util.Scanner;
public class KonversiWaktu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Pukul: ");
        String waktu = scan.nextLine();
  
        
        
        String[] arr = waktu.split(":");
        int jam = Integer.parseInt(arr[0]);
        int menit = Integer.parseInt(arr[1]);
        int detik = Integer.parseInt(arr[2]);
        String h = arr[0];
if ((jam<=12) && (menit<=59) && (detik<=59)){
        System.out.print("Waktu: ");
        String ampm = scan.nextLine();
        
        if ((jam<=12) && (menit<=59) && (detik<=59) && ((ampm.equalsIgnoreCase("am")) || (ampm.equalsIgnoreCase("pm")))) {
             if (ampm.equalsIgnoreCase("am") && jam==12) {
                 h = "00";
             } else if (ampm.equalsIgnoreCase("pm") && jam<12){
                 h = String.valueOf(jam+12);
             }
             System.out.println(h+":"+arr[1]+":"+arr[2]);
        } else {
            System.out.println("Format salah");
            System.exit(0);
        }
       
}
else {
            System.out.println("Format salah");
            System.exit(0);
        }
}
}

