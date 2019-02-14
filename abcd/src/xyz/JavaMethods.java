package xyz;

public class JavaMethods {

public static void studentRank(int marks) {
	if(marks>=600) {
		System.out.println("Rank A");
	}
	else if(marks>=500) {
		System.out.println("Rank B");
	}
	else {
	System.out.println("Rank C");
	}
	
}

public static void main(String [] args) {
	studentRank(100);
}

	
}
