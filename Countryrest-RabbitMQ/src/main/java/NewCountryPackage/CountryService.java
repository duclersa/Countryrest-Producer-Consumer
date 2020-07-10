package NewCountryPackage;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional;
import net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.*;
@Service
public class CountryService {
@Autowired
CountryRepository ctr;
    public Country createCountry(Country country) {
        return ctr.save(country);
    }
    public List<Country> getCountries() {
        return ctr.findAll();
    }
    public List<Country> getCountryByName(String name) {
        return ctr.findByName(name);      
    }
    //public Optional<Todo> getTodoById(int id) {
    //  return tr.findById(id);
    //}
}