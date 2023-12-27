package com.exercicio1.exercicio.componentes.e.injecao.de.dependencia.services;


import org.springframework.stereotype.Service;

@Service
public class Order {

    private Integer code;

    private Double basicValue;

    private Double discount;


    public Order() {

    }

    public Order(Integer code, Double basicValue, Double discount) {
        this.code = code;
        this.basicValue = basicValue;
        this.discount = discount;
    }

    public Integer getCode() {
        return code;
    }


    public Double getBasicValue() {
        return basicValue;
    }


    public Double getDiscount() {
        return discount;
    }


}
