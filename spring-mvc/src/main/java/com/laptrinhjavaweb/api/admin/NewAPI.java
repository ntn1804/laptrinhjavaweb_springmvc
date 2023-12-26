package com.laptrinhjavaweb.api.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.laptrinhjavaweb.dto.NewDTO;
import com.laptrinhjavaweb.service.INewService;

@RestController(value = "newAPIOfAdmin")
public class NewAPI {
	
	@Autowired
	private INewService newService;
	
	@PostMapping("/api/new")
	// RequestBody = data nhan tu client vao server
	public NewDTO createNew(@RequestBody NewDTO newDTO) {
		// return newDTO = kieu data server tra lai client
		return newService.save(newDTO);
	}
	
	@PutMapping("/api/new")
	public NewDTO updateNew(@RequestBody NewDTO updateDTO) {
		return newService.save(updateDTO);
	}
	
	@DeleteMapping("/api/new")
	public void deleteNew(@RequestBody long[] ids){
		newService.delete(ids);
	}
}
