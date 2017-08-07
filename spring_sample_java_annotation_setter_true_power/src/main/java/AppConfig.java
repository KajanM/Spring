import com.k4j4n.repository.CustomerRepository;
import com.k4j4n.repository.HibernateCustomerRepositoryImpl;
import com.k4j4n.service.CustomerService;
import com.k4j4n.service.CustomerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by K4J4N on 8/7/2017.
 */

@Configuration
@ComponentScan({"com.k4j4n"})
public class AppConfig {

    @Bean(name = "customerService")
    public CustomerService getCustomerService() {
        CustomerServiceImpl service = new CustomerServiceImpl();
        return service;
    }

}
