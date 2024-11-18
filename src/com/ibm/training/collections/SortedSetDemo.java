package com.ibm.training.collections;

import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {

	public static void main(String[] args) {
		TreeSet<Integer> nums = new TreeSet<>(List.of(10, 42, 17, 34, 71, 24));

		Set<Integer> numsGT20 = nums.tailSet(20);

		System.out.println(numsGT20);

		Set<Integer> numsLT20 = nums.headSet(20);

		System.out.println(numsLT20);
		
		Set<Integer> numsBW20and40 = nums.subSet(20,40);
		
		System.out.println(numsBW20and40);
		
		System.out.println("Whole Set\n"+nums);
		
		System.out.println("Whole Set in reverse \n"+nums.descendingSet());

	}

}
