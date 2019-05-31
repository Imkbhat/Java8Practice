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

//Output
//As Parallel stream will not be in Order.

//Parallel High Stream Numbers91
//Parallel High Stream Numbers93
//Parallel High Stream Numbers94
//Parallel High Stream Numbers95
//Parallel High Stream Numbers96
//Parallel High Stream Numbers97
//Parallel High Stream Numbers98
//Parallel High Stream Numbers99
//Parallel High Stream Numbers92
//Serial High Stream Numbers91
//Serial High Stream Numbers92
//Serial High Stream Numbers93
//Serial High Stream Numbers94
//Serial High Stream Numbers95
//Serial High Stream Numbers96
//Serial High Stream Numbers97
//Serial High Stream Numbers98
//Serial High Stream Numbers99
