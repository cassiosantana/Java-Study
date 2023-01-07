public class Main {
    public static void main(String[] args) {

        Client c1 = new Client("Cassio", "cassioo.roger@gmail.com");
        Client c2 = new Client("Karen", "karen@gmail.com");
        Client c3 = new Client("Karen", "karen@gmail.com");

        /*
         * HashCode returns an integer representing a code generated from the object's information. 
         * An object never generates different codes, so if there are two codes it is because the 
         * objects are different. If the codes are the same, probably the objects are also the same 
         * but there may be collisions and that's why we use the hashCode with equals which is a method 
         * that returns a boolean and is accurate.
         */

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());
        System.out.println("--------------------------------");

        System.out.println(c1.equals(c2));
        System.out.println(c2.equals(c3));
        System.out.println(c2 == c3);

        System.out.println("--------------------------------");
        
        String name1 = "Cassio";
        String name2 = "Cassio";
        
        System.out.println(name1.equals(name2));
        System.out.println(name1 == name2);
        
        System.out.println("--------------------------------");
        
        String name3 = new String("Cassio");
        String name4 = new String("Cassio");
        
        System.out.println(name3.equals(name4));
        System.out.println(name3 == name4);

        /*
         * The equals method compares by content and the equality operator (==) compares by reference 
         * except in the case of literals where the compiler treats them differently. For example, 
         * if two variables of type Strings with literal values are compared with (==) the result is true. 
         * To compare them by reference it is necessary to instantiate objects with new String().
         */
    }
}
