package EscapingReference;

import java.util.HashMap;
import java.util.Map;

public class CustomerRecord {
    private Map<String,Customer> records;

    public CustomerRecord() {
        this.records = new HashMap<String,Customer>();
    }
    public  void addCustomer(Customer c){
        this.records.put(c.getName(),c);
    }
    public Map<String,Customer> getCustomers(){
        return this.records;
    }
}
