package com.nuvimi.application.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.nuvimi.application.entity.Vitamin;

public interface VitaminRepository extends Repository<Vitamin, String> {

	Vitamin findByVitaminName(String vitaminName);

	List<Vitamin> findAll();

}