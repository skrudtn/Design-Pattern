
public class ProxyPatternTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CommandExecutor executor = new CommandExecutorProxy("dms","wrong_pwd");
		try {
			executor.runCommand("ls -ltr");
			executor.runCommand("rm -rf abc.pdf");			
		} catch(Exception e) {
			System.out.println("Exception Msg: "+e.getMessage());
		}
	}

}
