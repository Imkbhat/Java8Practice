package com.bob.hms.admin.common.pract.java8;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Java8ForEachLoop {

	public static void main(String[] args) {
		List<Integer> intList = new ArrayList();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		intList.add(5);
		
		//forEach takes Consumer Object as Argument and Have an Unimplemented
		//method called accept, method accept will take one by one integer
		// here used integer List
		intList.forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				System.out.println("For every element in forEach "+t);
			}
		});
		
		List<String> strList = new ArrayList();
		strList.add("K");
		strList.add("I");
		strList.add("R");
		strList.add("A");
		strList.add("N");
		
		strList.forEach(new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println("Each element inside strList "+t);
			}
		});
	}
}