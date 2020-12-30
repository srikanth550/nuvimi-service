package com.nuvimi.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nuvimi.application.entity.Mineral;
import com.nuvimi.application.service.MineralService;

@RestController
public class MineralController {

	@Autowired
	MineralService mineralService;
	
	@GetMapping(path = "/minerals")
	public List<Mineral> getMinerals() {
		return mineralService.getMinerals();
	}

	@GetMapping(path = "/mineralDetails")
	public Mineral getVitaminDetails(@RequestParam(value = "mineralName") String mineralName) {
		return mineralService.getMineralDetails(mineralName);
	}
}