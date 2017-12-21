package academy.elqoo.behavioral.iterator;


public class Client {

    public static void main(String[] args) {

        Collection collection = new Collection();

        String [] items = collection.getItems();

        for(int i= 0; i<items.length;i++){

            System.out.println("Items on the item list: "+items[i]);

        }





    }

}
