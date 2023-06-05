package pe.edu.idat.dsw1L11;

import jakarta.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

import io.spring.guides.gs_producing_web_service.Country;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

@Component
public class CountryRepository {

    private static final Map<String, Country> countries = new HashMap<>();

	@PostConstruct
	public void initData() {
		Country lun = new Country();
		lun.setName("Lunes");
		lun.setTraduccion("Monday");

		countries.put(lun.getName(), lun);

		Country mar = new Country();
		mar.setName("Martes");
		mar.setTraduccion("Tuesday");

		countries.put(mar.getName(), mar);

		Country mie = new Country();
		mie.setName("Miercoles");
		mie.setTraduccion("Wednesday");

		countries.put(mie.getName(), mie);

		Country jue = new Country();
		jue.setName("Jueves");
		jue.setTraduccion("Thursday");

		countries.put(jue.getName(), jue);

		Country vie = new Country();
		vie.setName("Viernes");
		vie.setTraduccion("Friday");

		countries.put(vie.getName(), vie);

		Country sa = new Country();
		sa.setName("Sabado");
		sa.setTraduccion("Saturday");

		countries.put(sa.getName(), sa);

		Country dom = new Country();
		dom.setName("Domingo");
		dom.setTraduccion("Sunday");

		countries.put(dom.getName(), dom);

    }
    public Country findCountry(String name) {
        Assert.notNull(name, "The country's name must not be null");
        return countries.get(name);
    }
    
}
