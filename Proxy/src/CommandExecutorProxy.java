
public class CommandExecutorProxy implements CommandExecutor{
	private boolean isAdmin;
	private CommandExecutor executor;
	
	public CommandExecutorProxy(String user, String pw) {
		if("dms".equals(user) && "dmslab".equals(pw)) {
			isAdmin = true;
		}
		executor = new CommandExecutorImpl();
	}
	
	@Override
	public void runCommand(String cmd) throws Exception {
		// TODO Auto-generated method stub
		if(isAdmin) {
			executor.runCommand(cmd);
		} else {
			if(cmd.trim().startsWith("rm")) {
				throw new Exception("rm command not allowed for non-admin users.");
			} else {
				executor.runCommand(cmd);
			}
		}
		
	}
	
}
