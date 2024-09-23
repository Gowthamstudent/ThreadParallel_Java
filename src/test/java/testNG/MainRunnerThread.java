package testNG;

public class MainRunnerThread {

	public static void main(String[] args) {


		Thread t1 = new ThreadConcept("chromeThread", "chrome");
		Thread t2 = new ThreadConcept("firefoxThread", "firefox");
		
		t1.start();
		t2.start();
		

	}

}
