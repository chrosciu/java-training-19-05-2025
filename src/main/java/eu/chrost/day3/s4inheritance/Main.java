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
        System.out.println(hiddenManager);

        Object veryHiddenManager = manager;
        //veryHiddenManager.whoAmI() //nie kompiluje sie
        Employee veryHiddenEmployee = (Employee) veryHiddenManager;
        veryHiddenEmployee.whoAmI();

       //String veryHiddenManagerAsString = (String) veryHiddenManager; //kompiluje sie ale w runtime rzuca ClassCastException

        if (veryHiddenManager instanceof String veryHiddenString) {
            //to sie nigdy nie wykona
        }

        Manager revealedManager = (Manager) veryHiddenManager;
        revealedManager.whoAmI();

        if (veryHiddenManager instanceof Manager revealedAgainManager) {
            revealedAgainManager.whoAmI();
        }
    }
}
