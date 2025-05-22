package eu.chrost.day4.s1abstract.lectures;

class Dachshund extends Dog {
    public Dachshund(String name) {
        super(name);
    }

    // nie kompiluje sie - nie wolno nadpisac metody typu final
//    @Override
//    public String greet() {
//        return super.greet();
//    }
}
