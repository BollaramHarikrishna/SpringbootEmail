package in.hariit;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import in.hariit.service.MailService;

@SpringBootApplication
public class SpringbootEmailApplication {
	
@Autowired
 private MailService mailService;


	public static void main(String[] args) {
		SpringApplication.run(SpringbootEmailApplication.class, args);
	}
	@EventListener(ApplicationReadyEvent.class)
public void triggerMail() throws MessagingException {
		
		//sendMailWithAttachement(String to,String subject, String body, String attachment)
	mailService.sendMail("krishnahari3997@gmail.com","SpringDemo", "SpringBootEmail text format");
	mailService.sendMailWithAttachement("krishnahari3997@gmail.com", "java dev resume","hi pls find my att  ", "C:/Users/Lenovo/Downloads/1_iONI230301L00107.pdf");
}
}
