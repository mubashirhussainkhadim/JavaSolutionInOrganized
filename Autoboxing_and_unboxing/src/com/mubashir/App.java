package com.mubashir;
import java.util.ArrayList;
class intWrapper{
	public int intValue;

	public intWrapper(int intValue) {
		this.intValue = intValue;
	}

	public int getIntValue() {
		return intValue;
	}

	public void setIntValue(int intValue) {
		this.intValue = intValue;
	}
	
}
public class App {

	@SuppressWarnings("removal")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        ArrayList<Integer>  studentNumbers = new ArrayList<>();
//        studentNumbers.add(25);
//        studentNumbers.add(5);
//        studentNumbers.add(35);
//        studentNumbers.add(245);
//        studentNumbers.add(235);
//        studentNumbers.add(245);
//        System.out.println(studentNumbers);
//      ArrayList<intWrapper>  studentNumbers = new ArrayList<>();
//      studentNumbers.add(new intWrapper(12)); //boxing
//      System.out.println(studentNumbers.get(0).getIntValue()); // unboxing
		
		ArrayList<Double> demoList = new ArrayList<>();
	//	demoList.add(25.5);
	//	demoList.add(new Double(25.5));
	//   demoList.add(Double.valueOf(10.0)); // this is done by auto boxing
		
	}

}
