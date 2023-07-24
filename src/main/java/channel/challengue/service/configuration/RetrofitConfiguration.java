package channel.challengue.service.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import channel.challengue.service.proxy.api.SupportChallengueProxyServiceApi;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Configuration
public class RetrofitConfiguration {

    private static String BASE_URL = "http://localhost:8089";
    
	@Bean
	SupportChallengueProxyServiceApi retrofitSupportChallengueProxyServiceApi() {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(this.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        SupportChallengueProxyServiceApi service = retrofit.create(
        		SupportChallengueProxyServiceApi.class
        );
        return  service;
    }
    
}
