/**
 * 
 */
package org.poller.adapter.core.service.impl;

import java.util.List;
import java.util.Set;

import org.poller.adapter.core.channels.dao.ChannelDao;
import org.poller.adapter.core.channels.dao.ClusterDao;
import org.poller.adapter.core.domain.Channel;
import org.poller.adapter.core.domain.Cluster;
import org.poller.adapter.core.service.ChannelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author somnath
 *
 */

@Service("channelService")
@Transactional(readOnly = true)
public class ChannelServiceImpl implements ChannelService {

	@Autowired
	private ChannelDao channelDao;
	
	@Autowired
	private ClusterDao clusterDao;
	/* (non-Javadoc)
	 * @see org.poller.adapter.core.service.ChannelService#saveChannel(org.poller.adapter.core.domain.Channel)
	 */
	@Transactional(readOnly=false)
	public void saveChannel(Channel channel) {
		if(channel.getCluster()!=null && channel.getCluster().size()>0){
			Set<Cluster> clusters = channel.getCluster();
			for(Cluster cluster:clusters)
			clusterDao.addCluster(cluster);
		}
		
		channelDao.saveChannel(channel);
	}

	/* (non-Javadoc)
	 * @see org.poller.adapter.core.service.ChannelService#removeChannel(org.poller.adapter.core.domain.Channel)
	 */
	@Transactional(readOnly=false)
	public void removeChannel(Channel channel) {
		channelDao.removeChannel(channel);
	}

	/* (non-Javadoc)
	 * @see org.poller.adapter.core.service.ChannelService#listAllChannels()
	 */
	public List<Channel> listAllChannels() {

		return channelDao.listAllChannels();
	}

	/* (non-Javadoc)
	 * @see org.poller.adapter.core.service.ChannelService#findChannelsByName(java.lang.String)
	 */
	public List<Channel> findChannelsByName(String channelName) {
		return channelDao.findChannelsByName(channelName);
	}

	/* (non-Javadoc)
	 * @see org.poller.adapter.core.service.ChannelService#findChannelByName(java.lang.String)
	 */
	public Channel findChannelByName(String channelName) {

		return channelDao.findChannelByName(channelName);
	}

	public void updateChannel(Channel channel) {
		channelDao.saveOrUpdate(channel);
	}


}
