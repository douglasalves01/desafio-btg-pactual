package com.example.btgpactual.orderms.repository;

import com.example.btgpactual.orderms.entity.OrderEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<OrderEntity,Long> {
}
