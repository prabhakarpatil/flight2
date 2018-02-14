package com.example.demo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.FlightJPAClass;

public interface FlightCRUD extends CrudRepository<FlightJPAClass,Long>{

}
