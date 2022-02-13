public class DocumentRedoCommand implements Command {

    private Command redoCommand;

    public DocumentRedoCommand(Command command) {
        this.redoCommand = command;
        this.redoCommand.redo();
    }

    public void undo() {
        this.redoCommand.undo();
    }

    public void redo() {
        this.redoCommand.redo();
    }

    public String toString() {
        return "Redo";
    }
}
