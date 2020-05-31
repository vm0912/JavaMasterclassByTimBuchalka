package JavaCollections.MapsChallenge;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Basket {
    private final String name;
    private final Map<StockItem, Integer> list;

    public Basket(String name) {
        this.name = name;
        this.list = new TreeMap<>();
    }

    public int addToBasket(StockItem item, int quantity) {
        if ((item != null) && (quantity > 0)) {
            int inBasket = list.getOrDefault(item, 0);
            list.put(item, inBasket + quantity);
            System.out.println("Successfully added " + quantity + " units of "+ item.getName());
            return inBasket;
        }
        return 0;
    }

    public int removeFromBasket(StockItem item, int quantity) {
        //TODO reservations
        if ((item != null) && (quantity > 0)) {
            int inBasket = list.getOrDefault(item, 0);
            int updatedCount = inBasket - quantity;
            if (updatedCount >= 0) {
                if(updatedCount == 0){
                    list.remove(item);
                } else{
                    list.put(item, updatedCount);
                }
                item.removeReservation(quantity);
                return updatedCount;
            } else{
                System.out.println("Item quantity asked to be removed is too large");
            }
            return 0;
        }
        return 0;
    }


    public boolean checkout() {
        //TODO finish by reducing the reserved stock count and items in stock
        for (Map.Entry<StockItem, Integer> item : list.entrySet()) {
            StockItem currentItem = item.getKey();
            int reserved = item.getValue();
            currentItem.removeReservation(reserved);
            if (!currentItem.adjustStock(-reserved)) {
                return false;
            }
        }
        list.clear();
        System.out.println("Items from basket successfully purchased.");
        return true;
    }

    public void emptyBasket(){
        Iterator<Map.Entry<StockItem,Integer>> basketIterator = list.entrySet().iterator();
        while(basketIterator.hasNext()){
            Map.Entry<StockItem,Integer> entry =basketIterator.next();
            entry.getKey().removeReservation(entry.getValue());
            basketIterator.remove();
//            this.removeFromBasket(entry.getKey(),entry.getValue());
        }
//        for(Map.Entry<StockItem, Integer> item : list.entrySet()){
//            this.removeFromBasket(item.getKey(),item.getValue());
//        }
    }

    public Map<StockItem, Integer> Items() {
        return Collections.unmodifiableMap(list);
    }

    @Override
    public String toString() {
        String s = "\nShopping basket " + name + " contains " + list.size() + ((list.size() == 1) ? " item" : " items") + "\n";
        double totalCost = 0.0;
        for (Map.Entry<StockItem, Integer> item : list.entrySet()) {
            s = s + item.getKey() + ". " + item.getValue() + " added to chart\n";
            totalCost += item.getKey().getPrice() * item.getValue();
        }
        return s + "Total cost " + totalCost;
    }


}