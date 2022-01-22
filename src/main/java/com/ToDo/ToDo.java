package com.ToDo;

import java.util.Objects;

public class ToDo {
	
	private int id;
	private String name;
	private String desc;
	private boolean isDone;
	
	
	public ToDo(int id, String name, String desc, boolean isDone) {
		super();
		this.id = id;
		this.name = name;
		this.desc = desc;
		this.isDone = isDone;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDesc() {
		return desc;
	}


	public void setDesc(String desc) {
		this.desc = desc;
	}


	public boolean isDone() {
		return isDone;
	}


	public void setDone(boolean isDone) {
		this.isDone = isDone;
	}


	@Override
	public int hashCode() {
		return Objects.hash(desc, id, isDone, name);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ToDo other = (ToDo) obj;
		return Objects.equals(desc, other.desc) && id == other.id && isDone == other.isDone
				&& Objects.equals(name, other.name);
	}


	@Override
	public String toString() {
		return "ToDo [id=" + id + ", name=" + name + ", desc=" + desc + ", isDone=" + isDone + "]";
	}
	
	

}
