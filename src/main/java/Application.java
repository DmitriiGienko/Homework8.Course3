import model.Driver;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Driver driver1 = context.getBean("driverCar", Driver.class);
        Driver driver2 = context.getBean("driverBus", Driver.class);
        Driver driver3 = context.getBean("driverPickup", Driver.class);

        System.out.println(driver1);
        System.out.println(driver2);
        System.out.println(driver3);

    }
}