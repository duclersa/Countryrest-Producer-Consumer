package NewCountryPackage;
import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
 
@Entity
@Table(name ="Country")
public class Country {
    private static ArrayList<Country> countryList = new ArrayList<Country>();
    static {
        countryList.add(new Country("United States", "Washington DC", 327000000));
        countryList.add(new Country("Norway", "Oslo", 5300000));
        countryList.add(new Country("South Africa", "Pretoria, Cape Town, and Bloemfontein", 56000000));
        countryList.add(new Country("Cambodia", "Phnom Penh", 16000000));
        countryList.add(new Country("Australia", "Canberra", 24000000));
    }
    public static ArrayList<Country> getCountries() {
        return countryList;
    }
	@Id
    private String name;
	
    private String capitalName;
    private int population;
    public Country(String name, String capitalName, int population) {
        super();
        this.name = name;
        this.capitalName = capitalName;
        this.population = population;
    }
    public Country() {
		// TODO Auto-generated constructor stub
	}
	public static ArrayList<Country> getCountryList() {
		return countryList;
	}
	public static void setCountryList(ArrayList<Country> countryList) {
		Country.countryList = countryList;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCapitalName() {
		return capitalName;
	}
	public void setCapitalName(String capitalName) {
		this.capitalName = capitalName;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	@Override
	public String toString() {
		return "Country [name" + name + ", Capital Name=" + capitalName + ", Population=" + population + "]";  
	}
	
}