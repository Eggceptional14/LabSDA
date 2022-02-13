import java.util.ArrayList;

public class DocumentInvoker {
	private ArrayList<Command> commands = new ArrayList<Command>();
	private Document currentdoc;

	public DocumentInvoker(String name) {
		currentdoc = new Document(name);
	}

	// undo the last command
	public void Undo() {
		Command tmp = (Command) commands.get(commands.size() - 1);
		DocumentUndoCommand cmd = new DocumentUndoCommand(tmp);
		commands.add(cmd);
	}

	// redo the last command
	public void Redo() {
		Command tmp = (Command) commands.get(commands.size() - 1);
		DocumentRedoCommand cmd = new DocumentRedoCommand(tmp);
		commands.add(cmd);
	}

	public void Redo(int level) {
		System.out.println("---- Redo level " + level);
		if (level < commands.size()) {
			Command tmp = (Command) commands.get(level);
			DocumentRedoCommand cmd = new DocumentRedoCommand(tmp);
			commands.add(cmd);
		} else {
			System.out.println("Invalid command undo");
		}
	}

	public void Undo(int level) {
		System.out.println("---- Undo level " + level);
		if (level < commands.size()) {
			Command tmp = (Command) commands.get(level);
			DocumentUndoCommand cmd = new DocumentUndoCommand(tmp);
			commands.add(cmd);

		} else {
			System.out.println("Invalid command undo");
		}
	}

	public void Write(String text) {
		DocumentWriteCommand cmd = new DocumentWriteCommand(currentdoc, text);
		commands.add(cmd);
	}

	public void Erase(String text) {
		DocumentEraseCommand cmd = new DocumentEraseCommand(currentdoc, text);
		commands.add(cmd);
	}

	// public void Erase(int line)
	// {
	// DocumentEraseCommand cmd = new
	// DocumentEraseCommand(currentdoc,line);
	// commands.add(cmd);
	// }

	public void Bold(int line) {
		DocumentBoldCommand cmd = new DocumentBoldCommand(currentdoc, line);
		commands.add(cmd);
	}

	public void RemoveBold(int line) {
		DocumentRemoveBoldCommand cmd = new DocumentRemoveBoldCommand(
				currentdoc, line);
		commands.add(cmd);
	}

	public String Read() {
		return currentdoc.Read();
	}

	public void printCommandBuffer() {
		StringBuffer txt = new StringBuffer();
		txt.append("---- Commands issued----\n");
		for (int i = 0; i < commands.size(); i++) {
			txt.append(i + ":" + (Command) commands.get(i) + "\n");
		}
		System.out.println(txt.toString());
	}
}
