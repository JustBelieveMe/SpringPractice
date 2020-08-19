package spring01;


public class Goodbye {
	
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

	public void init() {
		getHelloWorld().setMessage(this.message);
		System.out.print("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
	}
	
	public Goodbye() {
		System.out.print("BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB");
	}
}