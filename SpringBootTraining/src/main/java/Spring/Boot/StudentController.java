package Spring.Boot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.name.Grade10;

@RestController
public class StudentController {

	@GetMapping("/student")
	public Grade10  getStudentInformation() {
		
		Grade10 g10 = new Grade10("Satish", "30", "LA", "Nepal", "12345");
		
		return g10;
		
	}
}
