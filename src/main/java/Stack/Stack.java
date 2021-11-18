package Stack;

public class Stack {
    Element start;
    int size;

    public Stack(){
        size=0;
    }

    public void push(Object o){
        Element e = new Element(o);

        if(start != null){
            e.setNext(start);
        }
        size++;
        start = e;
    }

    public Element pop(){
        Element temp = start;
        start = start.getNext();
        size--;
        return temp;
    }

    public Examinator getIterator(){
        return new Examinator(start);
    }

    public String toString(){
        StringBuilder string = new StringBuilder();

        Examinator ite = getIterator();

        string.append("[");
        while(ite.hasNext()){
            string.append("<").append(ite.next()).append("> ");
        }
        string.append("]");

        return string.toString();
    }

    public Object[] state(){
        Object[] array = new Object[size];
        Examinator ite = getIterator();
        int i = 0;

        while(ite.hasNext()){
            array[i++] = ite.next().getValue();
        }

        return array;
    }

    public int size(){
        return size;
    }
}
