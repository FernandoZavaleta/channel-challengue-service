package channel.challengue.service.controller.response;

import channel.challengue.service.proxy.response.SupportChallengueProxyCreateFilmResponse;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Data
public class CreateFilmResponse {

	private String message;
	private String operation;
	
	public CreateFilmResponse(SupportChallengueProxyCreateFilmResponse supportChallengueProxyCreateFilmResponse ) {
		this.message = supportChallengueProxyCreateFilmResponse.getMessage();
		this.operation = supportChallengueProxyCreateFilmResponse.getOperation();
	}
	
}
