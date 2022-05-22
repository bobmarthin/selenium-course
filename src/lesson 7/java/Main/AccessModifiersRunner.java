package Main;

import External.AccessModifiers1;

public class AccessModifiersRunner {

    public static void main(String[] args) {
        AccessModifiers AM=new AccessModifiers();
        AM.main(new String[]{"from AccessModifiers"});


        AccessModifiers1 AM1= new AccessModifiers1();

        // main is defined static : example public static void main(String[] args) - this is the reason we can access directly , without instance
        AccessModifiers1.main(new String[]{"from AccessModifiers1"});

    }

}
