package academy.elqoo.behavioral.mediator;


public class Client {

    public static void main(String[] args) {

        List list = new List();
        InputText text = new InputText();

        list.setInputText(text);


        list.getItems().add("Data item one");
        list.getItems().add("Data item two");
        list.getItems().add("Data item three");

        list.selectItem(0);

        System.out.println("Selected value is: "+text.getValue());




    }

}
