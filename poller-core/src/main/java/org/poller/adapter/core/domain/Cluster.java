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
@Table(name="CLUSTER_MAP")
public class Cluster {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CLUSTER_ID")
	private long clusterId;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="CHANNEL_CLUSTER_MAP", joinColumns=@JoinColumn(name="CLUSTER_ID"), inverseJoinColumns=@JoinColumn(name="CHANNEL_ID"))
	private Set<Channel> channels = new HashSet<Channel>(0);
	
	@Column(name="SERVER_NAME")
	private String hostName;
	
	@Column(name="DESCRIPTION")
	private String description;
	
	@ManyToOne
	@JoinColumn(name = "CREATED_BY", referencedColumnName = "USER_ID")
	private User createdBy;
	
	@Column(name="CREATED_DATE")
	private Date createdDate;
	
	@ManyToOne
	@JoinColumn(name = "MODIFIED_BY", referencedColumnName = "USER_ID")
	private User modifiedBy;
	
	@Column(name="MODIFIED_DATE")
	private Date ModifiedDate;
	
	@Column(name="CHANNEL_STATUS")
	private String status;
	
	@Column(name="CHANNEL_SUSPENDED")
	private String suspend;
	
	public long getClusterId() {
		return clusterId;
	}
	public void setClusterId(long clusterId) {
		this.clusterId = clusterId;
	}
	
	public Set<Channel> getChannels() {
		return channels;
	}
	public void setChannels(Set<Channel> channels) {
		this.channels = channels;
	}
	public String getHostName() {
		return hostName;
	}
	public void setHostName(String hostName) {
		this.hostName = hostName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
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
		return ModifiedDate;
	}
	public void setModifiedDate(Date modifiedDate) {
		ModifiedDate = modifiedDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getSuspend() {
		return suspend;
	}
	public void setSuspend(String suspend) {
		this.suspend = suspend;
	}
	
	
}
