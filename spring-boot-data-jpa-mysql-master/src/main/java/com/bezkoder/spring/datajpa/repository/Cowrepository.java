package com.bezkoder.spring.datajpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bezkoder.spring.datajpa.model.CowEntity;

public interface Cowrepository extends JpaRepository<CowEntity, Long> {
	//List<CowEntity> findByPublished(boolean published);
	//List<CowEntity> findByTitleContaining(String title);
}
