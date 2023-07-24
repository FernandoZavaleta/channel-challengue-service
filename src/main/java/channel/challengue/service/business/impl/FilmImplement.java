package channel.challengue.service.business.impl;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import channel.challengue.service.business.intf.FilmInterface;
import channel.challengue.service.controller.request.CreateFilmRequest;
import channel.challengue.service.controller.response.CreateFilmResponse;
import channel.challengue.service.proxy.api.intf.SupportChallengueProxyServiceApiIntf;
import channel.challengue.service.proxy.response.SupportChallengueProxyCreateFilmResponse;

@Service
public class FilmImplement implements FilmInterface {
	
	@Autowired
	private SupportChallengueProxyServiceApiIntf supportChallengueProxyServiceApiIntf;
	
	@Override
	public CreateFilmResponse create(CreateFilmRequest createFilmRequest) throws IOException {
		SupportChallengueProxyCreateFilmResponse supportChallengueProxyCreateFilmResponse = supportChallengueProxyServiceApiIntf.createFilm(createFilmRequest);
		CreateFilmResponse createFilmResponse = new CreateFilmResponse(supportChallengueProxyCreateFilmResponse);
		return createFilmResponse;
	}

}
