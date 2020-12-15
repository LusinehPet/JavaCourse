package com.company.Homework13;

import com.company.Homework13.products.beer.*;
import com.company.Homework13.products.water.*;
import com.company.Homework13.products.chips.*;
import com.company.Homework13.products.drink.*;
import com.company.Homework13.products.cigarette.*;
import com.company.Homework13.products.candy.*;

import java.util.ArrayList;
import java.util.HashMap;

import static com.company.Homework13.ProductName.*;

public class VendingMachine {

    private HashMap<String, ArrayList<Product>> products = new HashMap<>();
    private ProductName[][] order = new ProductName[][]{
            {LAYS, PRINGLES, DORITOS, CHEETOS, OTMARTINA},
            {SNICKERS, MARS, RAFFAELLO, BOUNTY, KINDER},
            {NOYAN, FANTA, COCACOLA, SPRITE, SANDORA},
            {NOY, BYUREGH, JERMUK, APARAN, EVIAN},
            {KILIKIA, GYUMRI, STELLA, BALTIKA, DARGETT},
            {MARLBORO, PARLIAMENT, ARARAT, AKHTAMAR, CAMEL}
    };

    public VendingMachine() {
        initialiseProducts();
    }

    private void initialiseProducts() {
        for (char i = 'A'; i <= 'F'; i++) {
            for (int j = 1; j <= 5; j++) {
                String key = "" + i + j;
                ProductName productName = order[i - 'A'][j - 1];

                ArrayList<Product> products = new ArrayList<>();
                for (int k = 0; k < 10; k++) {
                    products.add(getProductFromName(productName));
                }
                this.products.put(key, products);
            }
        }
    }

    private Product getProductFromName(ProductName productName) {
        return switch (productName) {
            case LAYS -> new Lays();
            case PRINGLES -> new Pringles();
            case DORITOS -> new Doritos();
            case CHEETOS -> new Cheetos();
            case OTMARTINA -> new OtMartina();
            case SNICKERS -> new Snickers();
            case MARS -> new Mars();
            case RAFFAELLO -> new Raffaello();
            case BOUNTY -> new Bounty();
            case KINDER -> new Kinder();
            case NOYAN -> new Noyan();
            case FANTA -> new Fanta();
            case COCACOLA -> new CocaCola();
            case SPRITE -> new Sprite();
            case SANDORA -> new Sandora();
            case NOY -> new Noy();
            case BYUREGH -> new Byuregh();
            case JERMUK -> new Jermuk();
            case APARAN -> new Aparan();
            case EVIAN -> new Evian();
            case KILIKIA -> new Kilikia();
            case GYUMRI -> new Gyumri();
            case STELLA -> new Stella();
            case BALTIKA -> new Baltika();
            case DARGETT -> new Dargett();
            case MARLBORO -> new Marlboro();
            case PARLIAMENT -> new Parliament();
            case ARARAT -> new Ararat();
            case AKHTAMAR -> new Akhtamar();
            case CAMEL -> new Camel();
        };
    }

    public ArrayList<Product> getProducts(Command command) {
        String key = "" + command.getProductRow() + command.getProductPlace();
        ArrayList<Product> products = this.products.get(key);

        if (products.size() < command.getProductCount()) {
            return null;
        }
        ArrayList<Product> returnList = new ArrayList<>();
        for (int i = 0; i < command.getProductCount(); i++) {
            returnList.add(products.remove(products.size() - 1));
        }
        return returnList;
    }
}
