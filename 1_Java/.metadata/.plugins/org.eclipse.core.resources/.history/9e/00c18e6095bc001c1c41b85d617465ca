package singleton;

public class SomgletonMain {

	public static void main(String[] args) {
		//[1]
		//Singleton singleton =new Singleton();
		//에러, 생성자가 private
		
		//[2]
		//Singleton singleton1=Singleton.getInstance();
		//Singleton singleton2=Singleton.getInstance();
		//System.out.println(singleton1==singleton2);
		
		
		//[3]
		//첫번째 실행할때 one이 null이기 때문에  one= new Singleton()코드실행
		Singleton singleton1=Singleton.getInstance(); 
		//두번째 실행할때 one이  null이 아니기 때문에 return one이라서 true가 나옴
		Singleton singleton2=Singleton.getInstance();
		System.out.println(singleton1==singleton2);
	}

}
