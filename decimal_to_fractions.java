import java.io.*;
import java.util.*;
public class decimal_to_fractions {
    public static void main(String[] args) throws Exception {
        while (true) {
            canap();
        }
    }
    public static int gcd(int a, int b) {
        int i, hcf = 0;
      for(i = 1; i <= a || i <= b; i++) {
         if( a%i == 0 && b%i == 0 )
         hcf = i;
      }
      return hcf;
    }
    public static void canap() throws Exception {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader reader2 = new BufferedReader(reader);
        Scanner sca = new Scanner(System.in);
        String a, b, c, l, f;
        int s, bb, cc, jj, d, e, za;
        System.out.print("Enter integer part of the number: ");
        a = sca.next();
        System.out.print("Enter non-repeating decimal part of the number: ");
        b = reader2.readLine();
        bb = b.length();
        System.out.print("Enter the infinitely repeating decimal part of the number: ");
        c = reader2.readLine();
        cc = c.length();
        s = Integer.parseInt(a+b+c);
        l = "You have entered " + a + "." + b;
        for (int i = 0; i <l.length();i++){
            System.out.print(" ");
        }
        if (c.length() > 0) {
            for (int i = 0; i < c.length(); i++){
                System.out.print("_");
            }
        }
        System.out.println("\n" + l + c);
        if (c.equals("") == false) {
            jj = bb + cc;
            if (b.equals("") == true) {
                d = (int) (Math.pow(10, cc)-1);
                za = s-Integer.parseInt(a);
            }else {
                d = (int)(Math.pow(10,jj)-Math.pow(10,(bb)));
                za = s-Integer.parseInt(a+b);
            }
            e = gcd(za, d);
            f = ((za/e)+"/"+(d/e));
        }else {
            d = (int)(Math.pow(10, bb));
            e = gcd(s,d);
            f = ((s/e)+"/"+(d/e));
        }
        System.out.println("Fraction is: " + f);
    }
}
