package first;

public class Subject{
	private String name;
	private String duration;
	private int level;
	public Subject(String name,String duration,int level) {
		this.name=name;
		this.duration=duration;
		this.level=level;
	}
	public String getName() {
		return name;
	}
	public int getLevel() {
		return level;
	}
	@Override
	public String toString() {
		return "Subject [name=" + name + ", duration=" + duration + ", level=" + level + "]";
	}
	
}
