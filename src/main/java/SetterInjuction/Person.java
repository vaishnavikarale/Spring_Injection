package SetterInjuction;

public class Person {

	private int id;
	private String name;
	private String panno;
	private Pan p;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPanno() {
		return panno;
	}
	public void setPanno(String panno) {
		this.panno = panno;
	}
	public Pan getP() {
		return p;
	}
	public void setP(Pan p) {
		this.p = p;
	}
}
