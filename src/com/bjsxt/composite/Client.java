package com.bjsxt.composite;

public class Client {

	public static void main(String[] args) {
		AbstractFile f2,f3,f4,f5;
		Floder f1 = new Floder("我的收藏");
		f2 = new ImageFile("帅的一批.jpg");
		f3= new TextFile("hello.txt");
		f1.add(f2);
		f1.add(f3);
//		f2.killVirus();
//		f1.killVirus();
		
		Floder f11 = new Floder("电影");
		f4=new VideoFile("复仇者联盟4");
		f5=new VideoFile("喜剧之王");
		f11.add(f4);
		f11.add(f5);
		f1.add(f11);
		f1.killVirus();
	}
}
