package com.estevao.calculoFrete.services;

import com.estevao.calculoFrete.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public Double shipment(Order order){
        var freight =0.0;
        if(order.getBasic() < 100.0){
            freight = 20.0;
        } else if (order.getCode() >= 100.0 && order.getBasic() <=200.0) {
            freight = 12.0;
        }else {
            freight = 0.0;
        }
        return freight;
    }
}
