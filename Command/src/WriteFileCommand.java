
public class WriteFileCommand implements Command{
	private FileSystemReceiver fileSystem;
	
	public WriteFileCommand(FileSystemReceiver f) {
		this.fileSystem = f;
	}
	
	@Override
	public void undo() {
		// TODO Auto-generated method stub
		fileSystem.openFile();
		// writeFile의 Undo는 openFile이라고 가정.
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		fileSystem.writeFile();
	}
}
