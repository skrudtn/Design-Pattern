
public class FileSystemClient {
	public static void main(String[] args) {
		//Creating the receiver object
		FileSystemReceiver fs = FileSystemReceiverUtil.getUnderlyingFileSystem();
		
		//creating command and associating with receiver
		OpenFileCommand ofc = new OpenFileCommand(fs);
		
		// creating invoker and associating with Command
		FileInvoker file = new FileInvoker(ofc);
		
		// perform action on invoker object
		file.execute();
		
		WriteFileCommand wfc = new WriteFileCommand(fs);
		file.setCommand(wfc);
		file.execute();
		
		CloseFileCommand cfc = new CloseFileCommand(fs);
		file.setCommand(cfc);
		file.execute();
		
		// command�� �����ϴ� MacroCommand ����
		MacroCommand mc = new MacroCommand(fs);
		file.setCommand(mc);
		file.execute();
		
		// OpenFile�� Undo����
		file.setCommand(ofc);
		file.undo();
	}

}
