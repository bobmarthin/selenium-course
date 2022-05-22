//Exception Unchecked

package Main;

public class CheckedException {
    private void SomeMethod() throws InterruptedException {
        System.out.println("something");
        Thread.sleep(2000);
        System.out.println("something");
    }

}
