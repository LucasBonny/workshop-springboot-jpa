package br.com.gunthercloud.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gunthercloud.curso.entites.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
