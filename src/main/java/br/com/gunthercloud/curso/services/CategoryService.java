package br.com.gunthercloud.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gunthercloud.curso.entites.Category;
import br.com.gunthercloud.curso.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository category;

	public List<Category> findAll(){
		return category.findAll();
	}
	public Category findById(Long id) {
		Optional<Category> obj = category.findById(id);
		return obj.get();
	}
}
