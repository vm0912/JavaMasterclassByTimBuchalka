package InnerAndAbstractClassesAndInterfaces.AbstractClassesChallenge;

public class CustomLinkedList implements NodeList {
    private ListItem root;

    public CustomLinkedList() {
        this.root = null;
    }

    public CustomLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem itemToAdd) {
        if (this.root == null) {
            this.root = itemToAdd;
            return true;
        }
        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = currentItem.compareTo(itemToAdd);
            if (comparison < 0) {
                //current item should be before the new item
                if (currentItem.getNext() != null) {
                    currentItem = currentItem.getNext();
                } //no next, add to the end of the list
                else {
                    currentItem.setNext(itemToAdd);
                    itemToAdd.setPrevious(currentItem);
                    return true;
                }
            } else if (comparison > 0) {
                //current item should be after the new value
                if (currentItem.getPrevious() != null) {
                    currentItem.getPrevious().setNext(itemToAdd);
                    itemToAdd.setPrevious(currentItem.getPrevious());
                    itemToAdd.setNext(currentItem);
                    currentItem.setPrevious(itemToAdd);
                } //the node is a root
                else {
                    itemToAdd.setNext(currentItem);
                    currentItem.setPrevious(itemToAdd);
                    this.root = itemToAdd;
                }
                return true;
            } else {
                System.out.println("The value \"" + itemToAdd.getItemValue().toString() + "\" already present, so it won't be added.");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem itemToRemove) {
        //
        if(this.root != null){
            ListItem currentItem = this.root;
            while( currentItem != null){
                //we found our item to remove, connect the previous and the next item
                if(currentItem.compareTo(itemToRemove) == 0){
                    //check if there is a previous item and a next item
                    ListItem previousItem = currentItem.getPrevious();
                    ListItem nextItem = currentItem.getNext();
                    if(previousItem != null && nextItem != null){
                        previousItem.setNext(nextItem).setPrevious(previousItem);
                    } else if (previousItem == null){
                        nextItem.setPrevious(null);
                        this.root = nextItem;
                    } else {
                        previousItem.setNext(null);
                    }
                    System.out.println("The value \""+itemToRemove.getItemValue()+"\" is removed...");
                    return true;
                }
                currentItem = currentItem.getNext();
            }
        }
        System.out.println("Item \""+itemToRemove.getItemValue()+"\" not found." );
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        System.out.println("Traversing through the list...");
        if (this.root == null) {
            System.out.println("The list is empty.");
        } else {
            while (root != null) {
                System.out.print(" -> "+ root.getItemValue());
                root = root.getNext();
            }
            System.out.println();
        }
    }
}
