package gits_1811082022;

import java.lang.*;
import java.io.*;
import java.util.*;
public class Reverse {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan kalimat: ");
        String a = scan.nextLine();
 
        StringBuilder a1 = new StringBuilder();

        a1.append(a);

        a1.reverse();

        System.out.println(a+" reverse to=> "+a1);
        
         
    }
}
