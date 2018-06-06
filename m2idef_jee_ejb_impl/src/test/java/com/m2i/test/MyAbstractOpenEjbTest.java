package com.m2i.test;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;

import org.junit.BeforeClass;

public abstract class MyAbstractOpenEjbTest {
	
	protected static Context context; // jndi context for open-ejb

	private static final String TEST_OPENEJB_DS="java:jboss/datasources/FlightDSh2";
	
	public static void initializeH2Properties(Properties properties) throws Exception {
    	properties.put(TEST_OPENEJB_DS+".JdbcDriver", "org.h2.Driver");
	    properties
	        .put(TEST_OPENEJB_DS+".JdbcUrl", "jdbc:h2:~/flight_db");
	    properties.put(TEST_OPENEJB_DS+".username", "sa");
	    properties.put(TEST_OPENEJB_DS+".password", "sa");//or "root" or "formation" or ...
	    
	    properties.put("myPersistenceUnitName.hibernate.dialect", "org.hibernate.dialect.H2Dialect");
	}
	
    public static void initializeMySqlProperties(Properties properties) throws Exception {
    	properties.put(TEST_OPENEJB_DS+".JdbcDriver", "com.mysql.jdbc.Driver");
	    properties
	        .put(TEST_OPENEJB_DS+".JdbcUrl", "jdbc:mysql://localhost/...._db");
	    properties.put(TEST_OPENEJB_DS+".username", "root");
	    properties.put(TEST_OPENEJB_DS+".password", "formation");//"root" or "formation" or ...
	    
	    properties.put("myPersistenceUnitName.hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
	}
	
	@BeforeClass
	public static void initializeEmbeddedContainer() throws Exception {
	    Properties properties = new Properties();
	    properties.setProperty(Context.INITIAL_CONTEXT_FACTORY,
	        "org.apache.openejb.client.LocalInitialContextFactory");

	    properties.put(TEST_OPENEJB_DS, "new://Resource?type=DataSource");
	    
	    //initializeMySqlProperties(properties);
	    initializeH2Properties(properties);
	   
	   // properties.put("javax.persistence.provider","org.hibernate.ejb.HibernatePersistence"); //Hb4
	   properties.put("javax.persistence.provider","org.hibernate.jpa.HibernatePersistenceProvider");//Hb5
	    
	    properties.put("openejb.embedded.initialcontext.close", "destroy");

	    context = new InitialContext(properties);
	  }
	
	  public abstract void initService();


}
