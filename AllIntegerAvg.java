package allintegeravg;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * UVa 12060
 *
 * @author saharalwadei
 */
public class AllIntegerAvg {

    public static void main(String[] args) {
        int n, count = 1, sum, m, a, b, c, cDigits, gcd;
        double avg;
        boolean neg = false, aIsZero = false;
        String s;
        Scanner in = new Scanner(System.in);

        while (true) {

            if ((n = in.nextInt()) == 0) {
                break;
            }

            sum = 0;
            s = "";
            neg = false; // critical for printing - before numbers
            for (int i = 0; i < n; i++) {
                sum += in.nextInt();
            }
            avg = (double) sum / n;
            m = sum % n;
            a = (int) avg;
            b = m;
            c = n;

            if (a < 0) {
                neg = true;
            }
            if (a == 0) {
                aIsZero = true;
            }
            if (m != 0) {
                gcd = BigInteger.valueOf(m).gcd(BigInteger.valueOf(n)).intValue();
                if (gcd != 1) {
                    b /= gcd;
                    c /= gcd;

                }
            }

            System.out.printf("Case %d:\n%s", count, formString(a, b, c, neg, aIsZero));
            count++;
        }

    }

    static String formString(int x, int y, int z, boolean negative, boolean xIsZero) {
        String s = "";
        int xDigits, yDigits, zDigits, i, d = 0;
        if (x == 0) {
            xDigits = 0;
        } else {
            xDigits = String.valueOf(x).length();
        }
        yDigits = String.valueOf(y).length();
        zDigits = String.valueOf(z).length();
        if (y != 0) {
            if (y > 0) {
                if (zDigits > yDigits) {
                    d = zDigits - yDigits;
                }
                i = xDigits + d;
                while (i != 0) {
                    s += " ";
                    i--;
                }

                s += Math.abs(y) + "\n";
                if (x != 0) {
                    s += Math.abs(x);
                }

                i = zDigits;
                while (i != 0) {
                    s += "-";
                    i--;
                }
                s += "\n";
                i = xDigits;
                while (i != 0) {
                    s += " ";
                    i--;
                }
                s += z + "\n";
            } else {
                if (zDigits > (yDigits -1)) {
                    d = zDigits - yDigits + 1;
                }
                i = xDigits + d;
                while (i != 0) {
                    s += " ";
                    i--;
                }
                if (x != 0) {
                    s += " ";
                } else {
                    s += "  ";
                }

                s += Math.abs(y) + "\n";
                s += "- ";
                if (x != 0) {
                    s += Math.abs(x);
                }
                i = zDigits;
                while (i != 0) {
                    s += "-";
                    i--;
                }
                s += "\n";
                if (x != 0) {
                    s += " ";
                } else {
                    s += "  ";
                }
                i = xDigits;
                while (i != 0) {
                    s += " ";
                    i--;
                }
                s += z + "\n";
            }

        } else {
            if (negative) {
                s += "- ";
            }
            s += Math.abs(x) + "\n";
        }
        return s;
    }
}
