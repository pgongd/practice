package ex0923;

public class ForTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for (int i = 1; i <= 10; i++) /* for(int i=1,sum=0;i<=10;i++) 이렇게 해줘도됨 */ {
			sum+=i;
			System.out.println("i="+i+", sum="+sum);
		}
	}

}
