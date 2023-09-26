package com.gcu;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="users")

public class UserEntity {
@Id
String id;
@Indexed(unique=true)
String username;
String password;
public String getUsername() {
	// TODO Auto-generated method stub
	return username;
}
public String getPassword() {
	// TODO Auto-generated method stub
	return password;
}
public String getId() {
	// TODO Auto-generated method stub
	return id;
}

}
