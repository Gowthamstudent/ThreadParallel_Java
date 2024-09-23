package testNG;

import java.io.IOException;

public class ThreadConcept extends Thread {
	
	public String browserName;
	Login log;
	
	public ThreadConcept(String threadName, String browserName) {
		super(threadName);
		this.browserName=browserName;
		
		log = new Login();
	}
	
@Override
	public void run() {
	try {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//log.browser(this.browserName);
		log.LaunchBrowser(this.browserName);
		log.testmain();
		try {
			log.createLead();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

}
