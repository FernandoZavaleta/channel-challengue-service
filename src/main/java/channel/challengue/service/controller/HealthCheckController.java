package channel.challengue.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/healthcheck")
public class HealthCheckController {
	
	@GetMapping()
	String execute() {
		return ":: they execute correctly ::";
	}
}
