import com.k4j4n.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by K4J4N on 8/6/2017.
 */
public class Application {

    public static void main(String[] args) {

        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

        CustomerService service1 = appContext.getBean("customerService", CustomerService.class);
        CustomerService service2 = appContext.getBean("customerService", CustomerService.class);

        System.out.println("service 1 : " + service1);
        System.out.println("service 2 : " + service2);

        System.out.println(service1.findAll().get(0).getFistName());
    }
}
