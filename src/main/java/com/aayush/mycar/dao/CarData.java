package com.aayush.mycar.dao;

import java.math.BigInteger;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.aayush.mycar.entities.Cars;

public interface CarData extends MongoRepository<Cars, BigInteger> {
	
}