package whatisthecard;

import java.util.Scanner;
// UVa 10646
public class WhatIsTheCard {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] card = new String[52];
        int t, c, x, y, removeCards, top, times, removeCardsSum, remainingCards, count;
        char v;
        
        t = in.nextInt();
        count = 1;
        while (count <= t) {
            // resetting the variables for each test case
            c = 51;
            y = 0;
            top = 25;
            times = 3;
            removeCardsSum = 0;
            
            // filling the array with the cards value from bottom to top 51 - 0 
            while (c >= 0) {
                card[c] = in.next();
                c--;
            }
            while (times != 0) {
                v = card[top].charAt(0);
                if (v >= '2' && v <= '9') {
                    x = v - '0'; // deleting the '0' take out the string property of ending with '0'
                } else {
                    x = 10;
                }
                y += x;
                removeCards = 10 - x;
                removeCardsSum += removeCards + 1;
                //remove cards
                top += removeCards + 1;
                times--;
            }
            remainingCards = 27 - removeCardsSum;
            c = 25 - (y - remainingCards);
            
            /*Since y is alwyes greater > than the number of remaining cards
            (tested by different input sizes 20 and 666 (uDebug.com) andd get AC)
            we need to skip the remaining cards indeces and go further 
            to the returned 25 cards from the hand (0 - 24 indeces)
            and count from the bottom of that x would be y minus the 
            number of remaining cards so that the target index is 
            24 - x + 1 where +1 came just to get the right index since 
            the array starts at 0
            
            Other suitable equations: 
            c = 24 - (y - remainingCards) + 1;
            24 to be the index of the bottom of the cards were at the hand 
            
            c = 52 - removeCardsSum - remainingCards - (y - remainingCards);
            52 - removeCardsSum - remainingCards will alwayes be 25*/
            
            System.out.printf("Case %d: %s\n", count, card[c]);
            count++;
        }
    }
}
