package com.gcu;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrdersRepository extends MongoRepository<OrderEntity, Long>
{
// Example of truly overriding a method from the CrudRepository and using our own customized SQL @Override

public List<OrderEntity> findAll();
}