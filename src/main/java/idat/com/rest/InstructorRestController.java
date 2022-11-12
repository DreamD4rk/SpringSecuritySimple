package idat.com.rest;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import idat.com.interfazservices.InstructorService;
import idat.com.modelo.Instructor02;

@RestController
@RequestMapping
public class InstructorRestController {

	@Autowired
	private InstructorService instructorService;

	@GetMapping("/listar_public")
	public ResponseEntity<?> listarPUBLIC() {
		Collection<Instructor02> itemsInstructor = instructorService.findAll();

		if (itemsInstructor.isEmpty()) {
			return new ResponseEntity<>(itemsInstructor, HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(itemsInstructor, HttpStatus.OK);
	}

	@GetMapping("/listar_admin")
	public ResponseEntity<?> listarADMIN() {
		Collection<Instructor02> itemsInstructor = instructorService.findAll();

		if (itemsInstructor.isEmpty()) {
			return new ResponseEntity<>(itemsInstructor, HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(itemsInstructor, HttpStatus.OK);
	}

	@GetMapping("/listar_user")
	public ResponseEntity<?> listarUSER() {
		Collection<Instructor02> itemsInstructor = instructorService.findAll();

		if (itemsInstructor.isEmpty()) {
			return new ResponseEntity<>(itemsInstructor, HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(itemsInstructor, HttpStatus.OK);
	}

}
