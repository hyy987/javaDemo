package com.bjsxt.iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMyAggregate {

	private List<Object> list = new ArrayList<>();

	
	
	public void addObject(Object obj) {
		list.add(obj);
	}
	
	public void remove(Object obj) {
		this.list.remove(obj);
	}

	public List<Object> getList() {
		return list;
	}

	public void setList(List<Object> list) {
		this.list = list;
	}
	
	public MyIterator createIterator() {
		return new ConreteIterator();
	}
	
	/**
	 * 使用内部类定义迭代属性，可以直接使用外部类属性
	 * @author admin
	 *
	 */
	private class ConreteIterator implements MyIterator{

		private int cursor;//定义游标用于记录遍历时的位置
		@Override
		public void first() {
			cursor=0;
		}

		@Override
		public void next() {
			if(cursor<list.size()) {
				cursor++;
			}
			
		}

		@Override
		public boolean hasNext() {
			if(cursor<list.size()) {
				return true;
			}
			return false;
		}

		@Override
		public boolean isFirst() {
			return cursor==0?true:false;
		}

		@Override
		public boolean isLast() {
			return cursor==(list.size()-1)?true:false;
		}

		@Override
		public Object currentItem() {
			return list.get(cursor);
		}
		
	}
}
