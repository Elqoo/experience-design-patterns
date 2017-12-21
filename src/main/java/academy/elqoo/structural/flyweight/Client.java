package academy.elqoo.structural.flyweight;


public class Client {

    public static void main(String[] args) {
        WordProcessor processor = new WordProcessor();

        String textToAdd = "Hello i'm aaaa word processor";
        int length = textToAdd.length();

        for(int i = 0; i<length;i++){

            String value = textToAdd.substring(i,i+1);
            processor.addLetter(new Letter(value));

        }

        processor.printLetters();
    }


}
