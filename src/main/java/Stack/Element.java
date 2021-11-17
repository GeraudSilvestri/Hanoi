package Stack;

public class Element {
    private Object value;
    private Element next;

    public void setValue(Object value) {
        this.value = value;
    }

    public void setNext(Element next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return value.toString();
    }

    public Element getNext() {
        return next;
    }

    public Element(Object o){
        value = o;
    }

    public Object getValue() {
        return value;
    }

    public Element(Object o, Element next){
        this.value = o;
        this.next = next;
    }
}
