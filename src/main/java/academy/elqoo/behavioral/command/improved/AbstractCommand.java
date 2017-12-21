package academy.elqoo.behavioral.command.improved;


public abstract class AbstractCommand implements Command{

    private TextEditor textEditor;


    public AbstractCommand(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    public TextEditor getTextEditor() {
        return textEditor;
    }
}
