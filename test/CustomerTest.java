
package test;
import domain.Customer;
public class CustomerTest {
    
    public static void main(String[] args){
        Customer cus = new Customer();
        cus.displayCustomerInfo();
        cus.setIsNew(false);
        cus.setID(23);
        cus.setTotal(2351.12);
        cus.displayCustomerInfo();
        
    }
    
}
