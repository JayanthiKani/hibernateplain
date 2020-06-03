package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface QueryJPARepository extends JpaRepository<queryBean, Long> {

	queryBean findByQueryId(long id);

	void deleteByQueryId(long id);
	

}
