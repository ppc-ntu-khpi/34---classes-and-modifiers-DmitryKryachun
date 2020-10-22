
package domain;

public class Customer {
    private int ID = 0;
    private boolean isNew = true;
    private double total = 100.0;
    
    private int getID() {
        return ID;
    }

    public void setID(int newID) {
        ID = newID;
    }

    public boolean isIsNew() {
        return isNew;
    }

    public void setIsNew(boolean newIsNew) {
        isNew = newIsNew;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double newTotal) {
        total = newTotal;
    }
    
    public void displayCustomerInfo(){
        System.out.println("ID= "+ID);
        System.out.println("isNew= "+isNew);
        System.out.println("Total purchases are= "+ total);
    }
}
