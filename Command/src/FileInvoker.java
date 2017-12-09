
public class FileInvoker {
	public Command cmd;
	
	public FileInvoker(Command cmd) {
		this.cmd = cmd;
	}
	public void setCommand(Command cmd) {
		this.cmd = cmd;
	}
	
	public void execute() {
		this.cmd.execute();
	}
	public void undo() {
		this.cmd.undo();
	}
}
