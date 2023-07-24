package channel.challengue.service.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import channel.challengue.service.business.intf.FilmInterface;
import channel.challengue.service.business.intf.SupportConnectionInterface;
import channel.challengue.service.controller.request.CreateFilmRequest;
import channel.challengue.service.controller.response.CreateFilmResponse;

@RestController
@RequestMapping("/film-movies")
public class FilmMoviesController {
	
	@Autowired
	private SupportConnectionInterface supportConnectionInterface;
	
	@Autowired
	private FilmInterface filmInterface;
	
	@GetMapping("/conection-to-support")
	String connectionToSupport() throws IOException {
		return this.supportConnectionInterface.execute();
	}
	
	@PostMapping("/")
	CreateFilmResponse createFilm(@RequestBody CreateFilmRequest createFilmRequest) throws IOException {
		return this.filmInterface.create(createFilmRequest);
	}
	
}
