package com.test02;

public class MessageBeanKo implements MessageBean{

	@Override
	public void sayHello(String name) {
		System.out.printf("�ȳ��ϼ���, %s ��\n",name);
	}

}
