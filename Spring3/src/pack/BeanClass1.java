package pack;
public class BeanClass1 {
String message;

public void getMessage() {
	System.out.println("Message"+message);
}

public void setMessage(String message) {
	this.message = message;
}
public void init()
{
	System.out.println("inside init");
}
public void destroy()
{
	System.out.println("inside destroy");
}
}
