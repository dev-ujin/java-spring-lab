package com.devujin.springcorebasics.order;

public interface OrderService {
    Order createOrder(Long memberId, String itemName, int itemPrice);
}
