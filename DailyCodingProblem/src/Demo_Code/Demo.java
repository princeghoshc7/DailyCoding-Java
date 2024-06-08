package Demo_Code;


class Calculator{
	
	public int add(int n1,int n2) {
		
		return n1+n2;
	}
	
}

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator obj=new Calculator();
		int r1=obj.add(4, 5);
		System.out.println(r1);
		

	}

}
