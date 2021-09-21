/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaGame;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ArTIK
 */
public class javaGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Программа загадывает число и просит пользователя отгадать
        //Если пользователь отгадал, он выйграл
        //Иначе пользователь, проиграл
        int choise = 0;
        while(choise == 0){
            do{
                int max = 5, min = 0, attempt = 1, userNum = -1;
                Random random = new Random();
                Scanner scanner = new Scanner(System.in);
                int gameNum = random.nextInt(max - min + 1) + min;
                System.out.println("Программа задача числа в диапазоне от 0 до 5, угадай");
                for(int i=0;i<3; i++){
                    userNum = scanner.nextInt();
                    if(gameNum == userNum){
                        System.out.println("Ура! Ты выйграл!");
                        break;
                    }else{
                       if(attempt < 3) {
                           System.out.println("Неправильно, попробуй еще раз");
                      }else{
                       System.out.println("Ты проиграл. Задумано число: " + gameNum);
                   }
                }
                attempt++;
            }
        }    
    }
}
   
