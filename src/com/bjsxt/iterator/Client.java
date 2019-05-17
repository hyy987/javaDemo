package com.bjsxt.iterator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Client {

	public static void main(String[] args) {
//		ConcreteMyAggregate am = new ConcreteMyAggregate();
//		am.addObject("aa");
//		am.addObject("bb");
//		am.addObject("cc");
//		MyIterator iterator = am.createIterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.currentItem());
//			iterator.next();
//		}
		List<String> ls = new ArrayList<>();
		ls.add("1");
		ls.add("4");
		ls.add("6");
		ls.add("2");
		ls.add("5");
		Set<String> s = new HashSet<>();
		s.add("1");
		s.add("4");
		s.add("6");
		s.add("2");
		s.add("5");
//		System.out.println(s.size());
		System.out.println(ls);
		System.out.println(s);

	}

}
