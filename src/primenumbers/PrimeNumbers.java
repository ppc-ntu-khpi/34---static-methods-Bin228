/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primenumbers;

import domain.Exercise;
import java.util.Scanner;

/**
 *
 * @author vipbi
 */
public class PrimeNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.println(Exercise.Calculate(in.nextInt(),in.nextInt()));
    }
    
}
