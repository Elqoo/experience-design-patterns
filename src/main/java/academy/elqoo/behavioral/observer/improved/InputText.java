package academy.elqoo.behavioral.observer.improved;


public class InputText implements Observer {

    public void setText(String text){
        System.out.println("Inputtext set text: "+text);
    }


    @Override
    public void update() {
        this.setText("button has been clicked");
    }
}
