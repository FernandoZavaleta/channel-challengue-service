package channel.challengue.service.proxy.request;

import channel.challengue.service.controller.request.CreateFilmRequest;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class SupportChallengueProxyCreateFilmRequest {
	public String year;
	public String title;
	public String description;
	
	public SupportChallengueProxyCreateFilmRequest(CreateFilmRequest createFilmRequest) {
		this.title = createFilmRequest.getTitle();
		this.year = createFilmRequest.getYear();
		this.description = createFilmRequest.getDescription();
	}
}
