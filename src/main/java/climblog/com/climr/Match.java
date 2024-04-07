package climblog.com.climr;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Match{

	@JsonProperty("fav_animal")
	private String favAnimal;

	@JsonProperty("rating")
	private int rating;

	@JsonProperty("phone_number")
	private String phoneNumber;

	@JsonProperty("id")
	private int id;

	@JsonProperty("type")
	private String type;

	@JsonProperty("email")
	private String email;

	@JsonProperty("username")
	private String username;

	public void setFavAnimal(String favAnimal){
		this.favAnimal = favAnimal;
	}

	public String getFavAnimal(){
		return favAnimal;
	}

	public void setRating(int rating){
		this.rating = rating;
	}

	public int getRating(){
		return rating;
	}

	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneNumber(){
		return phoneNumber;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return email;
	}

	public void setUsername(String username){
		this.username = username;
	}

	public String getUsername(){
		return username;
	}

	@Override
 	public String toString(){
		return 
			"Match{" + 
			"fav_animal = '" + favAnimal + '\'' + 
			",rating = '" + rating + '\'' + 
			",phone_number = '" + phoneNumber + '\'' + 
			",id = '" + id + '\'' + 
			",type = '" + type + '\'' + 
			",email = '" + email + '\'' + 
			",username = '" + username + '\'' + 
			"}";
		}
}