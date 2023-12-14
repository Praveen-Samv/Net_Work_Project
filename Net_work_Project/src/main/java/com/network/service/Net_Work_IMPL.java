package com.network.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.network.entity.Network_team;
import com.network.repository.Net_Work_Team;

@Service
public class Net_Work_IMPL implements Net_Work_Service{
	
	@Autowired
	private Net_Work_Team net_Work_Team ;
	
	

	@Override
	public Network_team create_NetWork_Team(Network_team network_team) {
		
		return net_Work_Team.save(network_team);
	}

	@Override
	public Network_team getTeam_Memeber(Long id) {
		Optional<Network_team> opt = net_Work_Team.findById(id);
		return opt.get();
	}

	
	@Override
	public List<Network_team> get_All_Details() {
		
		return net_Work_Team.findAll();
	}

	@Override
	public Network_team update_netWork(Network_team network_team) {
		Network_team update = net_Work_Team.findById(network_team.getId()).get();
		update.setName(network_team.getName());
		update.setDesigination(network_team.getDesigination());
		update.setExperience(network_team.getExperience());
		update.setSalary(network_team.getSalary());
		update.setLocation(network_team.getLocation());
		Network_team date = net_Work_Team.save(update);
		
		return date;
	}

	@Override
	public void delete_network_detail(Long id ) {

		net_Work_Team.deleteById(id);
	}
	
	

}
