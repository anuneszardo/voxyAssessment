package br.com.mvc.voxy.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import br.com.mvc.voxy.model.UserForm;

//Repository for crud operations with spring data
@Service
public interface UserFormRepository extends CrudRepository<UserForm, Long>{
	
}
