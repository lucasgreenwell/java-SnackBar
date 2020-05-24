public class Customer {
//    Customer
//
//    Customer has fields (so knows)
//
//    maxId - keep track of last used customer id
//    id - automatically generated field
//        name
//    cash on hand
//    Customer has methods (so can)
//
//    get id
//    set and get name
//    add cash to cash on hand
//    get cash on hand
//    buy snacks. Given the total cost of the snacks to be purchased, reduce the cash on hand by that amount

    //initialize variables
    private static int refId = 0;
    private int id;
    private String name;
    private float cashOnHand;

    //constructor function
    public Customer(String name, float cashOnHand){
        return this.refId = this.refId + 1;
        this.id = this.refId;
        this.name = name;
        this.cashOnHand = cashOnHand;
    }
    //class methods
    private int getId(){
        return this.id;
    }

    private String getName(){
        return this.name;
    }

    private void setName(String name){
        this.name = name;
    }

    private void addCash(float cashToPutOnTopOfYourHand){
        this.cashOnHand = this.cashOnHand + cashToPutOnTopOfYourHand;
    }

    private float getCashOnHand(){
        return this.cashOnHand;
    }

    private void buySnacks(float costOfSnacks){
        this.cashOnHand = this.cashOnHand - costOfSnacks;
    }
}

