package academy.elqoo.behavioral.mediator.improved;


public class ScreenDirectorOne implements Screendirector{

    private InputText inputText;


    @Override
    public void itemSelected(String item) {
        inputText.setValue(item);
    }

    public void setInputText(InputText inputText) {
        this.inputText = inputText;
    }
}
