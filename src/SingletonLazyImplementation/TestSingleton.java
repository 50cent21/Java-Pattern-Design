package SingletonLazyImplementation;

public class TestSingleton {

	public static void main(String[] args) {
		
		Singleton s=Singleton.getInstance();
		
		// set the data value
		s.setData(55);
		System.out.println(s);
		System.out.println(s.getData());
		
		s=null;
		s=Singleton.getInstance();
		System.out.println(s);
		System.out.println(s.getData());
	}

}
