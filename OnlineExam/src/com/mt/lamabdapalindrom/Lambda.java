package com.mt.lamabdapalindrom;

public class Lambda {

	    
	    public interface PerformOperation {
	        public boolean operation(int x);
	    }
	    
	    public static void main(String[] args) {
	        PerformOperation isOdd = x-> x%2 != 0;
	        
	        isOdd.operation(3);
	        isOdd.operation(8);
	        
	        
	        PerformOperation isPrime = x-> {
	            boolean flag = false;
	            for (int i = 2; i <= x / 2; ++i) {
	                  if (x % i == 0) {
	                    flag = true;
	                    break;
	                  }
	                }
	            if (!flag)
	                  return true;
	                else
	                 return false;
	            };
	    
	        System.out.println("7 is Prime Number ?"+isPrime.operation(7));
	        System.out.println("13 is Prime Numver ?"+isPrime.operation(29));
	        
	        PerformOperation isPalindrome = x -> {
	            int newNum = 0, remainder, temp;
	            temp = x;
	            
	            while(temp != 0){
	                  remainder = temp % 10;
	                  newNum = newNum*10 + remainder;
	                  temp = temp/10;
	            }
	            
	            if (newNum == x)
	                 return true;
	            else
	                return false;
	            
	        };
	        
	        System.out.println("454 is palindrome ?"+isPalindrome.operation(454));
	        System.out.println("233 is palindrome ?"+isPalindrome.operation(233));
	    }



	}
	
