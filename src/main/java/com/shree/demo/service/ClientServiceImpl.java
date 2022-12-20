package com.shree.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.shree.demo.Entity.ClientInfo;
import com.shree.demo.Repository.ClientRepository;

public  class ClientServiceImpl implements ClientService {

	@Autowired 
	private ClientRepository repo;

	@Override
	public  List<ClientInfo> findByPlanName(String PlanName)
	{
	  List<ClientInfo> findbyplanname =repo.findByPlanName(PlanName);
       findbyplanname.forEach(ClientInfo -> {
	        System.out.println(ClientInfo);
});
		return null;
	}

	@Override
     public List<ClientInfo> findByPlanStatus(String PlanStatus) {
		// TODO Auto-generated method stub
		List<ClientInfo> findbyplanstatus =repo.findByPlanStatus(PlanStatus);
		findbyplanstatus.forEach(ClientInfo -> {
			System.out.println(ClientInfo);
		});
		return null;
	}
	//@Override
	public List<ClientInfo> generatePdf(ClientInfo clientinfo)
	 {
		 return null;
	 }
	
}