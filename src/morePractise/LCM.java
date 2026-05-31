package morePractise;
import java.util.Scanner ;
public class LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in ) ;
        System.out.print( " Enter the 1st number: " ) ;
        int a = input.nextInt () ;
        System.out.println( " " ) ;
        System.out.print( " Enter the 2nd number: " ) ;
        int b = input.nextInt () ;
        System.out.println( " " ) ;
        System.out.println( " The L.C.M. of " + a + " and " +  b  + " is " + lcm ( a , b ) + ". " ) ;
    }
    // Recursive Function for finding H.C.F.
    public static int lcm ( int m , int n ) {
        if ( m == 0 || n == 0 ) return 0 ;
        return m * ( n / hcf ( m , n ) ) ;
    }

    public static int hcf ( int p , int q ) {
        if ( q == 0 ) return p ;
        return hcf ( q , p%q ) ;
    }
}
