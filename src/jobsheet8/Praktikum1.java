/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet8;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Praktikum1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        boolean running = true;
        int counter = 0;
        String jawab;
        
        while( running ) {
            System.out.println("Apakah anda ingin keluar?");
            System.out.print("Jawab [ya/tidak]> ");

            jawab = scan.nextLine();

       if (jawab.equalsIgnoreCase("ya")) {
            running = true;
        }
                    counter++;
        }

        System.out.println("Anda sudah melakukan perulangan sebanyak " + counter + " kali");



    }
    
    }
