package DecoratorExample;

abstract class Component {
	
	public abstract void doJob();

}
class ConcreteComponent extends Component {
	
	public void doJob() {
		System.out.println("I am a concrete component - closed for modification");
	}
}