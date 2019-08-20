package com.cg.tms.service;

import java.util.List;

import com.cg.tms.entity.Skill;

public interface TrainerService {
	
	public String addSkill(String trainerID,String skill);
	public String delSkill(Integer trainerID);
	public List<Skill> getSkill(String trainerID);
	public String versatileTrainer();
	public String countEmp(String skill);
}
