package com.cg.tms.util;
/*All database queries*/
public class DBQueries {

	public static final String GET_ALL_TRAINER = "select employeeId,employeeName from employee where substr(roleid,2,1)='T'";
	public static final String GET_SKILL_FOR_TRAINER = "select skill from skill where employeeid=?";
	public static final String 
	CREATE_PROGRAM = "insert into program (trainingId,courseId,employeeId,centerId,startDate) values (?,?,?,?,?)";
	public static final String DELETE_PROGRAM_BY_ID = "delete from program where trainingid=?";
	public static final String GET_PROGRAM_ID = "select trainingId,courseId,employeeId,centerId,startDate from program where trainingid=?";
	public static final String GET_PROGRAMS = "select trainingId,courseId,employeeId,centerId,startDate from program";
//TO_DATE(?, 'yyyy-mm-dd')
	public static final String ENROLL_STUDENT = "insert into students (studentid,studentName,trainingId) values (?,?,?)";
	public static final String DELETE_STUDENT = "delete from students where studentId=? and trainingId=?";

}
