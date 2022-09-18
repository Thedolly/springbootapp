package demo;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
    public void checkout(){
        //logging
        //authentication & authorization
        //sanitize the data
        //so these are cross cutting concern which we have seperate out
        System.out.println("checkout method from shopping cart");
    }
}
