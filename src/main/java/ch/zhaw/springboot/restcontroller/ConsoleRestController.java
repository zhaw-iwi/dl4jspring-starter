package ch.zhaw.springboot.restcontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsoleRestController {

	@GetMapping("console/{in}")
	public ResponseEntity<String> echo(@PathVariable("in") String in) {
		return new ResponseEntity<String>(in, HttpStatus.OK);
	}
}
