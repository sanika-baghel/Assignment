package assignmentII;

public class RemoveWhiteSpace {
	public static void main(String[] args) {
		String a = "java    is  an oop     language";
		String s = a.replaceAll("\s", ""); 
		System.out.println(s);
	}
}