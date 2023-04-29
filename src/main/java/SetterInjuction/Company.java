package SetterInjuction;

public class Company {
int id;
String name;
int noOfEmp;
double turnover;
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
public int getNoOfEmp() {
	return noOfEmp;
}
public void setNoOfEmp(int noOfEmp) {
	this.noOfEmp = noOfEmp;
}
public double getTurnover() {
	return turnover;
}
public void setTurnover(double turnover) {
	this.turnover = turnover;
}
}
