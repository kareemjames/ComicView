package com.detroitlabs.comicview.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Cart {

    private List<Object> cart = new ArrayList<>();

    @Override
    public String toString() {
        return "Cart{" +
                "cart=" + cart +
                '}';
    }

    public List<Object> getCart() {
        return cart;
    }

    public void setCart(List<Object> cart) {
        this.cart = cart;
    }

    public void addToCart(Object obj) {
        cart.add(obj);
    }

}
