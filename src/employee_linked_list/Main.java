package employee_linked_list;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee(null,"Samuel",23);
        Employee employee2 = new Employee("Bayo","Ifabiyi",15);
        Employee employee3 = new Employee("Adeola","Stephen",11);
        Employee employee4 = new Employee("Sikiru","Love",9);


        EmployeeLinkedList list = new EmployeeLinkedList();

        list.addToFront(employee1);
        list.addToFront(employee2);
        list.addToFront(employee3);
        list.addToFront(employee4);


        list.printList();
    }


}
