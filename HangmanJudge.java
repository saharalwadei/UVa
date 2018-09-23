package hangmanjudge;

import java.util.Scanner;

public class HangmanJudge {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int round, mistakes;
        String word, guess, c;
        boolean solvedAll;

        while ((round = in.nextInt()) != -1) {

            word = in.next();
            guess = in.next();
            guess = unique(guess);
            mistakes = 0;
            solvedAll = false;

            for (int i = 0; i < guess.length() && mistakes < 7; i++) {
                /* adding (+ "") to come over the incompatible convert from char to String */
                c = guess.charAt(i) + "";    
                if (word.contains(c)) {
                    word = word.replace(c, ""); 
                } else {
                    mistakes++;
                }
                if (word.length() == 0) {
                    solvedAll = true;
                    break;
                }
            }

            System.out.println("Round " + round);
            if (solvedAll) {
                System.out.println("You win.");
            } else if (mistakes == 7) {
                System.out.println("You lose.");
            } else {
                System.out.println("You chickened out.");
            }

        }

    }

    static String unique(String guess) {
        String s = "";
        char[] charOfGuess = guess.toCharArray();
        /* s.length() <= 26 added to avoid checking extremly long guesses if the 
        guess already has all the letters, getting TLE before adding it */
        for (int i = 0; i < charOfGuess.length && s.length() <= 26; i++) {
            if (!s.contains(charOfGuess[i] + "")) {
                s += charOfGuess[i];
            }
        }
        return s;
    }

}
