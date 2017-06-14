import java.io.Serializable;

public class Mensch implements Serializable {
	
	
	private static final long serialVersionUID = 20170806L;
	private String name;
	private double groesse;
	private int alter;
	
	
	public Mensch(String name, double groesse, int alter) {
		super();
		this.name = name;
		this.groesse = groesse;
		this.alter = alter;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getGroesse() {
		return groesse;
	}
	public void setGroesse(double groesse) {
		this.groesse = groesse;
	}
	public int getAlter() {
		return alter;
	}
	public void setAlter(int alter) {
		this.alter = alter;
	}
	@Override
	public String toString() {
		return String.format("%s ist %d Jahre alt und %.2f m",name, alter, groesse);
	}
	
	
	
	
	
	

}
