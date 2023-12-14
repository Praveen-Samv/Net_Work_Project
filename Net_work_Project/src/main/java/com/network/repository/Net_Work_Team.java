package com.network.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.network.entity.Network_team;

@Repository
public interface Net_Work_Team  extends JpaRepository<Network_team, Long>{

}
