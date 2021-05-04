public abstract class CustomerManager implements ICustomerService {
    @Override
    public  void save(Customer customer) throws Exception {
        System.out.println("Save to db: "+customer.getFirstName());

    }
}
