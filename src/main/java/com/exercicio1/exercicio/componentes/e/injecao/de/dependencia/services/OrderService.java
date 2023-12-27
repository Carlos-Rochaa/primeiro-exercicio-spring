package com.exercicio1.exercicio.componentes.e.injecao.de.dependencia.services;

import org.springframework.stereotype.Service;

@Service
public class OrderService {


    private final ShippingService shippingService;

    public OrderService(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    public double total(Order order){
        return order.getBasicValue() - order.getBasicValue() * (order.getDiscount() / 100) + shippingService.shipment(order);
    }
}
