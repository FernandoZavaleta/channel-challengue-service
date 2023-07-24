package channel.challengue.service.proxy.api;

import channel.challengue.service.proxy.request.SupportChallengueProxyCreateFilmRequest;
import channel.challengue.service.proxy.response.SupportChallengueProxyCreateFilmResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface SupportChallengueProxyServiceApi {
	
	@GET("/api/support-challengue/v1.0/connection")
	Call<String> apiSupportChallengueProxyConection();
	
	@POST("/api/support-challengue/v1.0/film-movies")
	Call<SupportChallengueProxyCreateFilmResponse> apiSupportChallengueProxyCreateFilm(@Body SupportChallengueProxyCreateFilmRequest supportChallengueProxyCreateFilmRequest);
	
}