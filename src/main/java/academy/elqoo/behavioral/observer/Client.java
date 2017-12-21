package academy.elqoo.behavioral.observer;


public class Client {

    public static void main(String[] args) {
        Button button = new Button();
        InputText text = new InputText();
        List list = new List();

        button.setInputText(text);
        button.setList(list);

        button.clicked();

    }

}
