
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
		
		// command를 구현하는 MacroCommand 생성
		MacroCommand mc = new MacroCommand(fs);
		file.setCommand(mc);
		file.execute();
		
		// OpenFile의 Undo실행
		file.setCommand(ofc);
		file.undo();
	}

}
