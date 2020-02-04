package pack;

public class Address {
int doorno;
String streetname;
public int getDoorno() {
	return doorno;
}
public void setDoorno(int doorno) {
	this.doorno = doorno;
}
public String getStreetname() {
	return streetname;
}
public void setStreetname(String streetname) {
	this.streetname = streetname;
}
public Address(int doorno, String streetname) {
	//super();
	this.doorno = doorno;
	this.streetname = streetname;
}
@Override
public String toString() {
	return "Address [doorno=" + doorno + ", streetname=" + streetname + "]";
}


}
