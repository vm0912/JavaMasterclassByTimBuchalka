package ArraysListsAutoboxing;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceries = new ArrayList<>();


    public static void main(String[] args) {
        GroceryList groceryList = new GroceryList();
        groceryList.addGroceries("tomato");
        groceryList.printGroceries();
        groceryList.addGroceries("tuna");
        groceryList.printGroceries();
    }

    public void addGroceries(String item){
        this. groceries.add(item);
    }

    public void printGroceries(){
        System.out.println("The grocery list has " + groceries.size() + " elements");
        System.out.println(this.groceries.toString());
    }
}
