package academy.elqoo.behavioral.iterator.improved;

public class CollectionIterator implements Iterator<String>{

    private Collection collection;

    private int cursor=0;

    public CollectionIterator(Collection collection) {
        this.collection = collection;
    }

    @Override
    public String getNext() {
        if(!isDone()){
            String item = collection.getItems()[cursor];
            cursor++;
            return item;
        }
        return null;
    }

    @Override
    public boolean isDone() {
        return cursor == collection.getItems().length;
    }
}

