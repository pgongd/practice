package ex0923;

public class GuGuDan02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<5;i++) {
			for(int j=-4;j<5;j++) {
				if(Math.abs(j)>i) { //if(j>-i || j>i)
				System.out.print(" ");
			}else {
			System.out.print("*");
			}
		}
			System.out.println();
		}
		
		
		/*for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(j<5-i-1) {
				System.out.print(" ");
			}else {
			System.out.print("*");
			}
		}
			System.out.println();
		}*/
		
		/*
		for(int i=0;i<5;i++) {
			for(int j=0;j<5-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		
		
//		for(int i=1;i<5;i++) {
//			for(int j=0;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		/*
		for(int i=10; i>=5;i--) {
			for(int j=i;j>=i-5;j--) {				
				System.out.print(j+"\t");
			}
			System.out.println();
		}
		*/
	}

}
