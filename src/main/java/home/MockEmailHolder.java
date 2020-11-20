package home;
import static org.mockito.Mockito.*;

public class MockEmailHolder {

	private WebEmailService webEs =mock(WebEmailService.class);
	
	public MockEmailHolder() {

			SearchHome.setEmailservice(webEs);
		}



		public  WebEmailService getEmailService() {
			return webEs;
		}



		public void setEmailService(WebEmailService emailService) {
			this.webEs = emailService;

	}

}

