import org.apache.axis.AxisFault;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import javax.xml.rpc.ServiceException;
import java.net.MalformedURLException;

public interface IPersonCustomerCheckService {
   public  boolean CheckIfRealPerson(Customer customer) throws AxisFault, MalformedURLException, ServiceException;

}
