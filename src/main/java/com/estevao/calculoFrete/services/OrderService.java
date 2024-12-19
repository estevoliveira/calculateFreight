package com.estevao.calculoFrete.services;

import com.estevao.calculoFrete.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;

    public Double total(Order order){
        var percentage =order.getDiscount()/100;
        var valueWithDiscount = order.getBasic() - (order.getBasic()*percentage);
        return valueWithDiscount + shippingService.shipment(order);
    }
}
