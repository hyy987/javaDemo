package com.bjsxt.composite;

import java.util.ArrayList;
import java.util.List;

//抽象构建
public interface AbstractFile {

	void killVirus();//杀毒
}

class ImageFile implements AbstractFile{

	private String name;
	
	public ImageFile(String name) {
		super();
		this.name = name;
	}

	@Override
	public void killVirus() {
		System.out.println("图像文件\""+name+"\",进行查杀");
	}
	
}
class VideoFile implements AbstractFile{
	
	private String name;
	
	public VideoFile(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public void killVirus() {
		System.out.println("电影文件"+name+",进行查杀");
	}
	
}
class TextFile implements AbstractFile{
	
	private String name;
	
	public TextFile(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public void killVirus() {
		System.out.println("文本文件"+name+",进行查杀");
	}
	
}

class Floder implements AbstractFile{

	private String name;
	private List<AbstractFile> files = new ArrayList<>();
	
	
	public Floder(String name) {
		super();
		this.name = name;
	}


	@Override
	public void killVirus() {
		System.out.println("对文件夹\""+name+"\",进行杀毒");
		for (AbstractFile f : files) {
			f.killVirus();
		}
		
	}
	
	//新增子节点
	public void add(AbstractFile file) {
		files.add(file);
	}
	
	//删除子节点
	public void remove(AbstractFile file) {
		files.remove(file);
	}
	
	public AbstractFile getChild(int index) {
		return files.get(index);
	}
	
}
