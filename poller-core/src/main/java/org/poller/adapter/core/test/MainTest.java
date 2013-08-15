/**
 * 
 */
package org.poller.adapter.core.test;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.poller.adapter.core.domain.Channel;
import org.poller.adapter.core.domain.Cluster;
import org.poller.adapter.core.service.ChannelService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author somnath
 *
 */
public class MainTest {


	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:META-INF/spring/applicationContext.xml");
		ChannelService channelService = ctx.getBean("channelService",ChannelService.class);
		
		Channel channel = new Channel();
		channel.setChannelName("TestCluster");
		channel.setCreatedDate(new Date());
		channel.setDescription("A Test Channel");
		Map<String, String> properties = new HashMap<String, String>();
		properties.put("user.name", "somnath");
		properties.put("user.pass", "somnath");
		properties.put("user.age", "29");
		channel.setProperties(properties );
		
		Set<Cluster> clusters = new HashSet<Cluster>(0);
		Cluster cluster = new Cluster();
		cluster.setHostName("localhost");
		cluster.setStatus("TRUE");
		cluster.setSuspend("false");
		clusters.add(cluster);
		channel.setCluster(clusters);
		
		channelService.saveChannel(channel );
	}

}
