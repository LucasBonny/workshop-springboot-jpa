package br.com.gunthercloud.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gunthercloud.curso.entites.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
