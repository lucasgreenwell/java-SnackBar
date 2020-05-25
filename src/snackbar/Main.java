package snackbar;

public class Main {
    public static void main(String[] args){

        //initialize machines
        VendingMachine foodMachine = new VendingMachine("food");
        VendingMachine drinkMachine = new VendingMachine("drink");
        VendingMachine officeMachine = new VendingMachine("office");

        //initialize snacks
        Snack chips = new Snack("chips", 36, 1.75, foodMachine.getId());
        Snack chocalateBar = new Snack("chocalate bar", 36, 1.00, foodMachine.getId());
        Snack pretzel = new Snack("pretzel", 30, 2.00, foodMachine.getId());
        Snack soda = new Snack("soda", 24, 2.50, drinkMachine.getId());
        Snack water = new Snack("water", 20, 2.75, drinkMachine.getId());

        //initialize customers
        Customer jane = new Customer("Jane", 45.25);
        Customer bob = new Customer("Bob", 33.14);



//        Customer 1 (Jane) buys 3 of snack 4 (Soda).
//            Print Customer 1 (Jane) Cash on hand.
        jane.buySnacks(3 * soda.getCost());
        soda.buySnack(3);
        System.out.println(jane.getName() + " bought 3 sodas and now has " + jane.getCashOnHand());

//        Print quantity of snack 4 (Soda).
        System.out.println(soda.getQuantity());

//            Customer 1 (Jane) buys 1 of snack 3 (Pretzel)
//            Print Customer 1 (Jane) Cash on hand.
        jane.buySnacks(pretzel.getCost());
        pretzel.buySnack(1);
        System.out.println(jane.getName() + " bought pretzels and now has " + jane.getCashOnHand());

//        Print quantity of snack 3 (Pretzel).
        System.out.println(pretzel.getQuantity());

//            Customer 2 (Bob) buys 2 of snack 4 (Soda).
//            Print Customer 2 (Bob) Cash on Hand.
        bob.buySnacks(2 * soda.getCost());
        soda.buySnack(2);
        System.out.println(bob.getName() + " bought 2 sodas and now has " + bob.getCashOnHand());

//        Print quantity of snack 4 (Soda).
        System.out.println(soda.getQuantity());


//            Customer 1 (Jane) finds $10.
//            Print Customer 1 (Jane) Cash on Hand.
        jane.addCash(10);
        System.out.println(jane.getCashOnHand());

//        Customer 1 (Jane) buys 1 of snack 2 (Chocolate Bar).
//        Print Customer 1 (Jane) Cash on Hand.
        jane.buySnacks(chocalateBar.getCost());
        chocalateBar.buySnack(1);
        System.out.println(jane.getName() + " bought chocalate and now has " + jane.getCashOnHand());

//        Print quantity of snack 2 (Chocolate Bar).
        System.out.println(chocalateBar.getQuantity());

//        Add 12 more items to snack 3 (Pretzel).
//            Print quantity of snack 3 (Pretzel).
        pretzel.addQuantity(3);
        System.out.println(pretzel.getQuantity());

//            Customer 2 (Bob) buys 3 of snack 3 (Pretzel).
//            Print Customer 2 (Bob) Cash on hand.
        bob.buySnacks(3 * pretzel.getCost());
        pretzel.buySnack(3);
        System.out.println(bob.getName() + " bought pretzels and now has " + bob.getCashOnHand());

//        Print quantity of snack 3 (Pretzel).
        System.out.println(pretzel.getQuantity());
    }
}