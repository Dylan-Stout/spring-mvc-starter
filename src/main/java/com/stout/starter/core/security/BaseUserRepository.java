package com.stout.starter.core.security;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;
import org.springframework.security.core.GrantedAuthority;



/**
 * Singleton class with Map of users and their details in the base database to 
 * use when assigning roles and permissions. 
 * 
 * Author: dystout
 * Created : May 25, 2017
 *
 */
public class BaseUserRepository
{
	
	private static BaseUserRepository instance = null; 
	
	private Map<String, UserDetailsImpl> userRepository = new HashMap<String, UserDetailsImpl>();
	
	/**
	* Log4j logger: WrxjUserRepository
	*/
	private static final Logger logger = Logger.getLogger(BaseUserRepository.class);

	/**
	 * Available Application-level roles. This will define the access control for the user 
	 * within the web application context. These authorities will be mapped to the WRXJ roles 
	 * to allow spring security to grant/restrict access to areas of applicaiton based on 
	 * user's role level. 
	 */
	private final GrantedAuthority authorityMaster = new GrantedAuthorityImpl("ROLE_MASTER");
    private final GrantedAuthority authorityAdmin = new GrantedAuthorityImpl("ROLE_ADMIN");
    private final GrantedAuthority authorityUser = new GrantedAuthorityImpl("ROLE_USER");
    private final GrantedAuthority authorityReadOnly = new GrantedAuthorityImpl("ROLE_READONLY");
	
    /**
     * Protected for use with singleton instantiation. 
     */
	protected BaseUserRepository(){
	/*	 WrxjConnection.getInstance();
	        StandardUserServer sUserServer = Factory.create(StandardUserServer.class);
	        List<String> usernames = null;
			try
			{
				usernames = sUserServer.getEmployeeNameList();
			} catch (DBException e)
			{
				logger.error("Error retrieving employee name list: " + e.getMessage());
				e.printStackTrace();
			}
	        for(String user : usernames)
	        {
	        
	        	EmployeeData userData = null;
				try
				{
					userData = sUserServer.getEmployeeData(user);
				} catch (DBException e)
				{
					logger.error("Error retrieving employee data: " + e.getMessage());
					e.printStackTrace();
				}
	        	String role = userData.getRole();  
	        	String displayName = userData.getUserName(); 
	        	String pass = userData.getPassword();
	        	Set<GrantedAuthority> authorities = new HashSet<GrantedAuthority>(); 

	        	switch (role) // Map WRXJ role to a spring security role. 
					{
					case "Administrator":
						authorities.add(authorityAdmin);
						break;
					case "SKDaifuku":
						authorities.add(authorityUser);
						break;
					case "ReadOnly":
						authorities.add(authorityReadOnly); 
						break;
					case "Master":
						authorities.add(authorityMaster);
						break;
					default:
						authorities.add(authorityReadOnly);
					}
	        	UserDetailsImpl userDetails = new UserDetailsImpl(user, displayName, role, null, authorities);
	        	userRepository.put(user, userDetails);
	        }*/
	}

	/**
	 * Singleton instance grabber. Will grab the only existing instance of this user repo 
	 * in this thread. 
	 * 
	 * @return WrxjUserRepository - instance class
	 */
	public static BaseUserRepository getInstance()
	{
		//if(instance==null)
			instance = new BaseUserRepository(); 
		return instance;
	}

	/**
	 * Get the user details for wrxj employee database table. 
	 * @return
	 */
	public Map<String, UserDetailsImpl> getUserRepository()
	{
		return userRepository;
	}
	
	
	
	


    
    
}
