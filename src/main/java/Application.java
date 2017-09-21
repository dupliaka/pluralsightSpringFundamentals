import model.Customer;
import service.CustomerService;
import service.CustomerServiceImpl;

/**
 * Created by anna on 21.09.17.
 */
public class Application {
    public static void main(String [] arg) {
        CustomerService service = new CustomerServiceImpl();
        System.out.println(service.findAll().get(0).getFirstName()  );


    }
}
