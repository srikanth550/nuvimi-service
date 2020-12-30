package com.nuvimi.application.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.nuvimi.application.entity.Mineral;

public interface MineralRepository extends Repository<Mineral, String> {

	Mineral findByMineralName(String mineralName);

	List<Mineral> findAll();

}