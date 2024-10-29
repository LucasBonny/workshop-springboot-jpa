package br.com.gunthercloud.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gunthercloud.curso.entites.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
