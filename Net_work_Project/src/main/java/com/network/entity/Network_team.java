package com.network.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Net_Work_Team")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor


public class Network_team {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Empolyee_Id")
	Long id ;
	
	@Column(name = "Empolyee_Name")
	String name ;
	
	@Column(name = "Desiginaton")
	String desigination ;
	
	@Column(name = "Employee_Experience")
	Long experience; 
	
	@Column(name = "Salary")
	Long salary;
	
	@Column(name = "Location")
	String location ;
	
	
	

}
