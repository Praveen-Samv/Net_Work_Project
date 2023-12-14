package com.network.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.network.entity.Network_team;
import com.network.service.Net_Work_Service;

@Controller
//@RestController("Net_work")
public class Net_Work_Controller {
	
	@Autowired
	private Net_Work_Service net_Work_Service ;
	
	@PostMapping("/create_data")
	public ResponseEntity<Network_team>  create_NetWork_Team(@RequestBody Network_team network_team){
		Network_team save_data = net_Work_Service.create_NetWork_Team(network_team);
		return new ResponseEntity<>(save_data, HttpStatus.CREATED);
		
	}
	
	@GetMapping("/getid/{id}")
	public ResponseEntity<Network_team>  get_team_id(@PathVariable("id") Long id){
		Network_team get_data = net_Work_Service.getTeam_Memeber(id);
		return new ResponseEntity<>(get_data, HttpStatus.OK);
		
	}
	
	@GetMapping("/getAllData")
	public ResponseEntity<List<Network_team>> getAllData(){
		List<Network_team> data = net_Work_Service.get_All_Details();
		return new ResponseEntity<>(data,HttpStatus.OK);
		
	}
	
	@PutMapping("/updateData/{id}")
	public ResponseEntity<Network_team> updated_data(@PathVariable("id") Long id, @RequestBody Network_team network_team){
		
		network_team.setId(id);
		Network_team updates = net_Work_Service.update_netWork(network_team);
		
		return new ResponseEntity<>(updates, HttpStatus.OK) ;
		
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleted_id(@PathVariable("id") Long id){
		net_Work_Service.delete_network_detail(id);
		return new ResponseEntity<>("Data is deleted succsfully." , HttpStatus.OK);
		
	}
	
	

}
