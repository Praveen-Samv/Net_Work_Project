package com.network.service;

import java.util.List;

import com.network.entity.Network_team;

public interface Net_Work_Service {
	
	Network_team create_NetWork_Team(Network_team network_team);
	Network_team getTeam_Memeber(Long id);
	List<Network_team> get_All_Details();
	Network_team update_netWork(Network_team network_team);
	void delete_network_detail(Long id );

}
