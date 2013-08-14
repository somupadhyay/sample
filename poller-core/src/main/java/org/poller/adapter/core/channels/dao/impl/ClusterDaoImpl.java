/**
 * 
 */
package org.poller.adapter.core.channels.dao.impl;

import java.util.List;

import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.poller.adapter.core.channels.dao.ClusterDao;
import org.poller.adapter.core.dao.impl.AbstractAdapterDaoImpl;
import org.poller.adapter.core.domain.Cluster;
import org.springframework.stereotype.Repository;

/**
 * @author somnath
 *
 */
@Repository
public class ClusterDaoImpl extends AbstractAdapterDaoImpl<Cluster, Long> implements ClusterDao {

	protected ClusterDaoImpl() {
		super(Cluster.class);
	}

	public void addCluster(Cluster cluster) {
		saveOrUpdate(cluster);
	}

	public void removeCluster(Cluster cluster) {
		delete(cluster);
	}

	public List<Cluster> listAllClusters() {
		
		return findByHQL("from Cluster");
	}

	public List<Cluster> findClusterByName(String hostName) {
		
		return findByCriteria(Restrictions.like("hostName", hostName, MatchMode.START));
	}

	public Cluster findClusterById(Long Id) {
		return findById(Id);
	}

}
