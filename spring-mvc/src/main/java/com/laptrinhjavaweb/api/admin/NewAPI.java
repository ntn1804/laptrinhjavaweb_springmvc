package com.laptrinhjavaweb.api.admin;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.laptrinhjavaweb.dto.NewDTO;

@RestController(value = "newAPIOfAdmin")
public class NewAPI {
	
	@PostMapping("/api/new")
	// RequestBody = data nhan tu client vao server
	public NewDTO createNew(@RequestBody NewDTO newDTO) {
		// return newDTO = kieu data server tra lai client
		return newDTO;
	}
	
	@PutMapping("/api/new")
	public NewDTO updateNew(@RequestBody NewDTO newDTO) {
		return newDTO;
	}
	
	@DeleteMapping("/api/new")
	public void deleteNew(@RequestBody long[] ids){
		System.out.println("ok");
	}
}
