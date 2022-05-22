//Tip 03 - equals method
package Main;

public class EqualsMethod {

    public static void main(String[] args) {
        //Client class is defined above
        Client C1=new Client(1);
        Client C2 =new Client(2);

        System.out.println("1".equals("1"));
        System.out.println("1".equals("2"));
        System.out.println(C1.equals(C2));

    }
}
