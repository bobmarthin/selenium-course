/*Tip 09 - Why do we need static variables

To be able to use the same variable in different methods
*/

package Main;
import static java.lang.System.out;

public class StaticVariables {
    private static int count=0;
    public void incrementcount(){
        count++;
    }

    public int getCount(){
        return count;
    }

    public static void main(String[] args) {
        StaticVariables staticVariable = new StaticVariables();
        staticVariable.incrementcount();
        System.out.println("print");
        out.println(staticVariable.getCount());

        StaticVariables staticVariable1 = new StaticVariables();
        staticVariable1.incrementcount();
        out.println(staticVariable1.getCount());
    }

}



