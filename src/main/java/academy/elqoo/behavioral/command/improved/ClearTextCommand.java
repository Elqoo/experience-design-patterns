package academy.elqoo.behavioral.command.improved;


public class ClearTextCommand extends AbstractCommand{

    private String undoText ="";

    public ClearTextCommand(TextEditor textEditor) {
        super(textEditor);
    }


    @Override
    public void action() {
        // first back up the undo text
        undoText = getTextEditor().getText();
        getTextEditor().setText("");
    }

    @Override
    public void undo() {
        getTextEditor().setText(undoText);
    }
}
