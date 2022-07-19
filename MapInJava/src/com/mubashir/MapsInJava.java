package com.mubashir;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

class Code implements Comparable<Code> {
	private String sectionNo;
	private String lectureNo;
	
	public Code(String sectionNo, String lectureNo) {
		super();
		this.sectionNo = sectionNo;
		this.lectureNo = lectureNo;
	}
	public String getSectionNo() {
		return sectionNo;
	}
	public String getLectureNo() {
		return lectureNo;
	}
	@Override
	public String toString() {
		return "Code [sectionNo=" + sectionNo + ", lectureNo=" + lectureNo + "]";
	}
	@Override
	public int compareTo(Code o) {
		String code1 = sectionNo.concat(lectureNo);
		String code2 =o.getSectionNo()+o.getLectureNo();
		return code1.compareTo(code2);
	}
	@Override
	public int hashCode() {
		return Objects.hash(lectureNo, sectionNo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Code other = (Code) obj;
		return Objects.equals(lectureNo, other.lectureNo) && Objects.equals(sectionNo, other.sectionNo);
	}
	
}
public class MapsInJava {

	public static void main(String[] args) {
     Map<Code,String> lectures = new TreeMap<>(); 
     lectures.put(new Code ("S01" ,"L03"), "Generics");
     lectures.put(new Code ("S01" ,"L01"), "Files Under Java");
     lectures.put(new Code ("S02" ,"L03"), "Network Programming");
     lectures.put(new Code ("S01" ,"L07"), "OOPS");
     lectures.put(new Code ("S01" ,"L05"), "Methods");
     lectures.put(new Code ("S01" ,"L03"), "EXpression");
     
//     for (Map.Entry<Code, String> entry: lectures.entrySet()) {
//    	System.out.println("key: "+ entry.getKey() + " value: "+entry.getValue());
//     }
//     
//     Code code1 = new Code ("S01" ,"L03");
//     Code code2 = new Code ("S01" ,"L03");    
//     System.out.println(code1.equals(code2));
//     System.out.println("code1 Hashcode " + code1.hashCode() +" code2 Hashcode " + code2.hashCode());
     
//     String name1 = new String("Mubashir");
//     String name2 = new String("Mubashir");
//     System.out.println(name1 == name2);
//     System.out.println("Name1 hash: "+name1.hashCode()+"Name2 hash: "+name2.hashCode());
//     System.out.println(name1.equals(name2));
       
       Code code = null;
     for(Map.Entry<Code, String>entry: lectures.entrySet()) {
    	 if(entry.getValue().equals("OOPS")) {
    		 code= entry.getKey();
    	 }
     }
         System.out.println("THE KEY VALUE \"OOPS\""+code);
     }
     
	}


