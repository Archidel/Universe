package com.archidel.universe.bean.character;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "person_location")
public class PersonLocation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue()
	@Column(name = "pl_id", unique = true, nullable = false)
	private long id;

	@Column(name = "pl_x", nullable = false)
	private float x;

	@Column(name = "pl_y", nullable = false)
	private float y;

	@Column(name = "pl_z", nullable = false)
	private float z;

	@OneToOne()
	@PrimaryKeyJoinColumn
	@JsonIgnore
	private Person person;

	public PersonLocation() {
	}

	public PersonLocation(float x, float y, float z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public float getZ() {
		return z;
	}

	public void setZ(float z) {
		this.z = z;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "PersonLocation [id=" + id + ", x=" + x + ", y=" + y + ", z=" + z + "]";
	}

}
