package week1.package1;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int			number 			= 1;
		boolean 	isPrime			= true;
		
		if (number <= 1) {
			isPrime = false;
			
		} else {
				for (int i = 2; i <= 2; i++) {
					if (number % i == 0) {
						isPrime = false;
						break;
					}
					
				}
			}
		if (isPrime) {
			System.out.println(number + " is a prime number.");
		} else
			System.out.println(number + " is not a prime number");
		}

	}


