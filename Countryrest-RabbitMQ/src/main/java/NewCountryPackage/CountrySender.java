package NewCountryPackage;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CountrySender {
	@Bean
	public CommandLineRunner sendCountry(@Value("${country.amqp.queue}") String destination, CountryProducer producer){
		return args -> {
			Country country = new Country();
			country.setName("Japan");
			country.setCapitalName("Tokyo");
			country.setPopulation(23000000);
			producer.sendTo(destination, country);
		};
	}      
}