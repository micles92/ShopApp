package com.shop;

/**
 * Created by Wojtek on 2015-11-23.
 */
public class Main {
    public static void main(String[] args) {
        GenericShop obj = new GenericShop();


        obj.addProduct(new Computer("Asus", 999, 16, 2.7));
        obj.addProduct(new Computer("Asus1", 929, 22, 2.7));

        obj.addProduct(new Phone("Nokia", 66, 4.5, 5.6));
        obj.addProduct(new Phone("Nokia22", 26, 4.3, 3.6));

        obj.displayDiscount();
        //obj.addProduct(new Product("nazwa1", 5.5));
        System.out.println(obj);
    }
}

//hashmap program do zliczania ilosci slow w tekscie.(wczytywanie slowo po slowie)(wkladac do mapy z jakas logika),wypisywanie mapy;