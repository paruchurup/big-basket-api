package com.yogaapp.api.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yogaapp.api.model.YogaSessionDTO;
import com.yogaapp.api.service.YogaSessionService;

import lombok.AllArgsConstructor;

@Controller
@CrossOrigin
@RequestMapping(value = "yoga-session", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class YogaSessionController {
	
	private final YogaSessionService yogaSessionService;
		
	@PostMapping()
	public ResponseEntity<YogaSessionDTO> createYogaSession(@RequestBody YogaSessionDTO yogaSessionDTO) {
		return new ResponseEntity<>(yogaSessionService.saveSession(yogaSessionDTO), HttpStatus.ACCEPTED);
	}
	
	@GetMapping()
	public ResponseEntity<List<YogaSessionDTO>> getAllSessions() {
		return new ResponseEntity<>(yogaSessionService.getAllSessions(), HttpStatus.OK);
	}
	

	
}
