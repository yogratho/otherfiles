package com.cg.tms.dao;

import java.util.List;

import com.cg.tms.entity.Skill;

public interface TrainerDao {
	
	public String addSkill(String trainerID,String skill);
	public String delSkill(Integer trainerID);
	public List<Skill> getSkill(String trainerID);
	public String findSkilledTrainer();
	public String skillBasedCount(String skill);
}
