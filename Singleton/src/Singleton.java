
public class Singleton {
	private static volatile Singleton INSTANCE = null;

	public int number;
	private Singleton() {
		this.number = 0;
	}

	public static Singleton getInstance() {

		if(INSTANCE == null) {
			synchronized (Singleton.class) { // Singleton Ŭ������ ������ ��� �����忡 ���� �� ������ lock�� �Ǵ�.
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
