package channel.challengue.service.business.intf;

import java.io.IOException;

import channel.challengue.service.controller.request.CreateFilmRequest;
import channel.challengue.service.controller.response.CreateFilmResponse;

public interface FilmInterface {
	CreateFilmResponse create(CreateFilmRequest createFilmRequest) throws IOException;
}
