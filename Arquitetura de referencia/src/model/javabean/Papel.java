package model.javabean;

public class Papel {
	private int id;
	private String papel;

	public Papel(int id, String papel) {
		super();
		this.id = id;
		this.papel = papel;
	}

	public Papel(String papel) {
		super();
		this.papel = papel;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPapel() {
		return papel;
	}

	public void setPapel(String papel) {
		this.papel = papel;
	}

}
