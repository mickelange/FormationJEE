package org.exemple.entities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserManager {
	
	public static final UserManager instance = new UserManager();
	public static final UserManager getInstance(){
		
		return UserManager.instance;
		
	}
	
	private  Map<Integer,User> cache = new HashMap<>();
	private UserManager(){
		
		User u1 = new User();
		u1.setId(1);
		u1.setNom("Creusot");
		u1.setPrenom("Michel");
		u1.setAdresse(" Rue du Chêne");
		
		User u2 = new User();
		u2.setId(2);
		u2.setNom("Dujardin");
		u2.setPrenom("Adam");
		u2.setAdresse("Rue du Frêne");
		
		User u3 = new User();
		u3.setId(3);
		u3.setNom("Rive");
		u3.setPrenom("Yve");
		u3.setAdresse("Rue du Frêne");
		
		
		this.add(u1);
		this.add(u2);
		this.add(u3);
	}
	
	public void add(User user){
		
		this.cache.put(user.getId(), user);
	}
	
	
public void remove(User user){
		
	this.cache.remove(user.getId());
	}


public void update(User user){
	
	this.cache.replace(user.getId(), user);
}

public User getById( int id){
	
	return this.cache.get(id);
	
}


public List<User> getAll(){
	
	final List<User> result = new ArrayList<>(this.cache.values());
	return result;
	
}
	
	
	
	
	

}
