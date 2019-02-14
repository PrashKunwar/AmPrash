package xyz;
//Compound and Else if statements
public class FlowControl {
	public static void main(String [] args) {
	int a= 10, b= 20, c= 6, d=80;
	
	if ((a>b) && (a>c) && (a>d)) {
		System.out.println("A is a big number");
	}
	else if ((b>a)&&(b>c)&&(b>d)) {
		System.out.println("B is a big number");
	}
	else if ((c>a)&&(c>b)&&(c>d)) {
		System.out.println("C is a big number");
	}
	else {
		System.out.println("D is a big number");
	}
	
	}

}
