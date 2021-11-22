package Question3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ShoppingCart {
    List<Item> list = new ArrayList<>();

    public ShoppingCart(){

    }

    public void addItem(Item item){
       list.add(item);
    }
    public void removeItem(Item item){
        list.remove(item);
    }
    public int calculateTotal(){
        int result = 0;
        for(Item k : list){
            result += k.getPrice();
        }
        return result;
    }
    public void pay(PaymentStrategy paymentStrategy){
      paymentStrategy.pay(calculateTotal());
    }
}
