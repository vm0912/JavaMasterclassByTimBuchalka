package InnerAndAbstractClassesAndInterfaces.AbstractClassesChallenge;

public class Node extends ListItem {

    public Node(Object itemValue) {
        super(itemValue);
    }

    @Override
    ListItem getPrevious() {
        return this.previous;
    }

    @Override
    ListItem setPrevious(ListItem previous) {
        this.previous = previous;
        return this.previous;
    }

    @Override
    ListItem getNext() {
        return this.next;
    }

    @Override
    ListItem setNext(ListItem next) {
        this.next = next;
        return this.next;
    }

    @Override
    int compareTo(ListItem item) {
        if(item != null){
            return  ( (String) super.getItemValue()).compareTo( (String) item.getItemValue());
        }
        return -1;
    }
}
