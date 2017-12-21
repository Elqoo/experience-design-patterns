package academy.elqoo.behavioral.observer.improved;


public class Client {

    public static void main(String[] args) {
        Button button = new Button();
        InputText text = new InputText();
        InputText text2 = new InputText();
        List list = new List();



        button.attachObserver(text);
        button.attachObserver(text2);
        button.attachObserver(list);

        button.clicked();

    }

}
