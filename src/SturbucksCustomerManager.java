import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class SturbucksCustomerManager extends CustomerManager   {

    private IPersonCustomerCheckService _customerService;
    public SturbucksCustomerManager(IPersonCustomerCheckService customerService) {
        this._customerService = customerService;
    }

    @Override
    public void save(Customer customer) throws Exception {
        if (_customerService.CheckIfRealPerson(customer)) {
          super.save(customer);
            System.out.println("Starbucks kaydedildi"+ customer.getDateOfBirth()+" "+customer.getFirstName()+" "+customer.getLastName() +" "+customer.getLastName());
        } else {
            throw new Exception("Not a valid person");
        }
    }
}

