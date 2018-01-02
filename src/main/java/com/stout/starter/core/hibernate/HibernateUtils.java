package com.stout.starter.core.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.stout.starter.model.Privilege;
import com.stout.starter.model.Role;
import com.stout.starter.model.RolePrivilege;
import com.stout.starter.model.User;
import com.stout.starter.model.UserPreferences;


public class HibernateUtils
{
	
	private static SessionFactory sessionFactory; 
	
	 public static SessionFactory getSessionFactory() {
	        if (sessionFactory == null) {
	            // loads configuration and mappings
	            Configuration configuration = new Configuration().configure();
	            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
	            MetadataSources sources = new MetadataSources(serviceRegistry); 
	            
	            /**
	             * Add persistent entities
	             */
	            sources.addAnnotatedClass(User.class);
	            sources.addAnnotatedClass(Privilege.class); 
	            sources.addAnnotatedClass(Role.class); 
	            sources.addAnnotatedClass(RolePrivilege.class); 
	            sources.addAnnotatedClass(UserPreferences.class); 
	            
	            Metadata metaData = sources.getMetadataBuilder().build();
	            
	            // builds a session factory from the service registry (hibernate.cfg.xml) & metadata of added annotated classes 
	            sessionFactory = metaData.getSessionFactoryBuilder().build();
	        }
	         
	        return sessionFactory;
	    }
	
	 public static void shutdown() {
	      if(sessionFactory!=null)
	    	  sessionFactory.close();
	 }

	
	
}
