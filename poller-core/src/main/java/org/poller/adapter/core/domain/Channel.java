/**
 * 
 */
package org.poller.adapter.core.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.MapKeyColumn;
import javax.persistence.Table;

/**
 * @author somnath
 *
 */

@Entity
@Table(name="CHANNEL")
public class Channel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CHANNEL_ID")
	private long channelId;
	
	@Column(name="CHANNEL_NAME")
	private String channelName;
	
	
	@ElementCollection
	@MapKeyColumn(name="PROPERTY_KEY")
	@Column(name="PROPERTY_VALUE")
	@CollectionTable(name="CHANNEL_PROPERTIES")
	private Map<String, String> properties;
	
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
	private Date modifiedDate;
	
	@ManyToMany
	@JoinTable(name="CHANNEL_CLUSTER_MAP", joinColumns=@JoinColumn(name="CHANNEL_ID"), inverseJoinColumns=@JoinColumn(name="CLUSTER_ID"))
	private Set<Cluster> cluster = new HashSet<Cluster>(0);
	
	public long getChannelId() {
		return channelId;
	}
	public void setChannelId(long channelId) {
		this.channelId = channelId;
	}
	public String getChannelName() {
		return channelName;
	}
	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}
	public Map<String, String> getProperties() {
		return properties;
	}
	public void setProperties(Map<String, String> properties) {
		this.properties = properties;
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
		return modifiedDate;
	}
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	public Set<Cluster> getCluster() {
		return cluster;
	}
	public void setCluster(Set<Cluster> cluster) {
		this.cluster = cluster;
	}
	
	public Properties getPropertiesOfMap(){
		Properties property = new Properties();
		if(this.properties!=null)
			property.putAll(properties);
			return property;
	}
}
