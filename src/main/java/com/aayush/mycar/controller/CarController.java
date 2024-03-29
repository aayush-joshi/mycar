package com.aayush.mycar.controller;

import java.math.BigInteger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.aayush.mycar.dao.CarData;
import com.aayush.mycar.entities.Cars;

@RestController
public class CarController {
	
	@Autowired
	private CarData cardata;
	
	//Displays a welcome message
	@GetMapping("/homepage")
	public String myHome() {
		return "Hello there, Welcome to the Homepage of Cars Store.Browse entire catalogue now";
	}
	
	//Retrieves all Car objects.
	@GetMapping("/allcars")
	public ResponseEntity<?> getCars() {
		return ResponseEntity.ok(this.cardata.findAll());
	}
	
	//Retrieves the Car object with the specified id number.
	@GetMapping("/allcars/{carid}")
	public ResponseEntity<?> searchCar(@PathVariable BigInteger carid) {
		try {
			Cars details = this.cardata.findById(carid).get();
			return ResponseEntity.ok(details);	
		}
		catch(Exception e){
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}	
	}

	//Adds a new Car object.
	@PostMapping("/allcars")
	public ResponseEntity<?> newCar(@RequestBody Cars car) {
		Cars details = this.cardata.save(car);
		return ResponseEntity.ok(details);
	}
	
	//Updates the car object.
	@PutMapping("/allcars")
	public ResponseEntity<?> updateCar(@RequestBody Cars car) {
		Cars details = this.cardata.save(car);
		return ResponseEntity.ok(details);
	}
	
	//Deletes the car object.	
	@DeleteMapping("/allcars/{carid}")
	public ResponseEntity<?> removeCar(@PathVariable BigInteger carid) {
		try {
			Cars details = cardata.findById(carid).get();
			cardata.delete(details);
			return ResponseEntity.ok(details);
		}
		catch(Exception e){
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
			
	}
}