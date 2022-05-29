// Will finally be executed ?

package Lesson7;

public class exercise {
    private static void method ()
    {
        System.out.println("open connection ");
        try
        {
            String str =null;
            str.toString();
            return;
        } finally {
            System.out.println("close connection ");
        }
    }

     public static void main(String[] args) {
        method();

    }

}
