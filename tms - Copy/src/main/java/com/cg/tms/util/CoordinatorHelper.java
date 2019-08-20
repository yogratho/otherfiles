
package com.cg.tms.util;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

import com.cg.tms.exception.ProgramException;

public class CoordinatorHelper {
	

	public static  boolean isDatenotExpired(String inputDate) throws ProgramException {
		LocalDate startDate = null;
		try {
			startDate = LocalDate.parse(inputDate);
			if (startDate.isBefore(LocalDate.now())) {
				throw new ProgramException("Date is already gone.Backdate not possible");
			}
		} catch (DateTimeParseException e) {
			throw new ProgramException("Invalid Date format!! Please Enter in specific format");
		}
		return true;
	}

	
//	public static String generateStudentId() {
//		StringBuilder studentId = new StringBuilder("ST_");
//		int number = LocalDate.now().getDayOfMonth();
//		if (number < 10) {
//			studentId.append('0');
//		}
//		studentId.append(number);
//		studentId.append(Student.studentSeq++);
//		return String.valueOf(studentId);
//	}
//
//	public static String generateTrainingId() {
//		StringBuilder trainingId = new StringBuilder("TP_");
//		int number = LocalDate.now().getDayOfMonth();
//		if (number < 10) {
//			trainingId.append('0');
//		}
//		trainingId.append(number);
//		trainingId.append(Program.tProgramSeq++);
//		return String.valueOf(trainingId);
//	}

}