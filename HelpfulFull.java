/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpfulfull;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author saharalwadei
 */
public class HelpfulFull {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String inputLine = keyboard.nextLine();
        /*inputLine = inputLine.replace("+", "");
        char[] numbers = inputLine.toCharArray();
        Arrays.sort(numbers);
        for (int i = 0; i < inputLine.length(); i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print("+");
            }
        }
        System.out.println();
        */
            StringTokenizer wordFinder = new StringTokenizer(inputLine, "+");
        int[] tokens = new int[wordFinder.countTokens()];

        for (int i = 0; i < tokens.length; i++) {
            tokens[i] = Integer.parseInt(wordFinder.nextToken());
        }
        Arrays.sort(tokens);

        for (int i = 0; i < tokens.length; i++) {
            System.out.print(tokens[i]);
            if (i < tokens.length - 1) {
                System.out.print("+");
            }
        }
            
            System.out.println();
        

    }
}
