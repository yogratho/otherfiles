package com.cg.tms.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.cg.tms.controller.AdminController;
import com.cg.tms.entity.Skill;

@Repository
@Transactional

public class TrainerDaoImpl implements TrainerDao {
	
	public static org.slf4j.Logger logDao=LoggerFactory.getLogger(AdminController.class);

	
	
	@PersistenceContext
	private EntityManager entityManager;
	@Override
	public String addSkill(String trainerID, String skill) {
		logDao.info("Dao operation is under execution:adding skills");
		
		Skill skillobj=new Skill();
		skillobj.setEmployeeid(trainerID);
		skillobj.setSkilldesc(skill);
		
		
		entityManager.persist(skillobj);
		
		
		

		
		return "Skill is Successfully added";
	}

	@Override
	public String delSkill(Integer trainerID) {
		
		logDao.info("Dao operation is under execution:deleting skills");

		Skill skillObj =entityManager.find(Skill.class,trainerID);
		if(skillObj!=null)
		{
		
		entityManager.remove(skillObj);
		
		return "Skill is Successfully deleted";
		}
		else
			return "No Trainer Found for given entry";
		}

	@Override
	public List<Skill> getSkill(String trainerID) {
		
		logDao.info("Dao operation is under execution:retreiving skills");
		
		
		Query query=entityManager.createQuery("select sk from Skill sk where sk.employeeid=:employeeid");
	      query.setParameter("employeeid", trainerID);
			
	      List<Skill> list=query.getResultList();
		System.out.println(list);
		return list;
	}

	@Override
	public String findSkilledTrainer() {
		logDao.info("Dao operation is under execution:finding Most Skilledfull trainer");

		Query query=entityManager.createQuery("select distinct employeeid from Skill");
		List<String> employeesList=query.getResultList();
		System.out.println(employeesList);
		long skillCount=0;
		String id="";
		for(String eid:employeesList)
		{	
			System.out.println(eid);
			Query query2=entityManager.createQuery("select count(skilldesc) from Skill  where employeeid=:idCheck");
			query2.setParameter("idCheck", eid);
			 List<Long> Count=query2.getResultList();
			 System.out.println(Count);
			 System.out.println("Number of skills for trainer id "+eid+" Are"+Count);
			 if(Count.get(0)>=skillCount)
			 {
				 skillCount=Count.get(0);
				 id=eid;
			 }
		}
		


		return id;
	}

	@Override
	public String skillBasedCount(String skill) {
		
		String response=""; 
		 Query query=entityManager.createQuery("select distinct count(employeeid) from Skill where skilldesc=:skillcheck");
		query.setParameter("skillcheck",skill);
		List<Long> countEmp =query.getResultList();
		response="Number of Trainers having "+skill+" as a skill are "+countEmp.get(0);
		
		return response;
	}

}
