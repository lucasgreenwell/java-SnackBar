package snackbar;

public class Customer {


    //initialize variables
    private static int refId = 0;
    private int id;
    private String name;
    private double cashOnHand;

    //constructor function
    public Customer(String name, double cashOnHand){
        this.refId = this.refId + 1;
        this.id = this.refId;
        this.name = name;
        this.cashOnHand = cashOnHand;
    }
    //class methods
    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void addCash(double cashToPutOnTopOfYourHand){
        this.cashOnHand = this.cashOnHand + cashToPutOnTopOfYourHand;
    }

    public double getCashOnHand(){
        return this.cashOnHand;
    }

    public void buySnacks(double costOfSnacks){
        this.cashOnHand = this.cashOnHand - costOfSnacks;
    }
}

