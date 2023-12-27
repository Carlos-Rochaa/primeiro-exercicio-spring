package com.exercicio1.exercicio.componentes.e.injecao.de.dependencia;

import com.exercicio1.exercicio.componentes.e.injecao.de.dependencia.services.Order;
import com.exercicio1.exercicio.componentes.e.injecao.de.dependencia.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class ExercicioComponentesEInjecaoDeDependenciaApplication implements CommandLineRunner {
    @Autowired
    private OrderService orderService;

    public static void main(String[] args) {
        SpringApplication.run(ExercicioComponentesEInjecaoDeDependenciaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Código do pedido: ");
        int codigoPedido = scanner.nextInt();
        System.out.print("Digite o valor do pedido: ");
        double valor = scanner.nextDouble();
        System.out.print("Digite a porcentagem de desconto: ");
        double desconto = scanner.nextDouble();

        Order order = new Order(codigoPedido, valor, desconto);
        System.out.println("Código do pedido: " + order.getCode());
        System.out.printf("Valor total: R$ %.2f%n", orderService.total(order));
        scanner.close();

    }
}
