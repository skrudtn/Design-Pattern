
public class OpenFileCommand implements Command{

	private FileSystemReceiver fileSystem;
	
	public OpenFileCommand(FileSystemReceiver f) {
		this.fileSystem = f;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		fileSystem.openFile();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		System.out.println("openFile�� Undo�� closeFile�̶�� ����.");
		fileSystem.closeFile();
		// openFile�� Undo�� closeFile�̶�� ����.
	}

}
