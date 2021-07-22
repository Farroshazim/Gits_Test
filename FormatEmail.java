package gits_1811082022;

import java.lang.*;
import java.io.*;
import java.util.*;
import java.util.regex.Pattern;
public class FormatEmail {
    public static void main(String []args) {
      Scanner scan = new Scanner(System.in);
      System.out.print("Masukkan email: ");
      String email = scan.nextLine();
      String regex = "^([a-z0-9_.-]{4,20}+)@([a-z0-9]+).((co).)?(id)$";
      
      System.out.println(Pattern.matches(regex, email));
      
    }
}
