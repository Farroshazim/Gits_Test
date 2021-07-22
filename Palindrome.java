package gits_1811082022;

import java.util.*;
public class Palindrome {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan kalimat: ");
        String a = scan.nextLine();
        StringBuilder a1 = new StringBuilder();
        a1.append(a);
        a1.reverse();
        
        if (a.equalsIgnoreCase(a1.toString())){
            System.out.println("True");
        }
        else{
             System.out.println("False");
        }
 
        
    }
}
