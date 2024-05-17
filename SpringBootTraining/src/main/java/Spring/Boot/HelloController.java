package Spring.Boot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/hello")
	public String Hello() {
	
		String s1 = "Name = Satish, DOB = Jan 17th, Country = Nepal";
		
		return s1;
	}
	
	@GetMapping("/hi")
	public String hi() {
	
		return "hi there";
	}
}
