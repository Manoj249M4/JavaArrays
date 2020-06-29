package com.java.miscprograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ArraySortingInJava {

	public static void main(String[] args) {

		int[] arr = { 8, 7, 6, 5, 4, 3, 2, 1, 0 };
		System.out.println("Arrays before sorting: " + Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("Arrays after sorting in ascending order: " + Arrays.toString(arr));
		System.out.println("===================1================");

		Integer[] elevens = { 33, 44, 11, 66, 22, 88, 55, 77 };
		Arrays.sort(elevens);
		System.out.println("Increasing order :" + Arrays.toString(elevens));
		Arrays.sort(elevens, Collections.reverseOrder());
		System.out.println("REverse order: " + Arrays.toString(elevens));
		System.out.println("===================2================");

		String[] names = { "John", "Steve", "Shane", "Adam", "Ben" };
		System.out.println("String array before sorting : " + Arrays.toString(names));
		Arrays.sort(names);
		System.out.println("String array after sorting in ascending order : " + Arrays.toString(names));
		System.out.println("sorting arrays in descending order");
		Arrays.sort(names, 0, names.length, Collections.reverseOrder());
		System.out.println("String array after sorting in descending order : " + Arrays.toString(names));
		System.out.println("===================2D Array Sorting================");

		Course[] courses = new Course[4];
		courses[0] = new Course(101, "Java", 200);
		courses[1] = new Course(201, "Ruby", 300);
		courses[2] = new Course(301, "Python", 400);
		courses[3] = new Course(401, "Scala", 500);

		System.out.println("Object array before sorting : " + Arrays.toString(courses));
		Arrays.sort(courses);
		System.out.println("Object array after sorting : " + Arrays.toString(courses));
		Arrays.sort(courses, new Course.PriceComparator());
		System.out.println("Object array after sorting by price : " + Arrays.toString(courses));
		Arrays.sort(courses, new Course.NameCopmarator());
		System.out.println("Object array after sorting by name : " + Arrays.toString(courses));

		System.out.println("Sort two dimensional array in Java on first column, increasing order");
		Integer[][] numbers = { { 9, 6, 5 }, { 3, 2, 4 }, { 1, 5, 7 } };
		System.out.println("Two dimensional arrays before sorting: " + Arrays.deepToString(numbers));
		Arrays.sort(numbers, new ColumnComparator(0, SortingOrder.ASCENDING));
		System.out.println("2D array after sorting in ascending order on first column : " + Arrays.deepToString(numbers));
		
		System.out.println("Sorting 2D array on second column in descending order");
		Arrays.sort(numbers, new ColumnComparator(1, SortingOrder.DESCENDING));
		System.out.println("Sorting two dimensional String array in Java, Second column, Descending order : " + Arrays.deepToString(numbers));
	}

}

class Course implements Comparable<Course> {

	int id;
	String name;
	int price;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Course(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	@Override
	public int compareTo(Course c) {
		return this.id - c.id;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

	static class PriceComparator implements Comparator<Course> {

		@Override
		public int compare(Course c1, Course c2) {
			return c1.price - c2.price;
		}

	}

	static class NameCopmarator implements Comparator<Course> {

		@Override
		public int compare(Course c1, Course c2) {
			return c1.name.compareTo(c2.name);
		}

	}

}

enum SortingOrder {
	ASCENDING, DESCENDING;
};

class ColumnComparator implements Comparator<Comparable[]> {

	final int iColumn;
	final SortingOrder order;

	public ColumnComparator(int iColumn, SortingOrder order) {
		super();
		this.iColumn = iColumn;
		this.order = order;
	}

	@Override
	public int compare(Comparable[] c1, Comparable[] c2) {
		int result = c1[iColumn].compareTo(c2[iColumn]);
		return order == SortingOrder.ASCENDING ? result : -result;
	}

}
