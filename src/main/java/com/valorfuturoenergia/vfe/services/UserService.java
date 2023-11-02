package com.valorfuturoenergia.vfe.services;

import com.valorfuturoenergia.vfe.entities.User;
import com.valorfuturoenergia.vfe.repositories.UserRepository;
import com.valorfuturoenergia.vfe.services.exceptions.DataBaseException;
import com.valorfuturoenergia.vfe.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;
    public List<User> findAll(){
        return repository.findAll();
    }
    public User findById(Long id){
        Optional<User> obj = repository.findById(id);
        return obj.orElseThrow(()-> new ResourceNotFoundException(id)) ;
    }
    public User insert(User obj){
        return repository.save(obj);
    }

    public void delete(Long id){

        try{
            repository.deleteById(id);
        } catch (EmptyResultDataAccessException e){
            throw new ResourceNotFoundException(id);
        } catch ( DataIntegrityViolationException e ){
            throw new DataBaseException(e.getMessage());
        }
    }
    public User update(Long id,User obj){
        User entity;
        entity = repository.getReferenceById(id);
        updateData(entity,obj);
        return repository.save(entity);
    }

    private void updateData(User entity, User obj) {
        entity.setEmail(obj.getEmail());
        entity.setName(obj.getName());
        entity.setPhone(obj.getPhone());
    }
}
