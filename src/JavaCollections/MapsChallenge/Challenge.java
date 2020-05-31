package JavaCollections.MapsChallenge;

public class Challenge {
    /*

Modify the program so that adding items to the shopping basket doesn't
actually reduce the stock count but, instead, reserves the requested
number of items.

You will need to add a "reserved" field to the StockItem class to store the
number of items reserved.

Items can continue to be added to the basket, but it should not be possible to
reserve more than the available stock of any item. An item's available stock
is the stock count less the reserved amount.

The stock count for each item is reduced when a basket is checked out, at which
point all reserved items in the basket have their actual stock count reduced.

Once checkout is complete, the contents of the basket are cleared.

It should also be possible to "unreserve" items that were added to the basket
by mistake.

The program should prevent any attempt to unreserve more items than were
reserved for a basket.

Add code to Main that will unreserve items after they have been added to the basket,
as well as unreserving items that have not been added to make sure that the code
can cope with invalid requests like that.

After checking out the baskets, display the full stock list and the contents of each
basket that you created.

 */private static StockList stockList = new StockList();

    public static void main(String[] args) {
        StockItem temp = new StockItem("bread", 0.86, 100);
        stockList.addStock(temp);

        temp = new StockItem("cake", 1.10, 7);
        stockList.addStock(temp);

        temp = new StockItem("car", 12.50, 2);
        stockList.addStock(temp);

        temp = new StockItem("chair", 62.0, 10);
        stockList.addStock(temp);

        temp = new StockItem("cup", 0.50, 200);
        stockList.addStock(temp);
        temp = new StockItem("cup", 0.45, 7);
        stockList.addStock(temp);

        temp = new StockItem("door", 72.95, 4);
        stockList.addStock(temp);

        temp = new StockItem("juice", 2.50, 36);
        stockList.addStock(temp);

        temp = new StockItem("phone", 96.99, 35);
        stockList.addStock(temp);

        temp = new StockItem("towel", 2.40, 80);
        stockList.addStock(temp);

        temp = new StockItem("vase", 8.76, 40);
        stockList.addStock(temp);


        System.out.println(stockList);

        Basket timsBasket = new Basket("Tim");
        purchase(timsBasket, "car", 1);
        System.out.println(timsBasket);

        System.out.println(stockList);

        putInShoppingChart(timsBasket,"phone", 25);
        putInShoppingChart(timsBasket,"vase", 10);
        putInShoppingChart(timsBasket,"cup", 7);
        putInShoppingChart(timsBasket,"door", 5);


        Basket jimsbasket = new Basket("Jim");
        putInShoppingChart(jimsbasket,"vase", 5);
        putInShoppingChart(jimsbasket,"cake", 6);

        System.out.println(timsBasket);

        System.out.println(jimsbasket);

        checkout(timsBasket);

        System.out.println(timsBasket);

        System.out.println(jimsbasket);

        System.out.println(stockList);

        putInShoppingChart(timsBasket,"juice", 16);
        putInShoppingChart(timsBasket,"towel", 30);

        System.out.println(timsBasket);

        System.out.println(stockList);

        removeFromShoppingChart(timsBasket, "juice" ,6);

        System.out.println(timsBasket);

        System.out.println(stockList);

        emptyBasket(timsBasket);

        System.out.println(timsBasket);

        System.out.println(stockList);


    }


    public static int putInShoppingChart(Basket basket, String item, int quantity) {
        //retrieve the item from stock list
        StockItem stockItem = stockList.get(item);
        if (stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }
        if (stockList.reserveStock(item, quantity) != 0) {
            basket.addToBasket(stockItem, quantity);
            return quantity;
        }
        return 0;
    }

    public static int removeFromShoppingChart(Basket basket, String item, int quantity){
        StockItem stockItem = stockList.get(item);
        if (stockItem == null) {
            System.out.println(item + " isn't available");
            return 0;
        }
        if(basket.Items().containsKey(stockItem)){
            basket.removeFromBasket(stockItem, quantity);
            return quantity;
        } else{
            System.out.println("Your basket doesn't contain any "+ stockItem.getName());
            return 0;
        }



    }

    public static void emptyBasket(Basket basket){
            basket.emptyBasket();
    }

    public static boolean checkout(Basket basket){
        return basket.checkout();
    }

    public static boolean purchase(Basket basket,String item, int quantity){
        putInShoppingChart(basket, item, quantity);
        return checkout(basket);
    }
}
