package backEnd.helloThymeleaf.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import backEnd.helloThymeleaf.domain.Student;

@Controller
public class StudentController {
	
	@GetMapping("/hello2")
	public String showStudents(Model model) {
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student("Olli", "Oppilas"));
		students.add(new Student("Assi", "Ahkera"));
		
		model.addAttribute("students",students);
		return("studentlist");
	}

}
