package SetterInjuction;

public class Pen1 {
int id;
String name;
double price;
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
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public void penDetails()
{
	System.out.println("id:"+id);
	System.out.println("name"+name);
	System.out.println("age"+price);}
}
