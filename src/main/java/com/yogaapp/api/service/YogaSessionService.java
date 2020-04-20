package com.yogaapp.api.service;

import java.util.List;

import com.yogaapp.api.model.YogaSessionDTO;

public interface YogaSessionService {
	
	public YogaSessionDTO saveSession(YogaSessionDTO dto);
	
	public List<YogaSessionDTO> getAllSessions();

}
