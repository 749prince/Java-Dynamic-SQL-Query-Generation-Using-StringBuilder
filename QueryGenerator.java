package com.kodewala.stringbuffer;

public class QueryGenerator {
	public StringBuilder generateQuery(int salary, String empID) {

		StringBuilder query = new StringBuilder("Select query from employee");

		if (salary > 0) {
			query.append("where salary= " + salary + ";");
		} else if (empID != null) {
			query.append("where empID =" + empID + ";");
		} else {
			query.append(";");
		}
		return query;
	}
}