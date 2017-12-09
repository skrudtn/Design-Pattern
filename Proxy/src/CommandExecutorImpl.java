import java.io.*;
public class CommandExecutorImpl implements CommandExecutor {

	@Override
	public void runCommand(String cmd) throws Exception {
		// TODO Auto-generated method stub
		// some heavy implementation
		Runtime.getRuntime().exec(cmd);
		System.out.println("'" + cmd+"' command executed");
	}

}
