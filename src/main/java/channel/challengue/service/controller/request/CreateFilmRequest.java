package channel.challengue.service.controller.request;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Data
@NoArgsConstructor
public class CreateFilmRequest {
	public String year;
	public String title;
	public String description;
}
