package Main;

public class Player {
	private String name;
	private int goal;
	private int age;
	private String club;
	private String country;
	public Player(String name, int goal, int age, String club, String country) {
		this.name = name;
		this.goal = goal;
		this.age = age;
		this.club = club;
		this.country = country;
	}
	
	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getGoal() {
		return goal;
	}



	public void setGoal(int goal) {
		this.goal = goal;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getClub() {
		return club;
	}



	public void setClub(String club) {
		this.club = club;
	}



	public String getCountry() {
		return country;
	}



	public void setCountry(String country) {
		this.country = country;
	}



	@Override
	public String toString() {
		return "Player [name=" + name + ", goal=" + goal + ", age=" + age + ", club=" + club + ", country=" + country
				+ "]";
	}
	
}
