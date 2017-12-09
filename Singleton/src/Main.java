
public class Main  implements Runnable{

	
	public static void main(String[] args) {
		for(int i = 0; i<100000 ; i++) {
			new Main().run();
		}
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Singleton s = Singleton.getInstance();
		s.increaseNum();
		System.out.println(s.number);
	}
}
