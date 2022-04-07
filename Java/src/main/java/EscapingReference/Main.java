package EscapingReference;

public class Main {
    public static void main(String[] args) {
        CustomerRecord customerRecord=new CustomerRecord();
        Customer customer1=new Customer("Rifat");
        Customer customer2=new Customer("Siraj");

        customerRecord.addCustomer(customer1);
        customerRecord.addCustomer(customer2);

        for(Customer next: customerRecord.getCustomers().values()){
            System.out.println("Customer Name= "+next);
        }

    }
}
