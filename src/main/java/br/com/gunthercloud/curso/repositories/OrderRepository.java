package br.com.gunthercloud.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gunthercloud.curso.entites.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
