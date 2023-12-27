package com.exercicio1.exercicio.componentes.e.injecao.de.dependencia.services;

import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public ShippingService() {
    }

    public double shipment(Order order) {

        if (order.getBasicValue() < 100) {
            return 20.00;
        } else if (order.getBasicValue() >= 100 && order.getBasicValue() < 200) {
            return 12.00;
        } else {
            return 0.0;
        }
    }
}
