package spring01;

public class SeeYou {
	
	private HelloWorld helloWorld;

	private String message;

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return this.message;
	}

	public HelloWorld getHelloWorld() {
		return helloWorld;
	}
	
	public void setHelloWorld(HelloWorld helloWorld) {
		this.helloWorld = helloWorld;
	}
		
	public SeeYou(HelloWorld hello, String message){
		setHelloWorld(hello);
		setMessage(message);
		getHelloWorld().setMessage(this.message);
			
	}
}