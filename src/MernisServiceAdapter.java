import org.apache.axis.AxisFault;
import tcdogrulama.KPSPublicLocator;
import tcdogrulama.KPSPublicSoap_BindingStub;
import tcdogrulama.KPSPublicSoap_PortType;

import javax.xml.rpc.ServiceException;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

public class MernisServiceAdapter implements IPersonCustomerCheckService {
   private KPSPublicSoap_PortType soap;
    @Override
    public boolean CheckIfRealPerson(Customer customer) throws AxisFault, MalformedURLException, ServiceException {
        KPSPublicLocator service =new KPSPublicLocator();
        final URL url = new URL("https://tckimlik.nvi.gov.tr/Service/KPSPublic.asmx?wsdl");
        soap = service.getKPSPublicSoap(url);
        boolean result=true;
       try{
           result=soap.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),customer.getFirstName().toLowerCase(),customer.getLastName().toLowerCase(),customer.getDateOfBirth().getYear());

            }catch (NumberFormatException exception){
           exception.printStackTrace();
        }catch (RemoteException exception){
           exception.printStackTrace();
       }
       return result;
    }
}
