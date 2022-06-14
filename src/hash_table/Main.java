package hash_table;

public class Main {
    public static void main(String[] args) {
        Employee jamesJones = new Employee("James","Jones",1738);
        Employee peterHarold = new Employee("Peter","Harold",4291);
        Employee carsonKent = new Employee("Carson","Kent",788);
        Employee jonathanPeace = new Employee("Jonathan","Peace",900);


        SimpleHashTable ht = new SimpleHashTable();
        ht.put("Jones",jamesJones);
        ht.put("Harold",peterHarold);
        ht.put("Kent",carsonKent);
        ht.put("Peace",jonathanPeace);

        System.out.println("*".repeat(25));

        ht.printHashTable();

        System.out.println("*".repeat(25));

        System.out.println("Retrieved Employee: " + ht.get("Jones"));

    }
}
