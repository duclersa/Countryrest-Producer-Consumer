package NewCountryPackage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
    public class CountryConsumer {
    private static final Logger log = LoggerFactory.getLogger(CountryConsumer.class);
    
    private CountryRepository  countryRepo;

    public CountryConsumer(CountryRepository repository) {
    this.countryRepo = repository;
    }
    
    @RabbitListener(queues = "${country.amqp.queue}")
    public void processCountry(Country country) {
    
    log.info("Consumer> " + country);
    log.info("Country created> " + this.countryRepo.save(country));
    }
}