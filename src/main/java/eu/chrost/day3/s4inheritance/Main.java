package eu.chrost.day3.s4inheritance;

class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Marcin", 1000);
        employee.displayInfo();
        System.out.println(employee);

        Manager manager = new Manager("Ola", 10000, "R&D");
        manager.displayInfo();
        System.out.println(manager);

        employee.whoAmI();
        manager.whoAmI();

        Employee hiddenManager = manager;
        hiddenManager.whoAmI();

        Object veryHiddenManager = manager;
        Employee veryHiddenEmployee = (Employee) veryHiddenManager;
        veryHiddenEmployee.whoAmI();

        if (veryHiddenManager instanceof String veryHiddenString) {
            //to sie nigdy nie wykona
        }

        Manager revealedManager = (Manager) veryHiddenManager;
        revealedManager.whoAmI();


    }
}
