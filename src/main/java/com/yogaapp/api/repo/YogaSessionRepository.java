package com.yogaapp.api.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yogaapp.api.entity.YogaSession;

@Repository
public interface YogaSessionRepository extends JpaRepository<YogaSession, Long> {
}
