
public class MacroCommand implements Command{

	
	private FileSystemReceiver fileSystem;
	
	public MacroCommand(FileSystemReceiver f) {
		this.fileSystem = f;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("Macro Command");
		fileSystem.openFile();
		fileSystem.closeFile();
		fileSystem.writeFile();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}

}
