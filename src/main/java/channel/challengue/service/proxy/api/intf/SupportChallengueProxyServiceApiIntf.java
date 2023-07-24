package channel.challengue.service.proxy.api.intf;

import java.io.IOException;

import channel.challengue.service.controller.request.CreateFilmRequest;
import channel.challengue.service.proxy.response.SupportChallengueProxyCreateFilmResponse;

public interface SupportChallengueProxyServiceApiIntf {
	String supportConnection() throws IOException;
	SupportChallengueProxyCreateFilmResponse createFilm(CreateFilmRequest createFilmRequest) throws IOException;
}
