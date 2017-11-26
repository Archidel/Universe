package com.archidel.universe.bean.user;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.archidel.universe.bean.character.Person;

@Entity
@Table(name = "user")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue()
	@Column(name = "u_id")
	private long id;

	@Column(name = "u_firstname")
	private String firstname;

	@Column(name = "u_lastname")
	private String lastname;

	@Column(name = "u_birth")
	private Date birth;

	@Column(name = "u_email")
	private String email;

	@Column(name = "u_login")
	private String login;

	@Column(name = "u_password")
	private String password;

	@Column(name = "u_secret_answer")
	private String secretAnswer;

	@Column(name = "u_status")
	private boolean status;

	@Column(name = "u_blocked")
	private boolean blocked;

	@OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
	private List<Person> personList;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ur_id")
	private UserRole userRole;

	public User() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSecretAnswer() {
		return secretAnswer;
	}

	public void setSecretAnswer(String secretAnswer) {
		this.secretAnswer = secretAnswer;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public boolean isBlocked() {
		return blocked;
	}

	public void setBlocked(boolean blocked) {
		this.blocked = blocked;
	}

	public UserRole getUserRole() {
		return userRole;
	}

	public void setUserRole(UserRole userRole) {
		this.userRole = userRole;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public List<Person> getPersonList() {
		return personList;
	}

	public void setPersonList(List<Person> personList) {
		this.personList = personList;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", birth=" + birth
				+ ", email=" + email + ", login=" + login + ", password=" + password + ", secretAnswer=" + secretAnswer
				+ ", status=" + status + ", blocked=" + blocked + ", personList=" + personList + ", userRole="
				+ userRole + "]";
	}

}
