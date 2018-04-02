package edu.handong.csee.java.lab08;
//TODO write javadoc
public class Overload {
	
	public static void main(String[] args) {
		double average1 = Overload.getAverage(80, 20);
		double average2 = Overload.getAverage(average1, 5,5);
		char average3 = Overload.getAverage('a', 'c');
		System.out.print("average1="+average1+"\n");
		System.out.print("average2="+average2+"\n");
		System.out.print("average3="+average3+"\n");
		
	}
	
	public static double getAverage(double first, double second) {
		return (first+second)/2;
	}
	
	public static double getAverage(double first, double second, double third) {
		return (first+second+third)/3;
	}
	
	public static char getAverage(char first, char second) {
		return (char)(((int)first+(int)second)/2);
	}
}
