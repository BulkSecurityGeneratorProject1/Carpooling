package covoiturage;

public class Driver {
	
	
	private String name;
	private int age;
	private String experience; //debutant experimenté king ...
	
	
	public Driver(String name, int age, String experience) {
		super();
		this.name = name;
		this.age = age;
		this.experience = experience;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	
	
	

}
