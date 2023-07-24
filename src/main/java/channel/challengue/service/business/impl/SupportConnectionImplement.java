package channel.challengue.service.business.impl;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import channel.challengue.service.business.intf.SupportConnectionInterface;
import channel.challengue.service.proxy.api.intf.SupportChallengueProxyServiceApiIntf;

@Service
public class SupportConnectionImplement implements SupportConnectionInterface {

	@Autowired
	private SupportChallengueProxyServiceApiIntf supportChallengueProxyServiceApiIntf;
	
	
	@Override
	public String execute() throws IOException {
		return this.supportChallengueProxyServiceApiIntf.supportConnection();
	}

}
