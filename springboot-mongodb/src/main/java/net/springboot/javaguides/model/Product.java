package net.springboot.javaguides.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document (collection = "Users")
public class Product {
	
	@Id
	private String id;
	
	@NotBlank
    @Size(max=100)
    @Indexed(unique=true)
	private String first_name;
	private String last_name;
	private String email;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstName() {
		return first_name;
	}
	public void setFirstName(String first_name) {
		this.first_name = first_name;
	}
  public String getLastName() {
		return last_name;
	}
	public void setLastName(String last_Name) {
		this.last_name = last_Name;
	}
  public String getEmailId() {
		return email;
	}
	public void setEmailId(String emailId) {
		this.email = emailId;
	}
}
