package com.adeelaslam;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Solution_July1 {

	public static void main(String[] args) {
		int[] nums = { 3, 3 };
		int target = 6;
		int[] result = new int[2];
		result = twoSum(nums, target);
		System.out.println("Pair of numbers is (" + result[0] + ", " + result[1] + ")");
		System.out.println("Roman to int" + romanToInt("III"));
		System.out.println("Roman to int" + romanToInt("LVIII"));
		System.out.println("Roman to int" + romanToInt("MCMXCIV"));

		int[] nums1 = { 1, 3, 2, 1 };
		System.out.println("Concatenation result is :");
		for (int i : getConcatenation(nums1)) {
			System.out.print("" + i + " ");
		}
		int[] nums2 = { 1, 1, 2, 2 };
		int n = 2;
		System.out.println("Shuffle result is :");
		for (int i : shuffle(nums2, n)) {
			System.out.print("" + i + " ");
		}

		String[] sentences = { "alice and bob love leetcode", "i think so too", "this is great thanks very much" };
		System.out.println("Maximum number of words");

		// Create Target array
		int[] nums3 = { 0, 1, 2, 3, 4 };
		int[] index = { 0, 1, 2, 2, 1 };
		System.out.println("Create Target array result is :");
		for (int i : createTargetArray(nums3, index)) {
			System.out.print("" + i + " ");
		}

		Solution_July1 objSolution = new Solution_July1();
		int[] nums4 = { 1 };
		System.out.println("Array result from Left and Right sum is : ");
		for (int i : objSolution.leftRightDifference(nums4)) {
			System.out.print("" + i + " ");
		}

		int[][] rectangles = { { 5, 8 }, { 3, 9 }, { 5, 12 }, { 16, 5 } };
		System.out.println("Count of good triangles is " + objSolution.countGoodRectangles(rectangles));

		int[] nums5 = { 12, 345, 2, 6, 7896 };
		System.out.println("Result of find numbers is " + objSolution.findNumbers(nums5));

		int[] nums6 = { 17, 18, 5, 4, 6, 1 };
		System.out.println("replace Elements result is " + Arrays.toString(objSolution.replaceElements(nums6)));

		int[] arr = { 1, 1, 2, 2, 3, 3, 3, 3 };

		System.out.println("Special integer is " + objSolution.findSpecialInteger(arr));

		System.out.println("Category of the box is " + objSolution.categorizeBox(2909, 3968, 3272, 727));
		
		System.out.println("6 is ugly or not? is " + objSolution.isUgly(6));
		System.out.println("1 is ugly or not? is " + objSolution.isUgly(1));
		System.out.println("14 is ugly or not? is " + objSolution.isUgly(14));
		System.out.println("18 is ugly or not? is " + objSolution.isUgly(18));
		System.out.println("75 is ugly or not? is " + objSolution.isUgly(75));
		System.out.println("36 is ugly or not? is " + objSolution.isUgly(36));

		System.out.println("234 subtract product and sum is " + objSolution.subtractProductAndSum(234));

		System.out.println("XOR operation is  " + objSolution.xorOperation(5, 0));

		String[] word1 = { "a", "cb" };
		String[] word2 = { "ab", "c" };

		System.out.println("Strings are not equal" + objSolution.arrayStringsAreEqual(word1, word2));

		String s = "K1:L2";
		List<String> list = objSolution.cellsInRange(s);
		System.out.println("Cells in range" + objSolution.cellsInRange(s).toString());
//        list.stream().forEach(System.out::print);

		System.out.println("Convert to title (1, A) " + objSolution.convertToTitle(1));
		System.out.println("Convert to title (28, AB) " + objSolution.convertToTitle(28));
		System.out.println("Convert to title (701, ZY) " + objSolution.convertToTitle(701));
		System.out.println("Convert to title (52, AZ) " + objSolution.convertToTitle(52));
		System.out.println("Convert to title (27, AA) " + objSolution.convertToTitle(27));

		System.out.println("For () is valid using stacks " + objSolution.isValid("()"));
		System.out.println("For ()[]{} is valid using stacks " + objSolution.isValid("()[]{}"));

		System.out.println("For (] is valid using stacks " + objSolution.isValid("(]"));

		System.out.println("Count Digits 7 input  " + objSolution.countDigits(7));
		System.out.println("Count Digits 121 input  " + objSolution.countDigits(121));
		System.out.println("Count Digits 1248 input  " + objSolution.countDigits(1248));

		long start1 = System.nanoTime();
		long start2 = System.currentTimeMillis();
		System.out.println("Check perfect number 28 input  " + objSolution.checkPerfectNumber(28));
		System.out.println("Check perfect number 7 input  " + objSolution.checkPerfectNumber(7));
		System.out.println("Check perfect number 99999993 input  " + objSolution.checkPerfectNumber(99999993));
		long end1 = System.nanoTime();
		long end2 = System.currentTimeMillis();
		System.out.println("Elapsed Time in nano seconds: " + (end1 - start1));
		System.out.println("Elapsed Time in milli seconds: " + (end2 - start2));

		long start3 = System.currentTimeMillis();
		System.out.println("6 is ugly or not? is " + objSolution.isUgly(6));
		System.out.println("1 is ugly or not? is " + objSolution.isUgly(1));
		System.out.println("14 is ugly or not? is " + objSolution.isUgly(14));
		System.out.println("18 is ugly or not? is " + objSolution.isUgly(18));
		System.out.println("75 is ugly or not? is " + objSolution.isUgly(75));
		System.out.println("36 is ugly or not? is " + objSolution.isUgly(36));
		long end3 = System.currentTimeMillis();
		System.out.println("Elapsed Time in milli seconds: " + (end3 - start3));
		
		int[] arr3 = {-5, 1, 5, 0, -7};
		int[] arr4 = {-4, -3, -2, -1, 4, 3, 2};
		
		System.out.println("Largest altitude gain for the motorcyclist is " + objSolution.largestAltitude(arr3));
		System.out.println("Largest altitude gain for the motorcyclist is " + objSolution.largestAltitude(arr4));

		int[][] mat = {{1,2,3}, {4,5,6}, {7,8,9}};
		
		System.out.println("Matrix diagnonal sum is  " + objSolution.diagonalSum(mat));
		int[][] mat1 = {{1,1,1,1}, {1,1,1,1}, {1,1,1,1}, {1,1,1,1}};
		System.out.println("Matrix diagnonal sum is  " + objSolution.diagonalSum(mat1));
		int[][] mat2 = {{5}};
		System.out.println("Matrix diagnonal sum is  " + objSolution.diagonalSum(mat2));
		
		System.out.println("Truncation results in " + objSolution.truncateSentence("Hello how are you Contestant", 4));
		System.out.println("Truncation results in " + objSolution.truncateSentence("What is the solution to this problem", 4));
		System.out.println("Truncation results in " + objSolution.truncateSentence("chopper is not a tanuki", 5));
		
		int[] indices = {4,5,6,7,0,1,2,3};
		System.out.println("Restored string is " + objSolution.restoreString("codeleet", indices));
		int[] indices1 = {0, 1, 2};
		System.out.println("Restored string is " + objSolution.restoreString("abc", indices1));
		
		System.out.println("Jewels and Stones " + objSolution.numJewelsInStones("aA", "aAAbbbb"));
		System.out.println("Jewels and Stones " + objSolution.numJewelsInStones("z", "ZZ"));
		
		System.out.println("Merge Alternatively debugging on ab, pqrs " + objSolution.mergeAlternately("ab", "pqrs"));
		
		System.out.println("Stack maximum depth is " + objSolution.maxDepth(""));
		System.out.println("Stack maximum depth is " + objSolution.maxDepth("()()"));
		System.out.println("Stack maximum depth is " + objSolution.maxDepth("()(()())"));
		System.out.println("Stack maximum depth is " + objSolution.maxDepth("(1+(2*3)+((8)/4))+1"));
		System.out.println("Stack maximum depth is " + objSolution.maxDepth("(1)+((2))+(((3)))"));
		
		int[] nums7 = {1, 2, 3, 0, 0, 0};
		int[] nums8 = {2, 5, 6};
		objSolution.merge(nums7, 3, nums8, 3);
		System.out.println("Debugging the complex merge " + Arrays.toString(nums7));

		int[] nums9 = {1};
		int[] nums10 = {};
		objSolution.merge(nums9, 1, nums10, 0);
		System.out.println("Debugging the complex merge " + Arrays.toString(nums9));
		int[] nums11 = {0};
		int[] nums12 = {1};
		objSolution.merge(nums11, 0, nums12, 1);
		System.out.println("Debugging the complex merge " + Arrays.toString(nums11));
		int[] nums13 = {4, 5, 6, 0, 0, 0};
		int[] nums14 = {1, 2, 3};
		objSolution.merge(nums13, 3, nums14, 3);
		System.out.println("Debugging the complex merge " + Arrays.toString(nums13));

		MyLinkedList objLinkedList = new MyLinkedList();
		objLinkedList.traverse();
		System.out.println("Adding 1 at head");
		objLinkedList.addAtHead(1);
		objLinkedList.traverse();
		System.out.println("Adding 3 at tail");
		objLinkedList.addAtTail(3);
		objLinkedList.traverse();
		System.out.println("Insert value 2 at index 1");
		objLinkedList.addAtIndex(1, 2);
		objLinkedList.traverse();
		System.out.println("Item at index 1 is " + objLinkedList.get(1));
		System.out.println("Deleting item at index 1");
		objLinkedList.deleteAtIndex(1);
		objLinkedList.traverse();
		
		MyLinkedList testcase2LinkedList = new MyLinkedList();
		testcase2LinkedList.traverse();
		testcase2LinkedList.addAtHead(1);
		testcase2LinkedList.traverse();
		testcase2LinkedList.deleteAtIndex(0);
		testcase2LinkedList.traverse();

		System.out.println("Executing Linked List Test case 3");
		MyLinkedList testcase3LinkedList = new MyLinkedList();
		testcase3LinkedList.traverse();
		testcase3LinkedList.addAtHead(1);
		testcase3LinkedList.traverse();
		testcase3LinkedList.addAtTail(3);
		testcase3LinkedList.traverse();
		testcase3LinkedList.addAtIndex(1, 2);
		testcase3LinkedList.traverse();
		System.out.println("Item at index 1 below");
		testcase3LinkedList.get(1);
		testcase3LinkedList.deleteAtIndex(0);
		testcase3LinkedList.get(0);
		testcase3LinkedList.traverse();

		
		System.out.println("Executing Linked List Test case 4");
		MyLinkedList testcase4LinkedList = new MyLinkedList();
		testcase4LinkedList.traverse();
		testcase4LinkedList.addAtIndex(0, 10);
		testcase4LinkedList.traverse();
		testcase4LinkedList.addAtIndex(0, 20);
		testcase4LinkedList.traverse();
		testcase4LinkedList.addAtIndex(1, 30);
		testcase4LinkedList.traverse();
		System.out.println("Item at index 0 below");
		testcase4LinkedList.get(0);
		testcase4LinkedList.traverse();
		
		System.out.println("Test case 5 for Single Ended Linked List");
		MyLinkedList testcase5LinkedList = new MyLinkedList();
		testcase5LinkedList.addAtTail(1);
		System.out.println("Get index 0 results " + testcase5LinkedList.get(0));
		testcase5LinkedList.traverse();
		
		System.out.println("Test case 6 for Single Ended Linked List");
		MyLinkedList obj = new MyLinkedList();
		obj.addAtHead(2);
		obj.deleteAtIndex(1);
		obj.addAtHead(2);
		obj.addAtHead(7);
		obj.addAtHead(3);
        obj.addAtHead(2);
        obj.addAtHead(5);
        obj.addAtTail(5);
        System.out.println("Element at index 5 is " + obj.get(5));
        obj.deleteAtIndex(6);
        obj.deleteAtIndex(4);
        obj.traverse();
		
        System.out.println("Test case 7 for Single Ended Linked List");
        MyLinkedList obj1 = new MyLinkedList();
        obj1.addAtHead(4);
        System.out.println("Element at index 1 is " + obj1.get(1));
        obj1.addAtHead(1);
        obj1.addAtHead(5);
        obj1.deleteAtIndex(3);
        obj1.addAtHead(7);
        System.out.println("Element at index 3 is " + obj1.get(3));
        System.out.println("Element at index 3 is " + obj1.get(3));
        System.out.println("Element at index 3 is " + obj1.get(3));
        obj1.addAtHead(1);
        obj1.deleteAtIndex(4);
        obj1.traverse();
        
        System.out.println("Executing Test case 8");
        MyLinkedList obj2 = new MyLinkedList();
        obj2.addAtHead(1);
        obj2.addAtTail(3);
        obj2.addAtIndex(1, 2);
        System.out.println("Element at index 1 is " + obj2.get(1));
        obj2.deleteAtIndex(1);
        System.out.println("Element at index 1 is " + obj2.get(1));
        System.out.println("Element at index 3 is " + obj2.get(3));
        obj2.deleteAtIndex(3);
        obj2.deleteAtIndex(0);
        System.out.println("Element at index 0 is " + obj2.get(0));
        obj2.deleteAtIndex(0);
        System.out.println("Element at index 0 is " + obj2.get(0));
        
        MyLinkedList obj3 = new MyLinkedList();
        obj3.addAtHead(1);
        obj3.addAtTail(3);
        obj3.addAtIndex(3, 2);
        
        MyLinkedList middleNodeLinkedList = new MyLinkedList();
        middleNodeLinkedList.addAtHead(1);
        middleNodeLinkedList.addAtTail(2);
        middleNodeLinkedList.addAtTail(3);
        middleNodeLinkedList.addAtTail(4);
        middleNodeLinkedList.addAtTail(5);
        
        System.out.println("Middle Node function called");
        ListNode node = objSolution.middleNode(middleNodeLinkedList.head);
		middleNodeLinkedList.head = node;
		middleNodeLinkedList.traverse();
		
        MyLinkedList middleNodeLinkedList1 = new MyLinkedList();
        middleNodeLinkedList1.addAtHead(1);
        middleNodeLinkedList1.addAtTail(2);
        middleNodeLinkedList1.addAtTail(3);
        middleNodeLinkedList1.addAtTail(4);
        middleNodeLinkedList1.addAtTail(5);
        middleNodeLinkedList1.addAtTail(6);
        
        System.out.println("Middle Node function called");
        ListNode node1 = objSolution.middleNode(middleNodeLinkedList1.head);
        middleNodeLinkedList1.head = node1;
        middleNodeLinkedList1.traverse();
        
        MyLinkedList obj4 = new MyLinkedList();
        obj4.addAtHead(1);
        
        System.out.println("Middle Node function called");
        ListNode node4 = objSolution.middleNode(obj4.head);
        obj4.head = node4;
        obj4.traverse();
        
        System.out.println("Executing the test cases of HashSet");
        
        MyHashSet obj5 = new MyHashSet();
        obj5.add(1);
        obj5.add(2);
        if(obj5.contains(1)) {
            System.out.println("Value 1 exists");
        }else {
            System.out.println("Value 1 does not exist");
        }
        if(obj5.contains(3)) {
            System.out.println("Value 3 exists");
        }else {
            System.out.println("Value 3 does not exist");
        }
        obj5.add(2);
        if(obj5.contains(2)) {
            System.out.println("Value 2 exists");
        }else {
            System.out.println("Value 2 does not exist");
        }

        obj5.remove(2);
        if(obj5.contains(2)) {
            System.out.println("Value 2 exists");
        }else {
            System.out.println("Value 2 does not exist");
        }
        
        System.out.println("Executing the test cases of HashMap");
        
        MyHashMap obj6 = new MyHashMap();
        obj6.put(1,1);
        obj6.put(2,2);
        System.out.println("Value at key 1 " +  obj6.get(1));
        System.out.println("Value at key 3 " +  obj6.get(3));
        obj6.put(2,1);
        System.out.println("Value at key 2 " +  obj6.get(2));

        obj6.remove(2);
        System.out.println("Value at key 2 " +  obj6.get(2));
        
        
        System.out.println("Debug remove elements");
        System.out.println("Test case 1");
        int nums15[] = {3, 2, 2, 3};
        objSolution.removeElement(nums15, 3);
        System.out.println("Results after " + Arrays.toString(nums15));
        System.out.println("Test case 2");
        int nums16[] = {0, 1, 2, 2, 3, 0, 4, 2};
        objSolution.removeElement(nums16, 2);
        System.out.println("Results after " + Arrays.toString(nums16));

        System.out.println("Test case 3");
        int nums17[] = {1};
        System.out.println("Number of elements removed are " + objSolution.removeElement(nums17, 1));
        System.out.println("Results after " + Arrays.toString(nums17));

        System.out.println("Test case 4");
        int nums18[] = {3, 3};
        System.out.println("Number of elements removed are " + objSolution.removeElement(nums18, 3));
        System.out.println("Results after " + Arrays.toString(nums18));

        
	}

	public static int[] twoSum(int[] nums, int target) {
		int result[] = new int[2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					result[0] = i;
					result[1] = j;
					break;
				}
			}
		}
		return result;
	}

	public boolean isPalindrome(int x) {
		String xString = String.valueOf(x);
		if (xString.equals(new StringBuilder(xString).reverse().toString())) {
			return true;
		} else {
			return false;
		}
	}

	public static int romanToInt(String s) {
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'I') {
				if (i + 1 < s.length() && (s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X')) {
					sum -= 1;
				} else {
					sum += 1;
				}
			}
			if (s.charAt(i) == 'V') {
				sum += 5;
			}
			if (s.charAt(i) == 'X') {
				if (i + 1 < s.length() && (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C')) {
					sum -= 10;
				} else {
					sum += 10;
				}

			}
			if (s.charAt(i) == 'L') {
				sum += 50;
			}
			if (s.charAt(i) == 'C') {
				if (i + 1 < s.length() && (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M')) {
					sum -= 100;
				} else {
					sum += 100;
				}

			}
			if (s.charAt(i) == 'D') {
				sum += 500;
			}
			if (s.charAt(i) == 'M') {
				sum += 1000;
			}
		}
		return sum;
	}

	public static int[] getConcatenation(int[] nums) {
		int[] ans = new int[nums.length * 2];
		for (int i = 0; i < nums.length; i++) {
			ans[i] = nums[i];
			ans[i + nums.length] = nums[i];
		}
		return ans;
	}

	public static int[] shuffle(int[] nums, int n) {
		int[] ans = new int[nums.length];
		for (int i = 0; i < n; i++) {
			ans[2 * i] = nums[i];
			ans[(2 * i) + 1] = nums[n + i];
		}
		return ans;
	}

	public static int finalValueAfterOperations(String[] operations) {
		int x = 0;
		for (int i = 0; i < operations.length; i++) {
			switch (operations[i]) {
			case "--X":
			case "X--":
				x--;
				break;
			case "++X":
			case "X++":
				x++;
				break;
			}
		}
		return x;
	}

	public int numIdenticalPairs(int[] nums) {
		int counter = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					counter++;
				}
			}
		}
		return counter;
	}

	public static int mostWordsFound(String[] sentences) {
		int max = 0;
		for (String sentence : sentences) {
			if (sentence.split(" ").length > max) {
				max = sentence.split(" ").length;
			}
		}
		return max;
	}

	public int[] runningSum(int[] nums) {
		int stepSum = 0;
		int[] ans = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			ans[i] = nums[i] + stepSum;
			stepSum += nums[i];
		}
		return ans;
	}

	public int maximumWealth(int[][] accounts) {
		int max = Integer.MIN_VALUE;
		int customerSum = Integer.MIN_VALUE;
		for (int i = 0; i < accounts.length; i++) {
			customerSum = 0;
			for (int j = 0; j < accounts[i].length; j++) {
				customerSum += accounts[i][j];
			}
			if (max < customerSum) {
				max = customerSum;
			}
		}
		return max;
	}

	public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		int max = Integer.MIN_VALUE;
		for (int i : candies) {
			if (i > max) {
				max = i;
			}
		}
		List<Boolean> booleanList = new ArrayList<>();
		for (int i : candies) {
			booleanList.add(i + extraCandies >= max);
		}
		return booleanList;
	}

	public int[] decompressRLElist(int[] nums) {
		ArrayList<Integer> numsArrayList = new ArrayList<>();
		int frequency = 0;
		int data = 0;
		int j = 0;
		for (int i = 0; i < nums.length; i += 2) {
			frequency = nums[i];
			data = nums[i + 1];
			for (int k = 1; k <= frequency; k++) {
				numsArrayList.add(data);
			}
		}
		int[] ans = new int[numsArrayList.size()];
		for (int i = 0; i < numsArrayList.size(); i++) {
			ans[i] = numsArrayList.get(i);
		}
		return ans;
	}

	public static int[] createTargetArray(int[] nums, int[] index) {
		int[] target = new int[index.length];
		for (int i = 0; i < index.length; i++) {
			target[index[i]] = nums[i];
		}
		return target;
	}

	public int smallestEqual(int[] nums) {
		int index = -1;
		for (int i = 0; i < nums.length; i++) {
			if (i % 10 == nums[i]) {
				return i;
			}
		}
		return index;
	}

	public int[] replaceElements(int[] arr) {
		int[] ans = new int[arr.length];
		for (int i = 0; i < arr.length - 1; i++) {
			ans[i] = Arrays.stream(arr, i + 1, arr.length).max().getAsInt();
		}
		ans[arr.length - 1] = -1;
		return ans;
	}

	public int max(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (i > max)
				max = i;
		}
		return max;
	}

	public int[] leftRightDifference(int[] nums) {
		int[] toReturn = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			toReturn[i] = Math.abs(leftSum(nums, i) - rightSum(nums, i));
		}
		return toReturn;
	}

	public int leftSum(int[] nums, int index) {
		int sum = 0;
		for (int i = 0; i < index; i++) {
			sum += nums[i];
		}
		return sum;
	}

	public int rightSum(int[] nums, int index) {
		int sum = 0;
		for (int i = index + 1; i < nums.length; i++) {
			sum += nums[i];
		}
		return sum;
	}

	public int[] smallerNumbersThanCurrent(int[] nums) {
		int[] ans = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			ans[i] = getSmallerNumbersCount(nums, nums[i], i);
		}
		return ans;
	}

	public int getSmallerNumbersCount(int[] nums, int currentNumber, int index) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (i == index) {
				continue;
			}
			if (nums[i] < currentNumber)
				count++;

		}
		return count;
	}

	public int countPairs(int[] nums, int k) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j] && ((i * j) % k) == 0) {
					count++;
				}
			}
		}
		return count;
	}

	public int countGoodRectangles(int[][] rectangles) {
		int[] minimumsArray = new int[rectangles.length];
		for (int i = 0; i < rectangles.length; i++) {
			minimumsArray[i] = Arrays.stream(rectangles[i]).min().getAsInt();
		}
		int max = Arrays.stream(minimumsArray).max().getAsInt();
		return (int) Arrays.stream(minimumsArray).filter(x -> x == max).count();
	}

	public int findNumbers(int[] nums) {
		String str;
		int count = 0;
		for (int num : nums) {
			str = Integer.toString(num);
			if (str.length() % 2 == 0) {
				count++;
			}
		}
		return count;
	}

	public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
		int count = 0;
		for (int i = 0; i < startTime.length; i++) {
			if (startTime[i] <= queryTime && queryTime <= endTime[i])
				count++;
		}
		return count;
	}

	public int findSpecialInteger(int[] arr) {
		double twentyFivePercent = 0.25 * arr.length;
		int previousNumber = Integer.MIN_VALUE;
		int stepSum = 0;
		Stack<Integer> equalNumbers = new Stack<>();
		for (int i : arr) {
			if (previousNumber == Integer.MIN_VALUE)
				previousNumber = i;
			if (i == previousNumber) {
				stepSum++;
			} else {
				stepSum = 1;
			}
			previousNumber = i;
			if (stepSum > twentyFivePercent)
				return i;
			if (stepSum == twentyFivePercent)
				equalNumbers.push(i);
		}
		return equalNumbers.pop();

	}

	public boolean threeConsecutiveOdds(int[] arr) {
		if (arr.length < 3) {
			return false;
		} else {
			for (int i = 0; i < arr.length - 2; i++) {
				if (arr[i] % 2 == 1) {
					if (arr[i + 1] % 2 == 1) {
						if (arr[i + 2] % 2 == 1) {
							return true;
						}
					}
				}
			}
			return false;
		}
	}

	public String categorizeBox(int length, int width, int height, int mass) {
		double bulkyCheckNumber = Math.pow(10, 4);
		BigInteger bulkyVolumeCheck = new BigInteger("10");
		bulkyVolumeCheck = bulkyVolumeCheck.pow(9);
		String category = "";
		BigInteger bigLength = new BigInteger(String.valueOf(length));
		BigInteger bigWidth = new BigInteger(String.valueOf(width));
		BigInteger bigHeight = new BigInteger(String.valueOf(height));
		BigInteger volume = bigLength.multiply(bigWidth.multiply(bigHeight));
		if (length >= bulkyCheckNumber || width >= bulkyCheckNumber || height >= bulkyCheckNumber
				|| volume.compareTo(bulkyVolumeCheck) > -1)
			category = "Bulky";
		if (category.equals("Bulky")) {
			if (mass >= 100) {
				category = "Both";
			}
		} else {
			if (mass >= 100) {
				category = "Heavy";
			} else {
				category = "Neither";
			}
		}
		return category;
	}

	public int countOdds(int low, int high) {
//    	int count = 0;
//    	for(int i = low; i <= high; i++) {
//    		if(i % 2 == 1) {
//    			count++;
//    		}
//    	}
//    	return count;

		return (int) IntStream.range(low, high + 1).filter(x -> x % 2 == 1).count();
	}

	public int averageValue(int[] nums) {
		return (int) Arrays.stream(nums).filter(x -> x % 2 == 0 && x % 3 == 0).average().getAsDouble();
	}

	public int arraySign(int[] nums) {
		BigInteger product = BigInteger.ONE;
		for (int num : nums) {
			product = product.multiply(new BigInteger(String.valueOf(num)));
		}
		return product.compareTo(BigInteger.ZERO);
	}

	public double[] convertTemperature(double celsius) {
		double[] toReturn = new double[2];
		toReturn[0] = celsius + 273.15;
		toReturn[1] = celsius * 1.80 + 32.00;
		return toReturn;
	}

	public boolean isUgly(int n) {
		if (n < 1)
			return false;
		BigInteger nBigInteger = new BigInteger(String.valueOf(n));
		for (int i = 6; i <= n / 2; i++) {
			nBigInteger = new BigInteger(String.valueOf(i));
			if (i != 2 && i != 3 && i != 5) {
				if (n % i == 0)
					return false;
			}
		}
		return true;
	}

	public String convertToBase7(int num) {

		return Integer.toString(num, 7);
	}

	public int subtractProductAndSum(int n) {
		String nString = String.valueOf(n);
		BigInteger productOfDigits = BigInteger.ONE;
		int sumOfDigits = 0;
		for (int i = 0; i < nString.length(); i++) {
			productOfDigits = productOfDigits.multiply(new BigInteger(nString.substring(i, i + 1)));
			sumOfDigits += Integer.parseInt(nString.substring(i, i + 1));
		}
		return productOfDigits.subtract(new BigInteger(String.valueOf(sumOfDigits))).intValue();
	}

	public int sumBase(int n, int k) {
		String nString = Integer.toString(n, k);
		int sumOfDigits = 0;
		for (int i = 0; i < nString.length(); i++) {
			sumOfDigits += Integer.parseInt(nString.substring(i, i + 1));
		}
		return sumOfDigits;
	}

	public int xorOperation(int n, int start) {
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = start + 2 * i;
		}

		return Arrays.stream(nums).reduce((a, b) -> a ^ b).getAsInt();

	}

	public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
		String str1 = "";
		String str2 = "";
		for (String str : word1) {
			str1 = str1.concat(str);
		}
		for (String str : word2) {
			str2 = str2.concat(str);
		}
		return str1.equals(str2);

	}

	public List<String> cellsInRange(String s) {
//    	// Wrong because the constraint is given as String length is strictly five. 
//    	StringBuilder startRowStringBuilder = new StringBuilder();
//    	StringBuilder startColumnStringBuilder = new StringBuilder();
//    	StringBuilder endRowStringBuilder = new StringBuilder();
//    	StringBuilder endColumnStringBuilder = new StringBuilder();
//    	int currentIndex = 0;
//    	while(Character.isUpperCase(s.charAt(currentIndex))) {
//    		startRowStringBuilder.append(s.charAt(currentIndex));
//    		currentIndex++;
//    	}
//    	while(Character.isDigit(s.charAt(currentIndex))) {
//    		startColumnStringBuilder.append(s.charAt(currentIndex));
//    		currentIndex++;
//    	}
//    	// Skip : 
//    	currentIndex++;
//    	while(Character.isUpperCase(s.charAt(currentIndex))) {
//    		endRowStringBuilder.append(s.charAt(currentIndex));
//    		currentIndex++;
//    	}
//    	while(Character.isDigit(s.charAt(currentIndex))) {
//    		endColumnStringBuilder.append(s.charAt(currentIndex));
//    		currentIndex++;
//    		if(currentIndex == s.length())
//    			break;
//    	}
		List<String> list = new ArrayList<>();

		char startRow = s.charAt(0);
		char startColumn = s.charAt(1);
		char endRow = s.charAt(3);
		char endColumn = s.charAt(4);
		for (char c = startRow; c <= endRow; c++) {
			for (char i = startColumn; i <= endColumn; i++) {
				list.add(String.valueOf(c) + String.valueOf(i));
			}
		}
		return list;
	}

	public String convertToTitle(int columnNumber) {
		StringBuilder titleStringBuilder = new StringBuilder();
		while (columnNumber > 26) {
			titleStringBuilder.insert(0, (char) (64 + ((columnNumber % 26) + 1)));
			columnNumber = columnNumber / 26;
		}
		titleStringBuilder.insert(0, (char) (64 + columnNumber));
		return titleStringBuilder.toString();
	}

	public String defangIPaddr(String address) {
		return address.replaceAll(".", "[.]");
	}

	public boolean isValid(String s) {
		Stack<Character> charStack = new Stack<Character>();
		char poppedCharacter = '\u0000';
		for (char c : s.toCharArray()) {
			if (c == '(' || c == '{' || c == '[') {
				charStack.push(c);
			} else {
				if (c == ')') {
					if (charStack.isEmpty() || charStack.pop() != '(') {
						return false;
					}
				} else {
					if (c == '}') {
						if (charStack.isEmpty() || charStack.pop() != '{') {
							return false;
						}
					} else {
						if (c == ']') {
							if (charStack.isEmpty() || charStack.pop() != '[') {
								return false;
							}
						}
					}
				}
			}
		}
		return charStack.isEmpty();
	}

	public int countDigits(int num) {
		String numString = String.valueOf(num);
		int count = 0;
		for (int i = 0; i < numString.length(); i++) {
			if (num % Integer.parseInt(numString.substring(i, i + 1)) == 0)
				count++;
		}
		return count;
	}

	public boolean checkPerfectNumber(int num) {
		IntStream myIntStream = IntStream.rangeClosed(1, (num / 2) + 1).parallel();
		if(num % 2 != 0)
			myIntStream = myIntStream.filter(x -> x % 2 != 0);
		if(num % 3 != 0)
			myIntStream = myIntStream.filter(x -> x % 3 != 0);
		if(num % 5 != 0)
			myIntStream = myIntStream.filter(x -> x % 5 != 0);
		if(num % 7 != 0)
			myIntStream = myIntStream.filter(x -> x % 7 != 0).parallel();
		if(num % 11 != 0)
			myIntStream = myIntStream.filter(x -> x % 11 != 0).parallel();
		if(num % 13 != 0)
			myIntStream = myIntStream.filter(x -> x % 13 != 0).parallel();
		if(num % 17 != 0)
			myIntStream = myIntStream.filter(x -> x % 17 != 0).parallel();
		return myIntStream.filter(x -> num % x == 0).sum() == num;

	}
	public int largestAltitude(int[] gain) {
        int[] altitudeGainsArray = new int[gain.length + 1];
        altitudeGainsArray[0] = 0;
        for(int i = 0; i < gain.length; i++) {
        	altitudeGainsArray[i + 1] = altitudeGainsArray[i] + gain[i];
        }
        return Arrays.stream(altitudeGainsArray).max().getAsInt();
     }
	
	public int diagonalSum(int[][] mat) {
		int sum = 0;
		for(int i = 0; i < mat.length; i++) {
			sum += mat[i][i];
		}
		for(int i = mat.length - 1; i >= 0; i--) {
			if(i == Math.floor(mat.length / 2) && mat.length % 2 != 0)
				continue;
			sum += mat[i][i];
		}
		return sum;
    }
	
	public String truncateSentence(String s, int k) {
       String[] stringArray = s.split(" ");
       StringBuilder toReturnStringBuilder = new StringBuilder();
       for(int i = 0; i < k; i++) {
    	   toReturnStringBuilder.append(stringArray[i] + " ");
       }
       return toReturnStringBuilder.toString().trim();
    }
	
	public String restoreString(String s, int[] indices) {
		StringBuilder toReturn = new StringBuilder();
		for(int i = 0; i < indices.length; i++) {
			toReturn.append(s.charAt(indices[i]));
		}
		return toReturn.toString();
    }
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        return 0;
    }
    public int numJewelsInStones(String jewels, String stones) {
    	int count = 0;
    	for(char c : stones.toCharArray()) {
    		if(jewels.indexOf(c) >= 0)
    			count++;
    	}
    	return count;
    }

    public String mergeAlternately(String word1, String word2) {
        StringBuilder toReturn = new StringBuilder();
        for(int i = 0; i < Math.max(word1.length(), word2.length()); i++) {
            if(i == word1.length())
            {
                toReturn.append(word2.substring(i, word2.length()));
                break;
            }
            else
            {
                if(i == word2.length()) {
                    toReturn.append(word1.substring(i, word1.length()));
                    break;
                }
                else
                {
                    toReturn.append(word1.charAt(i));
                    toReturn.append(word2.charAt(i));
                }
            }
        }
        return toReturn.toString();
    }
    
    public char findTheDifference(String s, String t) {
    	StringBuilder sStringBuilder = new StringBuilder(s);
    	for(char c : t.toCharArray()) {
    		if(sStringBuilder.indexOf(String.valueOf(c)) == -1)
    			return c;
    		else {
    			sStringBuilder.deleteCharAt(sStringBuilder.indexOf(String.valueOf(c)));
    		}
    	}
    	return '\u0000';
    }
    public int maxDepth(String s) {
    	int depth = 0;
    	if(s.equals("")) {
    		return 0;
    	}else {
    		if(s.length() == 1) {
    			if(s.charAt(0) != '(' && s.charAt(0) != ')') {
    				return 0;
    			}
    		}
    		Stack<Character> stackParenthesis = new Stack<>();
    		for(char c : s.toCharArray()) {
    			if(c == '(') {
    				stackParenthesis.push('(');
    			}else {
    				if(c == ')') {
    					if(stackParenthesis.size() > depth) {
    						depth = stackParenthesis.size();
    						
    					}
    					stackParenthesis.pop();
    				}
    			}
    		}
    		return depth;
    	}
    }
    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
        	if(i % 3 == 0 && i % 5 == 0) {
        		answer.add("FizzBuzz");
        	}else {
        		if(i % 3 == 0) {
        			answer.add("Fizz");
        		}else {
        			if(i % 5 == 0) {
        				answer.add("Buzz");
        			}else {
        				answer.add(Integer.toString(i));
        			}
        		}
        	}
        }
        return answer;
    }
    public int numberOfSteps(int num) {
        int count = 0;
        while(num != 0) {
        	if(num % 2 == 0) 
        		num = num / 2;
        	else
        		num = num - 1;
        	count++;
        }
        return count;
    }
    public ListNode middleNode(ListNode head) {
    	int count = 0;
    	int middle = 0;
    	ListNode traverse = head;
    	while(traverse != null) {
    		count++;
    		traverse = traverse.next;
    	}
    	if(count % 2 == 0) {
    		middle = (count / 2); 
    	} else {
    		middle = (int)Math.floor(count / 2);
    	}
    	int index = 0;
    	traverse = head;
    	while(traverse != null) {
    	    if(count == 1) {
    	        return traverse;
    	    }
    		index++;
            traverse = traverse.next;
    		if(index == middle) {
    			return traverse;
    		}
    	}
    	return traverse;
    }
    
    public int findMiddleIndex(int[] nums) {
    	int sumLeft = 0;
    	int sumRight = 0;
    	for(int i = 0; i < nums.length; i++) {
    		sumLeft = Arrays.stream(nums, 0, i).sum();
    		sumRight = Arrays.stream(nums, i + 1, nums.length).sum();
    		if(sumLeft == sumRight)
    			return i;
    	}
    	return -1;
    }
    
    public int getArraySum(int[] array, int startIndexInclusive, int endIndexExclusive) {
    	int sum = 0;
    	for(int i = startIndexInclusive; i < endIndexExclusive; i++) {
    		sum += array[i];
    	}
    	return sum;
    }
    
    public int pivotIndex(int[] nums) {
        int sumLeft = 0;
    	int sumRight = 0;
    	for(int i = 0; i < nums.length; i++) {
    		sumLeft = getArraySum(nums, 0, i);
    		
    		
    		sumRight = getArraySum(nums, i +1, nums.length);
    		if(sumLeft == sumRight)
    			return i;
    	}
    	return -1;
    }
    
    public int dominantIndex(int[] nums) {
    	int max = Integer.MIN_VALUE;
    	int maxIndex = -1;
    	for(int i = 0; i < nums.length; i++) {
    		if(nums[i] > max) {
    			max = nums[i];
    			maxIndex = i;
    		}
    		
    	}
    	int sumOfOtherNumbers = 0;
    	
    	for(int i = 0; i < nums.length; i++) {
            if(i == maxIndex)
                continue;
    		if(2 * nums[i] > max)
    			return -1;
    	}
    	return maxIndex;
        
    }
    
    public int[] plusOne(int[] digits) {
    	int carry = 0;
        for(int i = digits.length - 1; i >= 0; i--) {
        	if(i == digits.length - 1) {
	        	if(digits[i] == 9) {
	        		carry++;
	        		digits[i] = 0;
	        	}else {
	        		digits[i] = digits[i] + 1;
	        		break;
	        	}
        	}else {
        		if(carry == 0) 
        			break;
        		else {
        			carry = 0;
    	        	if(digits[i] == 9) {
    	        		carry++;
    	        		digits[i] = 0;
    	        	}else {
    	        		digits[i] = digits[i] + 1;
    	        		break;
    	        	}
        		}
        	}
        }
        int[] digits1;
        StringBuilder objStringBuilder = new StringBuilder();
        if(carry == 1) {
        	objStringBuilder.append(carry);
        	digits1 = new int[digits.length + 1];
        	digits1[0] = 1;
        	for(int i = 0; i < digits.length; i++) {
        		digits1[i + 1] = digits[i];
        	}
        	return digits1;
        }
        else
        	return digits;
        
       
    }
    
    public int findMaxConsecutiveOnes(int[] nums) {
    	int maxCount = 0;
    	int currentCount = 0;
    	for(int i = 0; i < nums.length; i++) {
    		if(nums[i] == 1) {
    			currentCount++;
    			if(currentCount > maxCount)
    				maxCount = currentCount;
    		}else {
    			currentCount = 0;
    		}
    	}
    	return maxCount;
    }
    
    public int[] sortedSquares(int[] nums) {
    	for(int i = 0; i < nums.length; i++) {
    		nums[i] = nums[i] * nums[i];
    	}
    	Arrays.sort(nums);
//    	Arrays.sort(nums, Collections.reverseOrder());
    	return nums;
    }
    public void duplicateZeros(int[] arr) {
    	StringBuilder objStringBuilder = new StringBuilder();
    	for(int i = 0; i < arr.length; i++) {
    		objStringBuilder.append(Integer.toString(arr[i]));
    	}
    	String result = objStringBuilder.toString().replaceAll("0", "00");
    	for(int i = 0; i < arr.length; i++) {
    		arr[i] = Integer.parseInt(result.substring(i, i + 1));
    	}
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    	int i = m - 1;
    	int j = nums2.length - 1;
    	while(j >= 0) {
    	    if(i >= 0 && nums1[i] > nums2[j]) {
    	        nums1[i + j + 1] = nums1[i];
    	        i--;
    	    }else {
    	        nums1[i + j + 1] = nums2[j];
                j--;
    	    }
    	}
    }
    public int getDecimalValue(ListNode head) {
    	StringBuilder objStringBuilder = new StringBuilder();
    	ListNode node = head;
    	while(node != null) {
    		objStringBuilder.append(String.valueOf(node.val));
    		node = node.next;
    	}
    	return Integer.parseInt(objStringBuilder.toString(), 2);
    }
    
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> objHashSet = new HashSet<>();
        for(int num : nums) {
            if(objHashSet.contains(Integer.valueOf(num))) {
                return true;
            }else {
                objHashSet.add(num);
            }
        }
        return false;
    }
    public int singleNumber(int[] nums) {
        HashSet<Integer> setOfNumbers = new HashSet<>();
        for(int num : nums) {
            if(!setOfNumbers.contains(Integer.valueOf(num))) {
                setOfNumbers.add(num);
            }else {
                if(setOfNumbers.contains(Integer.valueOf(num))) {
                    setOfNumbers.remove(Integer.valueOf(num));
                }
            }
        }
        return (int)setOfNumbers.toArray()[0];
    }
    
    public int[] intersection(int[] nums1, int[] nums2) {
//        int []result = new int[Math.min(nums1.length, nums2.length)]
        Arrays.sort(nums2);
        return Arrays.stream(nums1).filter(x -> Arrays.binarySearch(nums2, x) >= 0).distinct().toArray();
    }
    public boolean canConstruct(String ransomNote, String magazine) {
        List<Character> magazineCharacters = new ArrayList<>();
        for(char c : magazine.toCharArray()) {
            magazineCharacters.add(c);
        }
        for(char c : ransomNote.toCharArray()) {
            if(magazineCharacters.contains(Character.valueOf(c)))
                magazineCharacters.remove(Character.valueOf(c));
            else
                return false;
        }
        return true;
        
    }
    
    public boolean isHappy(int n) {
       return false; 
    }
    class MyTriplet{
        int i;
        int j;
        int k;
        public MyTriplet(int i, int j, int k) {
            this.i = i;
            this.j = j;
            this.k = k;
        }
    }
    public int arithmeticTriplets(int[] nums, int diff) {
        HashSet<MyTriplet> uniqueTriplets = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                for(int k = j + 1; k < nums.length; k++) {
                    if(nums[j] - nums[i] == diff && nums[k] - nums[j] == diff)
                        uniqueTriplets.add(new MyTriplet(i, j, k));
                }
            }
        }
        return uniqueTriplets.size();
    }
    public int removeElement(int[] nums, int val) {
        int elementsRemoved = 0;
        int temp = 0;
        int j = nums.length - 1;
            
        for(int i = 0; i < nums.length; ) {
            if(i == j) {
                if(nums.length == 1) {
                    if(nums[i] == val) {
                        elementsRemoved++;
                        return nums.length - elementsRemoved;
                    }
                }
                break;
            }
            if(nums[i] == val) {
                elementsRemoved++;
                temp = nums[i];
                nums[i] = nums[j];
                nums[j--] = temp;
            }else {
                i++;
            }
        }
        return nums.length - elementsRemoved;
    }
}
