package p2;

public class Prime {
	
	

	public static void main(String[] args) {
			int num=20;
			int nof=0; //no of factor
			for(int i=1;i<=num;i++){
				if(num%i==0){
					nof++;
					System.out.println(i);
				}
			}
			System.out.println("\n No. of factors :" + nof);
			if(nof==2)
			{
				System.out.println("Prime number");
			}
			else{
				System.out.println("Not a prime number");
			}
				
	}

}
