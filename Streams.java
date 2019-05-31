package com.bob.hms.admin.common.pract.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Streams {

	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<>();
		for (int i=0; i<100; i++) {
			intList.add(i);
		}
		
		//sequential Stream
		Stream<Integer> intSequentialStream = intList.stream();
		
		//Parallel Stream
		Stream<Integer> intParallelStream = intList.parallelStream();
		
		//HighNums in ParallelStream
		Stream<Integer> highNumsParallel = 
				intParallelStream.filter(p -> p > 90);
		
		/*
		 * highNumsParallel.forEach(new Consumer<Integer>() {
		 * 
		 * @Override public void accept(Integer t) {
		 * System.out.println("Parallel High Stream Numbers " + t); } });
		 */
			highNumsParallel.forEach(p -> System.out.println("Parallel High Stream Numbers" + p));
		
		//HighNums in Sequential  Stream
		
		Stream<Integer> highNumsSequentialStreams = 
				intSequentialStream.filter(p -> p > 90);
		
		/*
		 * intSequentialStream.forEach(new Consumer<Integer>() {
		 * 
		 * @Override public void accept(Integer t) {
		 * System.out.println("Serial High Stream Numbers " + t); } });
		 */
		
		highNumsSequentialStreams.forEach(p -> System.out.println("Serial High Stream Numbers" +p));
	}

}
