//VendingMachine
//
//    Vending machine has fields (so knows)
//
//    maxId - keep track of last used vending machine id
//    id - automatically generated field
//    name
//    Vending Machine has methods (so can)
//
//    get id
//    set and get name

public class VendingMachine{
    //initialize variables
    private static int refId = 0;
    private int id;
    private String name;

    //constructor function
    public VendingMachine(String name){
        this.refId = this.refId + 1;
        this.id = this.refId;
        this.name = name;
    }
    //class methods
    public int getId(){
        return this.id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}