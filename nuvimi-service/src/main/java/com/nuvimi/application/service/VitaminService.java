package com.nuvimi.application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nuvimi.application.entity.Vitamin;
import com.nuvimi.application.repository.VitaminRepository;

@Service
public class VitaminService {

	@Autowired
	VitaminRepository vitaminRepository;

	public Vitamin getVitaminDetails(String vitaminName) {
		return vitaminRepository.findByVitaminName(vitaminName);
	}

	public List<Vitamin> getVitamins() {

		List<Vitamin> vitaminList = vitaminRepository.findAll();

		return vitaminList;
	}
}
