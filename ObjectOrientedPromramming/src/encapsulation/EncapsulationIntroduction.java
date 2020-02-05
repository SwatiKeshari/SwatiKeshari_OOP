package encapsulation;

public class EncapsulationIntroduction {

	
public static void main(String[] args) {
		
		Student obj = new Student();
		
		obj.setAge(45);
		obj.setName("Tom");
		
		System.out.println(obj.getAge());
		System.out.println(obj.getName());
	}


}
