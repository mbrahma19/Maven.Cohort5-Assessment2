package rocks.zipcode.assessment2.collections;

import java.util.List;
import java.util.TreeMap;

/**
 * Use a map to keep track of inventory in a store
 */
public class Inventory {

    private TreeMap<String,Integer> inventoryList;
    //private List<String> listOfItems;
    /**
     * @param strings list of strings to add / remove / fetch from
     */
    public Inventory(List<String> strings) {
        inventoryList = new TreeMap<>();
        initializaInventory(strings);
        //listOfItems = strings;
    }

    /**
     * nullary constructor initializes a new list
     */
    public Inventory() {
        inventoryList = new TreeMap<>();
        //listOfItems = new ArrayList<>(0);
    }

    private void initializaInventory(List<String> list){
       for(String s : list){
           inventoryList.put(s,0);
       }
    }

    /**
     * @param item - increment the number of this item in stock by 1
     */
    public void addItemToInventory(String item) {
        if(inventoryList.get(item) == null){
            inventoryList.put(item,1);
        }else {
            inventoryList.put(item, inventoryList.get(item) + 1);
        }
    }

    /**
     * @param item - decrement the number of this item in stock by 1
     */
    public void removeItemFromInventory(String item) {
        inventoryList.put(item, inventoryList.get(item)-1);
    }

    /**
     * @param item - Search for this item in stock
     * @return - return the number of items
     */
    public Integer getItemQuantity(String item) {
        return inventoryList.get(item);
    }
}
