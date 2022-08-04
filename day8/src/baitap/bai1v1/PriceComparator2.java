package baitap.bai1v1;

import baitap.bai1.Product;

import java.util.Comparator;

public class PriceComparator2 implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        if(p1.getPrice() > p2.getPrice()){
            return 1;
        }else if(p1.getPrice() == p2.getPrice()){
            return 0;
        }else{
            return -1;
        }
    }
}