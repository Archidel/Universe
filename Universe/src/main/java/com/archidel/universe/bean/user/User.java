package com.archidel.universe.bean.user;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
	private List<UserRole> roleList;

	public User() {
	}

	public User(long id, String firstname, String lastname, Date birth, String email, String login, String password,
			String secretAnswer, boolean status, boolean blocked, List<UserRole> roleList) {
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.birth = birth;
		this.email = email;
		this.login = login;
		this.password = password;
		this.secretAnswer = secretAnswer;
		this.status = status;
		this.blocked = blocked;
		this.roleList = roleList;
	}

	public User(String firstname, String lastname, Date birth, String email, String login, String password,
			String secretAnswer, boolean status, boolean blocked, List<UserRole> roleList) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.birth = birth;
		this.email = email;
		this.login = login;
		this.password = password;
		this.secretAnswer = secretAnswer;
		this.status = status;
		this.blocked = blocked;
		this.roleList = roleList;
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

	public List<UserRole> getRoleList() {
		return roleList;
	}

	public void setRoleList(List<UserRole> roleList) {
		this.roleList = roleList;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((birth == null) ? 0 : birth.hashCode());
		result = prime * result + (blocked ? 1231 : 1237);
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((firstname == null) ? 0 : firstname.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((lastname == null) ? 0 : lastname.hashCode());
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((roleList == null) ? 0 : roleList.hashCode());
		result = prime * result + ((secretAnswer == null) ? 0 : secretAnswer.hashCode());
		result = prime * result + (status ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (birth == null) {
			if (other.birth != null)
				return false;
		} else if (!birth.equals(other.birth))
			return false;
		if (blocked != other.blocked)
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (firstname == null) {
			if (other.firstname != null)
				return false;
		} else if (!firstname.equals(other.firstname))
			return false;
		if (id != other.id)
			return false;
		if (lastname == null) {
			if (other.lastname != null)
				return false;
		} else if (!lastname.equals(other.lastname))
			return false;
		if (login == null) {
			if (other.login != null)
				return false;
		} else if (!login.equals(other.login))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (roleList == null) {
			if (other.roleList != null)
				return false;
		} else if (!roleList.equals(other.roleList))
			return false;
		if (secretAnswer == null) {
			if (other.secretAnswer != null)
				return false;
		} else if (!secretAnswer.equals(other.secretAnswer))
			return false;
		if (status != other.status)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", birth=" + birth
				+ ", email=" + email + ", login=" + login + ", password=" + password + ", secretAnswer=" + secretAnswer
				+ ", status=" + status + ", blocked=" + blocked + ", roleList=" + roleList + "]";
	}

}
