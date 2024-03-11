package com.bezkoder.spring.datajpa.model;

import java.time.LocalDateTime;

//import java.sql.Timestamp;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "cow")
@Setter
@Getter
@ToString
public class CowEntity {

	@Id
	private LocalDateTime timeStamp;
	private int id;
	private String mobility;
	private int bpm;
	private double temperature;
	private String jMobility;
	private String gps;
	private String message;
	private String status;
	private String remarks;
	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(LocalDateTime timeStamp) {
		this.timeStamp = timeStamp;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMobility() {
		return mobility;
	}
	public void setMobility(String mobility) {
		this.mobility = mobility;
	}
	public int getBpm() {
		return bpm;
	}
	public void setBpm(int bpm) {
		this.bpm = bpm;
	}
	public double getTemperature() {
		return temperature;
	}
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
	public String getjMobility() {
		return jMobility;
	}
	public void setjMobility(String jMobility) {
		this.jMobility = jMobility;
	}
	public String getGps() {
		return gps;
	}
	public void setGps(String gps) {
		this.gps = gps;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	

}
