/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptv20zadanie2;

import java.util.Scanner;

/**
 *
 * @author ArTIK
 */
public class SPTV20Zadanie2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.printf("Введите число: ");
        int userNum = scanner.nextInt();
        int num1 = userNum/100;
        int num2 = userNum/10%10;
        int num3 = userNum%10;
        int summa = num1+num2+num3;
        System.out.println("Сумма трёхзначных чисел: "+summa);
        
    }
    
}
