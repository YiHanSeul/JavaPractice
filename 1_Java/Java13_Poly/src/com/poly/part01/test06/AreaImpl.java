package com.poly.part01.test06;

//Impl로 끝나는걸 보면 상속받았다 라고 추측가능
public abstract class AreaImpl implements Area{
	private String result;
	
	public void setResult(String result) {
		this.result=result;
	}
	@Override
	public void print() {
		System.out.println(Area.print+result);
	}

	//abstract를 써서 이 클래스에서 make구현안할거야 일반적으로는 해야함.
	//상속받은걸 구현하기 싫으면 class에 abstract를 적어서 구현할걸 토스함
	@Override
	public abstract void make(); 
		

}
