/**
 * 
 */
package org.poller.adapter.core.channels.dao;

import java.util.List;

import org.poller.adapter.core.dao.AbstractAdapterDao;
import org.poller.adapter.core.domain.Cluster;

/**
 * @author somnath
 *
 */
public interface ClusterDao extends AbstractAdapterDao<Cluster, Long> {
 
	public Cluster findClusterById(Long Id);
	public void addCluster(Cluster cluster);
	public void removeCluster(Cluster cluster);
    public List<Cluster> listAllClusters();
    public List<Cluster> findClusterByName(String hostName);
}
