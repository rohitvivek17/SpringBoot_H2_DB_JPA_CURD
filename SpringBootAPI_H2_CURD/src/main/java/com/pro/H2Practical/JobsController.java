package com.pro.H2Practical;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jobs")
public class JobsController {
	@Autowired
	JobService js;
	@GetMapping
	public List<Job> views(){
		return js.views();
	}
	@GetMapping("/{id}")
	public Job view(@PathVariable Long id){
		return js.view(id);
	}
	@PostMapping
	public Job saveJob(@RequestBody Job job) {
		return js.saveJob(job);
	}
	@DeleteMapping("/{id}")
	public String del(@PathVariable Long id) {
		return js.delJob(id);
	}
	@PutMapping("/{id}")
	public Job editJob(@PathVariable Long id,@RequestBody Job job) {
		job.setId(id);
		return js.saveJob(job);
	}
}
