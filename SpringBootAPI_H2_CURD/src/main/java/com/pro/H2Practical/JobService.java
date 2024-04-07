package com.pro.H2Practical;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
@Service
public class JobService {
	@Autowired
	JobRepositry jr;
	
	public List<Job> views(){
		return jr.findAll();
	}
	
	public Job view(Long id){
		return jr.findById(id).orElse(null);
	}
	
	public Job saveJob(Job job) {
		return jr.save(job);
	}
	public Job editJob(Long id,Job job) {
		job.setId(id);
		return jr.save(job);
	}
	public String delJob(Long id) {
		jr.deleteById(id);
		return "Data deleted Sucessfully!!!, ID: "+id;
	}
	
	
	
	
}
