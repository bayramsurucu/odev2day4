public class NeroCustomerManager extends CustomerManager{
    @Override
    public void save(Customer customer) throws Exception {
        System.out.println("Save to db: "+customer.getFirstName());

    }
}
