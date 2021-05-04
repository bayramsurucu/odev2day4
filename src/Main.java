import javax.jws.soap.SOAPBinding;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args)  {
	// write your code here
        CustomerManager customerManager=new NeroCustomerManager();

        CustomerManager customerManager2=new SturbucksCustomerManager(new MernisServiceAdapter());
        Customer customer=new Customer(1,"İnci","Yiğit",LocalDate.of(1993,7,17),"1126216");
        Customer customer2=new Customer(2,"Bayram","Sürücü",LocalDate.of(1992,6,22),"21212");


        try {
            customerManager2.save(customer);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        try {
            customerManager2.save(customer2);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }


    }


}
