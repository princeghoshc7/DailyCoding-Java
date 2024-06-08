package Demo_Code;


class Adult{
	
	private String name;
	private int age;
	
	Adult(String name, int age){
		setAge(age);
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	public void SetName(String name) {
		this.name=name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(isAgeOk(age)) {
			this.age=age;
		}else {
			this.age=-1;
		}
	}
	
	private boolean isAgeOk(int age) {
		return age>=18?true:false;
	}
}

public class BasicEncapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Adult jhon=new Adult("jhon",20);
		System.out.println(jhon.getName()+ " " + jhon.getAge());
		jhon.setAge(-99);
		System.out.println(jhon.getName()+" " +jhon.getAge());

	}

}
