package encapsulation;

public class EncapsulationDemo {
	
	private int age; 
	private String name;
	private String city;
	
	public int getAge(){
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	public String getCity() {
		return city;
	}
	
	
	public void setAge (int newValue) {
		age = newValue ;
	}
	
	public void setName (String newValue) {
		name = newValue;
	}
	
	public void setCity (String newValue) {
		city = newValue;
	}
	
	
	
	
	
	
	public static class EncapsTest{
	
	public static void main(String[] args){
		EncapsulationDemo obj = new EncapsulationDemo();
		obj.setAge(18);
		obj.setName("vicky");
		obj.setCity("mayavaram");
		System.out.println("Name: " + obj.getName());
		System.out.println("City: " + obj.getCity());
		System.out.println("Age: " + obj.getAge());
		
			}
}
}
