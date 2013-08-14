package org.poller.adapter.core.service;

import java.util.List;

import org.poller.adapter.core.domain.Channel;

public interface ChannelService {

	public void saveChannel(Channel channel);
	public void updateChannel(Channel channel);
	public void removeChannel(Channel channel);
    public List<Channel> listAllChannels();
    public List<Channel> findChannelsByName(String channelName);
    public Channel findChannelByName(String channelName);
    
}
