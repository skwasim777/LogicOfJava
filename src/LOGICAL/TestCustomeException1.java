package LOGICAL;

public class TestCustomeException1 {
		public static void valid(int age) throws EnvalidAgeException {
			if(age < 18) {
				throw new EnvalidAgeException("age is not valid to vote");
			}else {
				System.out.println("welcome to vote");
			}
		}
		public static void main(String[] args) {
			try {
				valid(13);
			} catch (EnvalidAgeException e) {
				System.out.println("cuaght the exception");
				System.out.println(e);
			}
		}
}
