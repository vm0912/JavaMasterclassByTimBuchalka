package InnerAndAbstractClassesAndInterfaces.AbstractClassesChallenge;

public class Main {
    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();
        list.traverse(list.getRoot());
        String input = "Sisak Petrinja Topusko Sisak Karlovac Kutina Glina Osijek Varaždin Koprivnica";
        String[] inputArray = input.split(" ");
        for(String item : inputArray){
            list.addItem(new Node(item));
        }


        System.out.println("List root is "+ list.getRoot().getItemValue());
        list.traverse(list.getRoot());


        list.removeItem(new Node("Kutina"));
        list.removeItem(new Node("Glina"));
        list.removeItem(new Node("Karlovac"));
        list.removeItem(new Node("Bjelovar"));



        System.out.println("List root is "+ list.getRoot().getItemValue());
        list.traverse(list.getRoot());



    }
}
