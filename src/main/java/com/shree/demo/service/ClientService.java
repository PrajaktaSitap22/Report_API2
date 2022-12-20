package com.shree.demo.service;

import java.util.List;

import com.shree.demo.Entity.ClientInfo;

//import com.shree.demo.Entity.ClientInfo;

public interface ClientService {
	public List<ClientInfo> findByPlanName( String PlanName);

	public List<ClientInfo> findByPlanStatus(String PlanStatus);
	
    // public List<ClientInfo> generatePdf(ClientInfo clientinfo); 
     //public String getPlanStatus();


}
