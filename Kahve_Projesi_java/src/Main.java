import concrete.BaseCustomerManager;
import concrete.StarbucksManager;
import entities.Customer;
import adapters.MernisServiceAdapter;
import java.time.LocalDate;
public class Main {

	public static void main(String[] args) {
		BaseCustomerManager baseCustomerManager = new StarbucksManager(new MernisServiceAdapter());
		baseCustomerManager.save(new Customer(1,"Aleyna","Kýrmýzý","12345678945,LocalDate.of(1999,9,3)));
	}

}
