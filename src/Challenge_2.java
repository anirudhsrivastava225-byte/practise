import java.util.* ;
public class Challenge_2 {
    public static void main ( String [] args ) {
        List < Integer > allTickets = new ArrayList <> ( Arrays.asList ( 14, 23, 56, 71, 88, 9, 102, 33 ) ) ;
        List < Integer > vipTickets = new ArrayList <> () ;
        List < Integer > normalTickets = new ArrayList <> () ;
        for ( Integer item : allTickets ) {
            if ( item % 2 == 0 ) {
                vipTickets.add ( item ) ;
            }
            else normalTickets.add ( item ) ;
        }
        System.out.println ( " The complete list of tickets is : " ) ;
        for ( Integer item : allTickets ) {
            System.out.print ( item + " " ) ;
        }
        System.out.println ( " " ) ;
        System.out.println ( "The vip list of tickets is : " ) ;
        for ( Integer item : vipTickets ) {
            System.out.print ( item + " " ) ;
        }
        System.out.println ( " " ) ;
        System.out.println ( " The normal list of tickets is : " ) ;
        for ( Integer item : normalTickets ) {
            System.out.print ( item + " " ) ;
        }
        System.out.println ( " " ) ;
    }
}