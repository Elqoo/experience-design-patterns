package academy.elqoo.behavioral.iterator.improved;




public class Client {

    public static void main(String[] args) {


        Collection collection = new Collection();

        Iterator<String> iterator = collection.getIterator();

        while (!iterator.isDone()){
            String item = iterator.getNext();

            System.out.println("Items on the item list: "+item);


        }



    }

}
