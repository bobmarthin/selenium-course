package Lesson7;

// We will learn the difference between default , private and protected from external package
import Lesson7.External.AccessModifiers1;

public class Public {


    public static class DoSomething extends AccessModifiers1 {
        public void publicMethod(){

        }
    }
    public static void main(String[] args) {
        AccessModifiers1 exampleClass=new AccessModifiers1();
//        exampleClass.defaultMethod();
//        exampleClass.privateMethod(); // Can't be accessed out of class
//        exampleClass.protectedMethod(); // Can be accessed from the same class or sub class
        exampleClass.publicMethod();

        //Override can be done to any public and protected method.

    }

}
