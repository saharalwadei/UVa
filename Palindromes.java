package palindromes;

import java.util.Scanner;

/**
 * UVa 401
 * @author saharalwadei
 */
public class Palindromes {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String word;
        int m;
        boolean rS, rP, mS;
        char f, b;
        String state;
        while (in.hasNext()) {
            word = in.next();
            m = word.length() / 2;
            rS = false;
            rP = true;
            mS = true;
            state = "--";

            for (int i = 0, j = word.length() - 1; i <= m && j >= m; i++, j--) {
                
                f = word.charAt(i);
                b = word.charAt(j);
                
                //if (word.charAt(i) == getReverse(word.charAt(j))){
                if (f != b) {
                    rS = true;
                    rP = false;
                } 
                if (f != getReverse(b)) {
                    mS = false;
                }
            }

            //if the string is not a palindrome and is not a mirrored string
            if (rS) {
                state = " -- is not a palindrome.\n";
            }
            //if the string is a palindrome and is not a mirrored string
            if (rP && !mS) {
                state = " -- is a regular palindrome.\n";
            }
            //if the string is not a palindrome and is a mirrored string
            if (!rP && mS) {
                state = " -- is a mirrored string.\n";
            }
            // if the string is a palindrome and is a mirrored string
            if (rP && mS) {
                state = " -- is a mirrored palindrome.\n";

            }
            System.out.println(word + state);
        }
    }

    static char getReverse(char c) {
        switch (c) {
            case 'A':
                return 'A';
            case 'E':
                return '3';
            case 'H':
                return 'H';
            case 'I':
                return 'I';
            case 'J':
                return 'L';
            case 'L':
                return 'J';
            case 'M':
                return 'M';
            case 'O':
                return 'O';
            case 'S':
                return '2';
            case 'T':
                return 'T';
            case 'U':
                return 'U';
            case 'V':
                return 'V';
            case 'W':
                return 'W';
            case 'X':
                return 'X';
            case 'Y':
                return 'Y';
            case 'Z':
                return '5';
            case '1':
                return '1';
            case '2':
                return 'S';
            case '3':
                return 'E';
            case '5':
                return 'Z';
            case '8':
                return '8';
        }
        return '-';
    }
}
