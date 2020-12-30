package com.nuvimi.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nuvimi.application.entity.Vitamin;
import com.nuvimi.application.service.VitaminService;

@RestController
public class VitaminController {

	@Autowired
	VitaminService vitaminService;

	@GetMapping(path = "/vitaminDetails")
	public Vitamin getVitaminDetails(@RequestParam(value = "vitaminName") String vitaminName) {
		return vitaminService.getVitaminDetails(vitaminName);
	}

	@GetMapping(path = "/vitamins")
	public List<Vitamin> getVitamins() {
		return vitaminService.getVitamins();
	}
}