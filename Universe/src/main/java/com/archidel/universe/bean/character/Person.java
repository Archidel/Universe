package com.archidel.universe.bean.character;

import java.io.Serializable;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.archidel.universe.bean.user.User;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "person")
public class Person implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue()
	@Column(name = "p_id", unique = true, nullable = false)
	private long id;

	@Column(name = "p_name", unique = true, nullable = false)
	private String name;

	@Column(name = "p_experience", nullable = false)
	private int experience;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "u_id")
	@JsonIgnore
	private User user;

	@OneToOne(mappedBy = "person", cascade = CascadeType.ALL)
	private PersonLocation personLocation;

	@Column(name = "p_blocked", nullable = false)
	private boolean blocked;

	@Temporal(TemporalType.DATE)
	@Column(name = "p_lastActivity")
	private Date lastActivity;

	public Person() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public boolean isBlocked() {
		return blocked;
	}

	public void setBlocked(boolean blocked) {
		this.blocked = blocked;
	}

	public Date getLastActivity() {
		return lastActivity;
	}

	public void setLastActivity(Date lastActivity) {
		this.lastActivity = lastActivity;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", experience=" + experience + ", personLocation="
				+ personLocation + ", blocked=" + blocked + ", lastActivity=" + lastActivity + "]";
	}

}
