package com.yogaapp.api.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.yogaapp.api.entity.User;
import com.yogaapp.api.entity.YogaSession;
import com.yogaapp.api.mapper.YogaSessionMapper;
import com.yogaapp.api.model.YogaSessionDTO;
import com.yogaapp.api.repo.UserRepository;
import com.yogaapp.api.repo.YogaSessionRepository;
import com.yogaapp.api.service.YogaSessionService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class YogaSessionServiceImpl implements YogaSessionService {
	
	private final YogaSessionRepository yogaSessionRepository;
	private final YogaSessionMapper mapper;
	private final UserRepository userRepository;

	@Override
	public YogaSessionDTO saveSession(YogaSessionDTO dto) {
		YogaSession yogaSession = mapper.toEntity(dto);
		setTrainerId(dto.getTrainerName(), yogaSession);
		yogaSession = yogaSessionRepository.save(yogaSession);
		setTrainerName(yogaSession.getTrainerId(), dto);
		return dto;
	}
	
	@Override
	public List<YogaSessionDTO> getAllSessions() {
		return mapper.toDtos(yogaSessionRepository.findAll());
	}

	private void setTrainerName(long trainerId, YogaSessionDTO yogaSessionDTO) {
		Optional<User> user = userRepository.findById(trainerId);
		user.ifPresent(usr -> yogaSessionDTO.setTrainerName(usr.getName()));
	}
	
	private void setTrainerId(String trainerName, YogaSession yogaSession) {
		Optional<User> user = userRepository.findByName(trainerName);
		user.ifPresent(usr -> yogaSession.setTrainerId(user.get().getId()));
	}
}
