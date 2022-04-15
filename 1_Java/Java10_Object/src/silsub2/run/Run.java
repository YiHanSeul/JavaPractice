package silsub2.run;

import silsub2.model.vo.Product;

public class Run {

	public static void main(String[] args) {
		Product pro=new Product();
		pro.setpName("데이브레이크");
		pro.setPrice(100000);
		pro.setBrand("나이키");
		
		System.out.println(pro.information());
	}

}
