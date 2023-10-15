package com.valorfuturoenergia.vfe.resources;

import com.valorfuturoenergia.vfe.entities.OrderItem;
import com.valorfuturoenergia.vfe.services.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/orderItem")
public class OrderItemResource {
    @Autowired
    private OrderItemService service;
    @GetMapping
    public ResponseEntity<List<OrderItem>> findAll(){
        List<OrderItem> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }
    @GetMapping(value="/{id}")
    public ResponseEntity<OrderItem> findById(@PathVariable Long id){
        OrderItem obj  = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
