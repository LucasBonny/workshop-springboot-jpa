package br.com.gunthercloud.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gunthercloud.curso.entites.OrderItem;
import br.com.gunthercloud.curso.entites.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
