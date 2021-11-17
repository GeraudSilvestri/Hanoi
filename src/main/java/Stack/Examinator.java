package Stack;

import java.util.Spliterator;
import java.util.function.Consumer;

public class Examinator {
    Element current;

    public Examinator(Element e){
       current = e;
    }

    public boolean hasNext(){
        return current != null;
    }

    public Element next(){
        Element temp = current;
        this.current = current.getNext();
        return temp;
    }
}
