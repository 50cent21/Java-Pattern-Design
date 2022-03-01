package DecoratorExample;

public class Client {

	public static void main(String[] args) {
		System.out.println("***Decorator Patter Demo***");
		ConcreteComponent cc= new ConcreteComponent();
		
		ConcreteDecoratorEx1 cd1= new ConcreteDecoratorEx1();
		cd1.SetTheComponent(cc);
		cd1.doJob();
        
		ConcreteDecoratorEx2 cd2= new ConcreteDecoratorEx2();
		cd2.SetTheComponent(cd1);
		cd2.doJob();
		
	}

}
