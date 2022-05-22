/*
Basics of Exceptions - NullPointerException and StackTrace

Order of execution in case of exception


in ArrayIndexOutOfBoundsException
in finally
after method1
method2
main method
 */

package Main;



public class NullPointerException1 {
    public static void main(String[] args) {
//        String str1="abc";
//        String str=null;
//        System.out.println(str1.length());
//        try {
//            str.length();
//        } catch (Exception exception)
//        {
//            exception.printStackTrace();
//            System.out.println("in exception");
//        }
//        System.out.println("after NullPointer");
        method2();
        System.out.println("main method");

    }


    private static void method1() {
        try {
            int[] i = {1, 2};
            i[3] = 3;

            String str=null;
            str.length();
            System.out.println("in try");
        }
        catch (NullPointerException exception)
        {

            System.out.println("in Null pointer exception");
        }
        catch (ArrayIndexOutOfBoundsException exception)
        {

            System.out.println("in ArrayIndexOutOfBoundsException ");
            System.exit(1);

        }
        catch (Exception exception){
            exception.printStackTrace();
        }
        finally {
//            object.closeconection() //example
            System.out.println("in finally ");
        }
        System.out.println("after method1");
    }

    private static void method2() {
        method1();
        System.out.println("method2");
    }

}