package channel.challengue.service.proxy.api;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import channel.challengue.service.controller.request.CreateFilmRequest;
import channel.challengue.service.proxy.api.intf.SupportChallengueProxyServiceApiIntf;
import channel.challengue.service.proxy.request.SupportChallengueProxyCreateFilmRequest;
import channel.challengue.service.proxy.response.SupportChallengueProxyCreateFilmResponse;
import retrofit2.Call;
import retrofit2.Response;

@Service
public class SupportChallengueProxyServiceApiImpl implements SupportChallengueProxyServiceApiIntf {
	
	@Autowired
	private SupportChallengueProxyServiceApi supportChallengueProxyServiceApi;

	@Override
	public String supportConnection() throws IOException {
		Call<String> retrofitCall = supportChallengueProxyServiceApi.apiSupportChallengueProxyConection();
		try {
			Response<String> response = retrofitCall.execute();
			return response.body();
		} catch (IOException e) {
			e.printStackTrace();
			throw new InternalError(e);
		}
	}
	
	@Override
	public SupportChallengueProxyCreateFilmResponse createFilm(CreateFilmRequest createFilmRequest) throws IOException {
		SupportChallengueProxyCreateFilmRequest supportChallengueProxyCreateFilmRequest = new SupportChallengueProxyCreateFilmRequest(createFilmRequest);
		Call<SupportChallengueProxyCreateFilmResponse> retrofitCall = supportChallengueProxyServiceApi.apiSupportChallengueProxyCreateFilm(supportChallengueProxyCreateFilmRequest);
		try {
			Response<SupportChallengueProxyCreateFilmResponse> response = retrofitCall.execute();
			return response.body();
		} catch (IOException e) {
			e.printStackTrace();
			throw new InternalError(e);
		}
	}
	
	
}
