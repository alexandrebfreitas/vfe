package com.valorfuturoenergia.vfe.repositories;

import com.valorfuturoenergia.vfe.entities.OrderItem;
import com.valorfuturoenergia.vfe.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {
}
