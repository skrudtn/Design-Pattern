
public class CloseFileCommand implements Command {
	private FileSystemReceiver fileSystem;
	
	public CloseFileCommand(FileSystemReceiver f) {
		this.fileSystem = f;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		fileSystem.closeFile();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		fileSystem.writeFile();
		// closeFile의 Undo는 writeFile이라고 가정.
	}

}
