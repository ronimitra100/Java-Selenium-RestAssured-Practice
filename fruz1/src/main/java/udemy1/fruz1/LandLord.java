package udemy1.fruz1;

public class LandLord {
	
	private String firstName;
	private String lastName;
	private boolean trusted;
	
	public LandLord(){};
	
	public LandLord(String firstName, String lastName){
		this.firstName = firstName ;
		this.lastName = lastName;
	}
	
	
	public LandLord(String firstName, String lastName, boolean trusted){
		this.firstName = firstName ;
		this.lastName = lastName;
		this.trusted = trusted;
	}
	
	public String getFirstName(){
		return firstName;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public boolean getTrusted(){
		return trusted;
	}
	
	//
	public void setFirstName(){
		this.firstName = firstName;
	}
	
	public void setLastName(){
		this.lastName = lastName;
	}
	
	public void setTrusted(){
		this.trusted = trusted;
	}
	

}
