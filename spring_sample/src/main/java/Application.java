import com.k4j4n.service.CustomerService;
import com.k4j4n.service.CustomerServiceImpl;

/**
 * Created by K4J4N on 8/6/2017.
 */
public class Application {

    public static void main(String[] args) {
        CustomerService customerService = new CustomerServiceImpl();

        System.out.println(customerService.findAll().get(0).getFistName());
    }
}
