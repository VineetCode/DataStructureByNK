package com.nt.test;

import java.util.Comparator;
import java.util.TreeSet;

class MyComparator  implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		return o1.compareTo(o2);
	}
	
}
public class TreeSetDemo {
  public static void main(String[] args) {
	TreeSet<String> ts=new TreeSet<String>(new MyComparator());
	ts.add("12");
	ts.add("62");
	ts.add("124");
	ts.add("312");
	ts.add("512");
	System.out.println(ts);
}
}
