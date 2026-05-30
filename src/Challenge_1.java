import java.util.* ;
public class Challenge_1 {
    public static void main ( String[] RGS ) {
        List < String > vendingMachine = new ArrayList <> ( Arrays.asList ( "Cola", "EMPTY", "Chips", "EMPTY", "Candy", "Water", "EMPTY" ) ) ;
        int index = 0 ;
        int count = 0 ;

        for ( String item : vendingMachine ){
            if ( item.equals("EMPTY") ) {
                vendingMachine.set( index , "RESTOCKED ITEM" ) ;
                count ++ ;
            }
            index ++ ;
        }
        System.out.println ( " There were " + count + " empty slots " ) ;
        System.out.println ( " The updated inventory of vending machine is : " ) ;
        count = 0 ;
        for ( String item : vendingMachine ) {
            System.out.println ( " Slot " + ( count += 1 ) + " : " + item ) ;
        }
    }

}