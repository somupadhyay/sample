package org.spring.mongo.main;

import java.net.UnknownHostException;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import com.mongodb.Mongo;

public class MongoApp {

	/**
	 * @param args
	 */
	
	/*private static final Log log = LogFactory.getLog(MongoApp.class);*/
	public static void main(String[] args) throws UnknownHostException {
		
		MongoOperations mongoOperations = new MongoTemplate(new SimpleMongoDbFactory(new Mongo(), "database"));
		mongoOperations.insert(new Person("somnath",30) );
		
		 System.out.println(mongoOperations.findOne(new Query(new Criteria("name").is("somnath")), Person.class));
		// mongoOperations.dropCollection("person");
	}

}
