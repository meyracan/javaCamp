package javaCampDay4Homework2.adapters;

import java.rmi.RemoteException;

import javaCampDay4Homework2.abstracts.CustomerCheckService;
import javaCampDay4Homework2.entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer){
		boolean result = false;
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		
		 try {
			result = client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),					
					customer.getFirstName().toUpperCase(),
					customer.getLastName().toUpperCase(),
					customer.getDateOfBirth().getYear());
		 } catch (NumberFormatException e) {
				
				e.printStackTrace();
				
			} catch (RemoteException e) {
				
				e.printStackTrace();
				
			}
			
		return result;
		 
	}

	

}
