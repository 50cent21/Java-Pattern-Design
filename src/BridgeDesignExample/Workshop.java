package BridgeDesignExample;

abstract class Workshop {

	abstract public void work();
	
}
class Produce extends Workshop {
	
	public void work() {
		System.out.println("Produced");
	}
}
class Assemble extends Workshop {
	
	public void work() {
		System.out.println("And Assembled");
	}
}