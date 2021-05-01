package ex0923;

public class LoopTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int i=1;
		/* while(true) {
			sum+=i;
			i++;
			System.out.println(i+","+sum);
		}
		
		do {
			sum+=i;
			i++;
			System.out.println(i+","+sum);
		}while(true);*/
		
		for(i=0;;i++) {
			sum+=i;
			System.out.println(i+","+sum);
		}
	}

}
