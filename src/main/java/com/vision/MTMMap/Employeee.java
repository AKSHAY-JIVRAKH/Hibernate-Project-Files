package com.vision.MTMMap;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Employeee {
	
	@Id
	private int eid;
	private String ename;
	
	@ManyToMany
	//@JoinTable(name="Emp_Proj")
	private List<Project> projects;

	public Employeee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employeee(int eid, String ename, List<Project> projects) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.projects = projects;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	@Override
	public String toString() {
		return "Employeee [eid=" + eid + ", ename=" + ename + ", projects=" + projects + "]";
	}

	
	
}
