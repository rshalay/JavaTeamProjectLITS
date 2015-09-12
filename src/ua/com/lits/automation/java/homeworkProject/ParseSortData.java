package ua.com.lits.automation.java.homeworkProject;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ParseSortData  implements Comparable<ParseSortData> {

	protected String surname;
	protected String post;
	protected Double salary;

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@JsonCreator
	public ParseSortData(@JsonProperty("surname") String surname, @JsonProperty("post") String post,
			@JsonProperty("salary") Double salary) {
		this.surname = surname;
		this.post = post;
		this.salary = salary;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("surname:\t" + surname + "\n");
		sb.append("post:\t\t" + post + "\n");
		sb.append("salary:\t\t" + salary + "\n");
		return sb.toString();
	}

    @Override
	public int compareTo(ParseSortData s2) {
		if (this.getSurname().compareTo(s2.getSurname()) != 0) {
			return this.getSurname().compareTo(s2.getSurname());
		} else if (this.getPost().compareTo(s2.getPost()) != 0) {
			return this.getPost().compareTo(s2.getPost());
		} else 
		return this.getSalary().compareTo(s2.getSalary());
		}

	}