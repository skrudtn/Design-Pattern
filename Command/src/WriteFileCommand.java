
public class WriteFileCommand implements Command{
	private FileSystemReceiver fileSystem;
	
	public WriteFileCommand(FileSystemReceiver f) {
		this.fileSystem = f;
	}
	
	@Override
	public void undo() {
		// TODO Auto-generated method stub
		fileSystem.openFile();
		// writeFile�� Undo�� openFile�̶�� ����.
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		fileSystem.writeFile();
	}
}
