

package conditionallogic;


public class IFStatements {

   
    public static void main(String[] args) {
    
        int user = 12;
        
        switch ( user) {
        case 18: 
            System.out.println ("User is 18");
            break;
        case 19: 
            System.out.println ("User is 19");
            break;
        case 20: 
            System.out.println ("User is 20");
            break;
        default:
        System.out.println ("User is not 18, 19 or 20");

        }
        
        /*boolean user = false;

        if ( !user ) {
        System.out.println("it's flase");
        }
        else {
        System.out.println("it's true");
        }
        */
        
        /*int user = 40;
        
        if (user <= 18) {
            System.out.println ("User is 18 or younger");
        }
        else if (user > 18 && user < 40) {
            System.out.println ("User is between 18 and 39");
        }
        else {
            System.out.println ("User is older than 40");
        } */
    }
    
}
