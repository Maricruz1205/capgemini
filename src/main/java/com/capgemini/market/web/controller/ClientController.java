package com.capgemini.market.web.controller;

import com.capgemini.market.domain.Client;
import com.capgemini.market.domain.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/api/clients")
public class ClientController {



    @Autowired
    private ClientService clientService;

    @GetMapping("/all")
    public List<Client> getAll(){
      return clientService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Client> getClient(@PathVariable("id")String id){

      return clientService.getClient(id);
    }


    //***********************************
    //@GetMapping("/{name}")
    //public Optional<Customer> getByName(@PathVariable("name")String name){

    //return customerService.getByName(name);
    //}
    // ***********************************
    @PostMapping("/save")
    public Client save(@RequestBody Client client){
      return clientService.save(client);
    }

    @DeleteMapping("/delete/{id}")
    public  boolean delete(@PathVariable("id")String id){
      return clientService.delete(id);
    }
  }


