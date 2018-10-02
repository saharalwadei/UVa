package newspaper;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


/**
 * UVa 11340
 * @author saharalwadei
 */
public class Newspaper {

    public static void main(String[] args) throws Exception {

        char[] c;
        int[] price;
        int[] count;

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine()), charCount, lineCount;
        String line = "";

        while (t != 0) {

            charCount = Integer.parseInt(in.readLine());
            c = new char[charCount];
            price = new int[charCount];
            count = new int[charCount];
            
            StringTokenizer st = null;


            // to read characters AND THIER PRI
            for (int i = 0; i < c.length; i++) {
                st = new StringTokenizer(in.readLine(), " ");
                c[i] = st.nextToken().charAt(0);
                price[i] = Integer.parseInt(st.nextToken());
            }

            lineCount = Integer.parseInt(in.readLine());
            //in.skip("\n");
            for (int i = 0; i < lineCount; i++) {
                line = in.readLine();
                for (int j = 0; j < line.length(); j++) {
                    for (int k = 0; k < c.length; k++) {
                        if (line.charAt(j) == c[k]) {
                            count[k]++;

                        }
                    }
                }
            }
            
            double totalPrice  = 0;
            
            for (int i = 0; i < charCount; i++){
                totalPrice += count[i] * price[i];
            }
            
            System.out.printf("%.2f$\n",totalPrice / 100 );
            t--;
        }

    }

}
