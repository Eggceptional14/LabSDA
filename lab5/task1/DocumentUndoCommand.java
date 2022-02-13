public class DocumentUndoCommand implements Command {

    private Command undoCommand;

    public DocumentUndoCommand(Command command) {
        this.undoCommand = command;
        this.undoCommand.undo();
    }

    public void undo() {
        this.undoCommand.redo();
    }

    public void redo() {
        this.undoCommand.undo();
    }

    public String toString() {
        return "Undo";
    }
}
