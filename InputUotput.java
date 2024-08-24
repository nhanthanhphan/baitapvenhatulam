/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package input.uotput;

import java.util.Scanner;

/**
 *
 * @author phant
 */
public class InputUotput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap du lieu");
        String name = scanner.nextLine();
        System.out.println("name:" + name);
    }
    
}
