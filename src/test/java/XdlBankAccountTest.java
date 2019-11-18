import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xdl.service.XdlBankAccountService;

public class XdlBankAccountTest {

	public static void main(String[] args) {
		ApplicationContext  app  = 
			new ClassPathXmlApplicationContext("applicationContext.xml");
        XdlBankAccountService accountService =  app.getBean("accountService",
        	XdlBankAccountService.class);
        System.out.println(accountService.login("xiaomage", "123"));
	}

}
	