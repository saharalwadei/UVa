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

            for (int i = 0, j = word.length() - 1; i < m && j > m; i++, j--) {
                if (i == j) {
                    break;
                }
                f = word.charAt(i);
                b = word.charAt(j);
                //if (word.charAt(i) == getReverse(word.charAt(j))){

                if (f != b) {
                    if (f != getReverse(b)) {
                        mS = false;
                    } else {
                        rP = false;
                        continue;
                    }
                    rS = true;
                    mS = false;
                    rP = false;
                    break;
                } //f == b  A A . E 3
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
            case 'E':
                return '3';
            case '3':
                return 'E';
            case 'J':
                return 'L';
            case 'L':
                return 'J';
            case 'S':
                return '2';
            case '2':
                return 'S';
            case 'Z':
                return '5';
            case '5':
                return 'Z';
        }
        return c;
    }
}
