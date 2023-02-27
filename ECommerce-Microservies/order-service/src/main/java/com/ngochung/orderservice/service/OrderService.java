package com.ngochung.orderservice.service;

import com.ngochung.orderservice.dto.OrderRequest;

public interface OrderService {
    String placeOrder(OrderRequest orderRequest);
}
