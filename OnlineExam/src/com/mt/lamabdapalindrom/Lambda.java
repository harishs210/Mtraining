package com.mt.lamabdapalindrom;

public class Lambda {

	    
	    public interface Operation {
	        public boolean operation(int n);
	    }
	    
	    public static void main(String[] args) {
	        int oddOrEven= 48;
	    	
	    	Operation isOdd = n-> n%2 != 0;
	        
	       System.out.println(oddOrEven +"isOdd?"+isOdd.operation(oddOrEven)); 
	        
	       int pNum= 13; 
	       
	       Operation isPrime = n-> {
	            
	            if (n <= 1)
	                return false;
	      
	            for (int i = 2; i < n; i++)
	                if (n % i == 0)
	                    return false;
	      
	            return true;
	        };
	        System.out.println(pNum+" is Prime?"+isPrime.operation(pNum)); 
	        
	        Operation isPalindrome = n -> {
	            int num = 0, rem, temp;
	            temp = n;
	            
	            while(temp != 0){
	            	rem = temp % 10;
	                  num = num*10 + rem;
	                  temp = temp/10;
	            }
	            
	            if (num == n)
	                 return true;
	            else
	                return false;
	            
	        };
	        
	        int pal =121;
	        System.out.println(pal+" isPalindrome?"+isPalindrome.operation(pal));
	    }



	}
	
