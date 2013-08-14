/**
 * 
 */
package org.poller.adapter.core.channels.dao.impl;

import java.util.List;

import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.poller.adapter.core.channels.dao.ChannelDao;
import org.poller.adapter.core.dao.impl.AbstractAdapterDaoImpl;
import org.poller.adapter.core.domain.Channel;
import org.springframework.stereotype.Repository;

/**
 * @author somnath
 *
 */
@Repository
public class ChannelDaoImpl extends AbstractAdapterDaoImpl<Channel, Long> implements ChannelDao {

   protected ChannelDaoImpl() {
		super(Channel.class);
	}

	public List<Channel> listAllChannels() {
		return findByHQL("from Channel");
	}

	public List<Channel> findChannelsByName(String channelName) {
		return findByCriteria(Restrictions.like("channelName", channelName, MatchMode.START));
	}

	public Channel findChannelByName(String channelName) {
		List<Channel> channels = findByCriteria(Restrictions.eq("channelName", channelName));
		return channels.get(0);
	}

	public void saveChannel(Channel channel) {
		saveOrUpdate(channel);
	}

	public void removeChannel(Channel channel) {
		delete(channel);
	}

	
}
