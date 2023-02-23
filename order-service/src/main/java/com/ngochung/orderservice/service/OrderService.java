package com.ngochung.orderservice.service;

import com.ngochung.orderservice.dto.OrderRequest;

public interface OrderService {
    void placeOrder(OrderRequest orderRequest);
}
