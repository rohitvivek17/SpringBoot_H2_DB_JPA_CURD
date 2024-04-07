package com.pro.H2Practical;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface JobRepositry extends JpaRepository<Job, Long> {

}
