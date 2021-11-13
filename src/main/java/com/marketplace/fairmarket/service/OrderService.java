package com.marketplace.fairmarket.service;

import com.marketplace.fairmarket.dto.OrderDTO;
import com.marketplace.fairmarket.dto.ResponseOrder;
import com.marketplace.fairmarket.enums.OrderStatus;
import com.marketplace.fairmarket.exception.EntityNotFoundException;
import com.marketplace.fairmarket.model.Customer;
import com.marketplace.fairmarket.model.Order;
import com.marketplace.fairmarket.model.Producer;
import com.marketplace.fairmarket.repository.CustomerRepository;
import com.marketplace.fairmarket.repository.OrderRepository;
import com.marketplace.fairmarket.repository.ProducerRepository;
import lombok.RequiredArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository orderRepository;
    private final CustomerRepository customerRepository;
    private final ProducerRepository producerRepository;

    public ResponseOrder makeOrder(OrderDTO orderDTO) {
        Customer customer = customerRepository.findCustomerByNameAndSurnameAndEmail(orderDTO.getUserName(), orderDTO.getUserSurname(), orderDTO.getUserEmail());
        Producer producer = producerRepository.findProducerByNameAndSurnameAndEmail(orderDTO.getProducerName(), orderDTO.getProducerSurname(), orderDTO.getProducerEmail());
        if (customer != null && producer != null) {
            Order order = new Order(new ObjectId(), LocalDate.now().toString(), UUID.randomUUID(), customer, producer, OrderStatus.UNPAID);
            orderRepository.save(order);
            return new ResponseOrder(order.getNumber(), true);
        } else return new ResponseOrder(null, false);
    }

    public Optional<Order> getOrderByNumber(UUID number){
        return orderRepository.findOrderByNumber(number);
    }

    public void updateOrderStatus(UUID number){
        orderRepository.save(orderRepository.findOrderByNumber(number).orElseThrow(() -> new EntityNotFoundException("No such order with number "+number)));
    }
}
