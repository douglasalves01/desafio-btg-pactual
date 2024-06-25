package com.example.btgpactual.orderms.listener;

import com.example.btgpactual.orderms.listener.dto.OrderCreatedEvent;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import static com.example.btgpactual.orderms.config.RabbitMqConfig.ORDER_CREATED_QUEUE;

@Component
public class OrderCreatedListener {
    @RabbitListener(queues = ORDER_CREATED_QUEUE)
    public void Listen(Message<OrderCreatedEvent> message){

    }
}
