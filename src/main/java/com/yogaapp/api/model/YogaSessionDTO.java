package com.yogaapp.api.model;

import java.time.LocalDateTime;
import java.util.List;


import lombok.Data;

@Data
public class YogaSessionDTO {

	private LocalDateTime sessionStartTime;	
	private LocalDateTime sessionEndTime;
	private int seatsAvailable;
	private String trainerName;
	private String liveStreamUrl;
	private List<UserDTO> students;
}
