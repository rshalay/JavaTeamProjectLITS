package ua.com.lits.automation.java.homeworkProject;

import java.util.Comparator;

public class SortData implements Comparator<ParseData> {
	public int compare(ParseData s1, ParseData s2) {
		if (s1.getSurname().compareTo(s2.getSurname()) != 0) {
			return s1.getSurname().compareTo(s2.getSurname());
		}
		if (s1.getPost().compareTo(s2.getPost()) != 0) {
			return s1.getPost().compareTo(s2.getPost());
		}
		if (s1.getSalary().compareTo(s2.getSalary()) == 0)
			System.out.println("");
		return s1.getSalary().compareTo(s2.getSalary());
	}
}
