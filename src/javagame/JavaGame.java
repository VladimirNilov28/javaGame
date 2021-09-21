/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagame;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class JavaGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int max = 5, min = 0;
        Random random = new Random();
        int Gaynum = random.nextInt(max - min + 1) + min;
        System.out.println("Programma zagadala chislo v dipozone ot nuljz do 10ti, ugandaj");
        Scanner scanner = new Scanner (System.in);
        int userNum =scanner.nextInt();
        if(Gaynum == userNum){
            System.out.println("You win!!!");
        }else{
            System.out.println("You lose(((" + Gaynum);
        }
    }
    
}
