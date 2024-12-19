package com.estevao.calculoFrete;

import com.estevao.calculoFrete.entities.Order;
import com.estevao.calculoFrete.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculoFreteApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(CalculoFreteApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Order exemplo1 = new Order(1034,150.0,20.0);
		Order exemplo2 = new Order(2282,800.0,10.0);
		Order exemplo3 = new Order(1309,95.9,0.0);

		System.out.printf("Pedido códico %d\nValor total: R$ %.2f",exemplo1.getCode(),orderService.total(exemplo1));
		System.out.printf("\nPedido códico %d\nValor total: R$ %.2f",exemplo2.getCode(),orderService.total(exemplo2));
		System.out.printf("\nPedido códico %d\nValor total: R$ %.2f",exemplo3.getCode(),orderService.total(exemplo3));
	}
}
