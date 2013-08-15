/**
 * 
 */
package org.poller.adapter.core.channels.dao;

import java.util.List;

import org.poller.adapter.core.dao.AbstractAdapterDao;
import org.poller.adapter.core.domain.Channel;

/**
 * @author somnath
 *
 */
public interface ChannelDao extends AbstractAdapterDao<Channel, Long>{
	
	public void saveChannel(Channel channel);
	public void removeChannel(Channel channel);
    public List<Channel> listAllChannels();
    public List<Channel> findChannelsByName(String channelName);
    public Channel findChannelByName(String channelName);
	
}
