package com.example.btgpactual.orderms.listener.dto;


import java.util.List;

public record OrderCreatedEvent(Long codigoPedido, Long CodigoCliente, List<OrderItemEvent> itens) {
}
