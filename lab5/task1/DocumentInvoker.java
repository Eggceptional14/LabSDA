import java.util.ArrayList;

public class DocumentInvoker {
	private ArrayList<Command> commands = new ArrayList<Command>();
	private ArrayList<Command> undoCache = new ArrayList<Command>();
	private Document currentdoc;

	public DocumentInvoker(String name) {
		currentdoc = new Document(name);
	}

	// undo the last command
	public void Undo() {
		Command tmp = (Command) commands.get(commands.size() - 1);
		tmp.undo();
		undoCache.add(commands.get(commands.size() - 1));
		commands.remove(commands.size() - 1);
	}

	// redo the last command
	public void Redo() {
		if (undoCache.size() > 0) {
			Command tmp = (Command) undoCache.get(undoCache.size() - 1);
			tmp.redo();
			commands.add(tmp);
			undoCache.remove(undoCache.size() - 1);
		}
	}

	public void Redo(int level) {
		System.out.println("---- Redo level " + level);
		Command tmp = (Command) commands.get(level);
		tmp.redo();
		commands.add(tmp);
	}

	public void Undo(int level) {
		System.out.println("---- Undo level " + level);
		if (level < commands.size()) {
			Command tmp = (Command) commands.get(level);
			tmp.undo();
			undoCache.add(tmp);
			commands.remove(level);
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
