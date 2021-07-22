
package gits_1811082022;

import java.util.Scanner;
public class HelloWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan nilai bilangan: ");
        int a = scan.nextInt();
        
        if(a%3==0 && a%5==0){
            System.out.println("Hello World");
        }
        else if(a%3==0){
            System.out.println("Hello");
        }
        else if(a%5==0){
            System.out.println("World");
        }
        else{            
        }
    }   
}
