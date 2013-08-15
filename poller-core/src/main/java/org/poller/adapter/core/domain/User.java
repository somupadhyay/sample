package org.poller.adapter.core.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="ADAPTER_USER")
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="USER_ID")
	private long userId;
	
	@Column(name="FIRST_NAME")
	private String firstName;
	
	@Column(name="LAST_NAME")
	private String lastName;
	
	@Column(name="EMAIL_ADDRESS")
	private String emailId;
	
	@Column(name="IS_ADMIN")
	private boolean admin;
	
	@Column(name="IS_DELETED")
	private boolean userDeleted;
	
	
	@ManyToOne
	@JoinColumn(name = "CREATED_BY", referencedColumnName = "USER_ID")
	private User createdBy;
	
	@Column(name="CREATED_DATE")
	private Date createdDate;
	
	@ManyToOne
	@JoinColumn(name = "MODIFIED_BY", referencedColumnName = "USER_ID")
	private User modifiedBy;
	
	@Column(name="MODIFIED_DATE")
	private Date modifiedDate;

	
	@Column(name="IS_ACTIVE")
	private boolean userActive;
	
	@Column(name="PASSWORD")
	private String password;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="USER_ROLES_MAP", joinColumns=@JoinColumn(name="ROLE_ID"), inverseJoinColumns=@JoinColumn(name="USER_ID"))
	private Set<Role> reles = new HashSet<Role>(0);
	
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public boolean isAdmin() {
		return admin;
	}
	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
	public boolean isUserDeleted() {
		return userDeleted;
	}
	public void setUserDeleted(boolean userDeleted) {
		this.userDeleted = userDeleted;
	}
	public User getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(User createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public User getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(User modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	public Date getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	public boolean isUserActive() {
		return userActive;
	}
	public void setUserActive(boolean userActive) {
		this.userActive = userActive;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Set<Role> getReles() {
		return reles;
	}
	public void setReles(Set<Role> reles) {
		this.reles = reles;
	}
	
}
