package com.nuvimi.application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nuvimi.application.entity.Mineral;
import com.nuvimi.application.entity.Vitamin;
import com.nuvimi.application.repository.MineralRepository;

@Service
public class MineralService {

	@Autowired
	MineralRepository mineralRepository;

	public Mineral getMineralDetails(String mineralName) {
		return mineralRepository.findByMineralName(mineralName);
	}

	public List<Mineral> getMinerals() {

		List<Mineral> mineralList = mineralRepository.findAll();

		return mineralList;
	}
}
