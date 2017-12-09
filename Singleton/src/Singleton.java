
public class Singleton {
	private static volatile Singleton INSTANCE = null;

	public int number;
	private Singleton() {
		this.number = 0;
	}

	public static Singleton getInstance() {

		if(INSTANCE == null) {
			synchronized (Singleton.class) { // Singleton 클래스에 들어오는 모든 스레드에 대해 이 문장을 lock을 건다.
				if(INSTANCE == null) {
					INSTANCE = new Singleton();
					System.out.println("created instance");
				}
			}
		}
		return INSTANCE;
	}
	public void increaseNum() {
		this.number = this.number + 1;
	}

}
