package ua.com.lits.automation.java.homeworkProject;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ParseData {

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
	public ParseData(@JsonProperty("surname") String surname, @JsonProperty("post") String post,
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

	public int compareTo(ParseData p) {
		int result = this.surname.compareTo(p.surname);
		return result;
	}

}