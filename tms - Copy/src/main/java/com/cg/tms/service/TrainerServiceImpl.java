package com.cg.tms.service;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.tms.controller.AdminController;
import com.cg.tms.dao.TrainerDao;
import com.cg.tms.entity.Skill;

@Service
public class TrainerServiceImpl implements TrainerService
{
	
	public static org.slf4j.Logger logService=LoggerFactory.getLogger(AdminController.class);

	
	@Autowired
	private TrainerDao dao;
	
	@Override
	public String addSkill(String trainerID, String skill) {
		logService.info("Some Business Logic is under execution");

		return dao.addSkill(trainerID, skill);
	}

	@Override
	public String delSkill(Integer trainerID) {
		logService.info("Some Business Logic is under execution");
		return dao.delSkill(trainerID);
	}

	@Override
	public List<Skill> getSkill(String trainerID) {
		logService.info("Some Business Logic is under execution");
		System.out.println(trainerID);
		return dao.getSkill(trainerID);
	}

	@Override
	public String versatileTrainer() {
		logService.info("Some Business Logic is under execution");
		return dao.findSkilledTrainer();
	}

	@Override
	public String countEmp(String skill) {
		
		return dao.skillBasedCount(skill);
	}

}
