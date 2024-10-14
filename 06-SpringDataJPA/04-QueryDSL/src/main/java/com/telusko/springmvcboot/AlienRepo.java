package com.telusko.springmvcboot;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telusko.springmvcboot.model.Alien;

public interface AlienRepo extends JpaRepository<Alien, Integer>{

	//List<Alien> findByAname(String aname);    //Query DSL
	List<Alien> findByAnameOrderByAidDesc(String aname);

}


