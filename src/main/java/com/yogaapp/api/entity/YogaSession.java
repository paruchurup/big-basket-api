package com.yogaapp.api.entity;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="YOGA_SESSION")
public class YogaSession {
	
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
	
	@Column(name = "session_start_time")
	private LocalDateTime sessionStartTime;
	
	@Column(name = "session_end_time")
	private LocalDateTime sessionEndTime;
	
	@Column(name = "seats_available")
	private int seatsAvailable;
	
	@Column(name = "trainer_id")
	private long trainerId;
	
	@Column(name = "live_stream_url")
	private String liveStreamUrl;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "yoga_session_students", joinColumns = { @JoinColumn(name = "session_id")}, inverseJoinColumns = {@JoinColumn(name = "user_id")})
	private List<User> students;

}
