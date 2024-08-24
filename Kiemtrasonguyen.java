/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kiemtrasonguyen;

import java.util.Scanner;

/**
 *
 * @author phant
 */
public class Kiemtrasonguyen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap x");
        int x =scanner.nextInt();
        if (x>0){
            System.out.println("Postive");
        }else if (x<0){
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }
    
}
    }
    
}
