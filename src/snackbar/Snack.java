package snackBar;


//Snack has fields (so knows)
//
//    maxId - keep track of last used snack id
//    id - automatically generated field
//    name
//    quantity
//    cost
//    vending machine id
public class Snack {
    //initialize variables
    //private makes the variable only available within the instance, by its own methods
    //static keeps it from being reset when the class is called
    private static int refId = 0;
    private int id;
    private String name;
    private int quantity;
    private float cost;
    private int machineId;

    //constructor function
    public Snack(String name, int quantity, float cost, int machineId){
        this.refId = this.refId + 1;
        this.id = this.refId;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.machineId = machineId;
    }

//    Snack has methods (so can)
//
//    get id
//    set and get name
//    set and get cost
//    set and get vending machine id
//    get quantity
//    add quantity when given how many to add
//    buy snack when given how many to buy
//    get total cost given a quantity


    //class methods

    public int getId(){
        return id;
    }

    // void means that you're not returning anything
    //just like Ruby getter and setter functions
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setCost(int cost){
        this.cost = cost;
    }

    public int getCost(){
        return cost;
    }

    public void setMachineId(int id){
        this.machineId = id;
    }

    public int getMachineId(){
        return this.machineId;
    }

    public int getQuantity(){
        return quantity;
    }

    public void addQuantity(int newSnacks){
        this.quantity = newSnacks + this.quantity;
    }

    public void buySnack(int snacksGettingBought){
        this.quantity = this.quantity - snacksGettingBought;
    }

    public int getCost(int numOfSnacks){
        return this.cost * numOfSnacks;
    }




}