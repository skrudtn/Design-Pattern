import java.util.Scanner;

public class FacadeClient {
	public static void main(String[] args) {
		SwingFacade facade = new SwingFacade();
		
		facade.generateSwing("text");
		facade.generateSwing("combo");
		facade.generateSwing("label");
		facade.generateSwing("init");
	}

}
