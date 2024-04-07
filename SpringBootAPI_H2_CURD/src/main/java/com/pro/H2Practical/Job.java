package com.pro.H2Practical;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table
@Data
public class Job {
	@Column
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String job_name;
	private String job_desc;
	private String location;
	private int salary;
	
}
