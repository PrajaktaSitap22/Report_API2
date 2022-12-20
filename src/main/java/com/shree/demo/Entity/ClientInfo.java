package com.shree.demo.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="ClientInfo_Table")
public class ClientInfo {
	
	@Id
	@GeneratedValue
	private Integer ClientId;
	@Column(name="CLIENT_NAME")
	private String ClientName;
	@Column(name="CLIENT_EMAIL")
	private String ClientEmail;
	@Column(name="CLIENT_NUM")
	private Long ClientNum;
	@Column(name="GENDER")
	private String Gender;
	@Column(name="SSCNO")
	private Integer sscno;
	private String PlanName;
	private String PlanStatus;
	

}