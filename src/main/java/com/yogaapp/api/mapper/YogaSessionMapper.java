package com.yogaapp.api.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.yogaapp.api.entity.YogaSession;
import com.yogaapp.api.model.YogaSessionDTO;

@Mapper(componentModel = "spring")
public interface YogaSessionMapper {

	public YogaSessionDTO toDTO(YogaSession session);
	
	public YogaSession toEntity(YogaSessionDTO dto);
	
	public List<YogaSession> toEntityList(List<YogaSessionDTO> dtos);
	
	public List<YogaSessionDTO> toDtos(List<YogaSession> sessions);
}
