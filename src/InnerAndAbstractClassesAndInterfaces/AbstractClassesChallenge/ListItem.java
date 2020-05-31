package InnerAndAbstractClassesAndInterfaces.AbstractClassesChallenge;

public abstract class ListItem {
    protected ListItem previous;
    protected ListItem next;
    private Object itemValue;

    public ListItem(Object itemValue) {
        this.previous = null;
        this.next = null;
        this.itemValue = itemValue;
    }

    abstract ListItem getPrevious();
    abstract ListItem setPrevious(ListItem previous);
    abstract ListItem getNext();
    abstract ListItem setNext(ListItem next);

    abstract int compareTo(ListItem item);

    public Object getItemValue() {
        return itemValue;
    }

    public void setItemValue(Object itemValue) {
        this.itemValue = itemValue;
    }
}
