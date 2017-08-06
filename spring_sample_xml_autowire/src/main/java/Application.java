import com.k4j4n.service.CustomerService;
import com.k4j4n.service.CustomerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.applet.AppletContext;

/**
 * Created by K4J4N on 8/6/2017.
 */
public class Application {

    public static void main(String[] args) {

        ApplicationContext appContext = new ClassPathXmlApplicationContext("appContext.xml");

        CustomerService service = appContext.getBean("customerService", CustomerService.class);
        System.out.println(service.findAll().get(0).getFistName());
    }
}
