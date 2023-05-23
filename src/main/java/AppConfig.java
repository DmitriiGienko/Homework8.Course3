import model.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Car carBean() {
        return new Car("Honda", "Civic");
    }

    @Bean
    public Bus busBean() {
        return new Bus("ПАЗ", "Вектор");
    }

    @Bean
    public Pickup pickupBean() {
        return new Pickup("Dodge", "RAM");

    }

    @Bean(name = "driverCar")
    public Driver DriverCar() {
        return new Driver("Дима", carBean());
    }

    @Bean(name = "driverBus")
    public Driver DriverBus() {
        return new Driver("Валера", busBean());
    }

    @Bean(name = "driverPickup")
    public Driver DriverPickup() {
        return new Driver("Наташка", pickupBean());
    }
}
