package home;

import java.util.List;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class WebEmailService {
	public void sendEmail() {//List<Home>l
		
		   
	      String to = "hayadaraghmeh5@gmail.com";
	      String from = "ayabadie22@gmail.com";
	      String host = "localhost";

	     
	      Properties properties = System.getProperties();
	      properties.setProperty("mail.smtp.host", host);


	      Session session = Session.getDefaultInstance(properties);

	      try {
	      
	         MimeMessage message = new MimeMessage(session);

	        
	         message.setFrom(new InternetAddress(from));
	         message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
	         message.setSubject("This is the Subject Line!");
	         message.setText("This is actual message");
	         Transport.send(message);
	         
	       
	      } 
	      
	      catch (Exception mex) {
	         mex.printStackTrace();
	      }
	      
	   }


}
