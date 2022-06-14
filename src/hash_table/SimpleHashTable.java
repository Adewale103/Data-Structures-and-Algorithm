package hash_table;

public class SimpleHashTable {
  private Employee[] hashTable;

  public SimpleHashTable(){
      hashTable = new Employee[10];
  }

  private int hashKey(String key){
      return key.length() % hashTable.length;
  }

  public void put(String key, Employee employee){
      int hashedKey = hashKey(key);
      if(hashTable[hashedKey] != null){
          System.out.println("Sorry, index "+ hashedKey+" is already filled with an employee!" );
      }
      else{
          hashTable[hashedKey] = employee;
      }
  }

  public Employee get(String key){
      int hashedKey = hashKey(key);
      return hashTable[hashedKey];
  }

  public void printHashTable(){
      for (Employee employee : hashTable) {
          System.out.println(employee);
      }
  }
}
