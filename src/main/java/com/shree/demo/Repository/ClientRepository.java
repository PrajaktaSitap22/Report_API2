package com.shree.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shree.demo.Entity.ClientInfo;

public interface ClientRepository extends JpaRepository <ClientInfo ,Integer> 
{

	//List<ClientInfo> findByPlanName(String planName);
	List<ClientInfo> findByPlanName( String PlanName);
	List<ClientInfo> findByPlanStatus(String PlanStatus);
	//public List<ClientInfo> findByPlanStatus(String PlanStatus);

}
