package NewCountryPackage;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CountryController {
	
	@Autowired
	CountryService cs;
	
    @GetMapping("/countries")
    public Object getCountries() {
        return Country.getCountries();
    }
    @GetMapping("/countrypop/{name}")
    public String countryPop(@PathVariable String name) {
        name = name.toLowerCase().replaceAll("\\s", "");
        for (Country c : Country.getCountries()) {
            if (c.getName().toLowerCase().replaceAll("\\s", "").equals(name)) {
                return c.getName() + "'s population is: " + c.getPopulation();
            }
        }
        return "I have no memory of this country...";
    }
    
    @PostMapping("/newCountry")
    Country createTodo(@Valid @RequestBody Country country) {
    return cs.createCountry(country);
}
}
//import java.util.List;
//import javax.validation.Valid;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//@RestController
//public class TodoController {
//@Autowired
//TodoService ts;
//    /*
//     * @GetMapping("/Todo/{id}") Optional<Todo> getTodoByID(@PathVariable int id) {
//     * return ts.getTodoById(id); }
//     */
//    @GetMapping("/Todos/{user}")
//        List<Todo> getTodosByUser(@PathVariable String user) {
//        return ts.getTodosByUser(user);
//    }
//    
//    @GetMapping("/Todos")
//        List<Todo> getTodos(){
//        return ts.getTodos();
//    }
//    @PostMapping("/Todo")
//    Todo createTodo(@Valid @RequestBody Todo Todo) {
//    return ts.createTodo(Todo);
//    }
//}
