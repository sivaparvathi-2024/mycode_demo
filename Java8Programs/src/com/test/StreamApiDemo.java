package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiDemo {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		System.out.println(list.stream().filter(i->i%2!=0).collect(Collectors.toList()));

	}
}
