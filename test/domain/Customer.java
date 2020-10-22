
package domain;

public class Customer {
    private int ID;
    private boolean isNew;
    private double total;
    
    public int getID() {
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
    public Customer(){
            ID=0;
            isNew=true;
            total=100;
            
        }
}
