package com.webshop.utilities;

import java.util.random.RandomGenerator;

public class RandomFunction {

	public  String randomString(String txtType ) {

    	 String ALPHA_NUMERIC;
         RandomGenerator RANDOM = RandomGenerator.getDefault();
    	
    	if(txtType.equalsIgnoreCase("fname")|| txtType.equalsIgnoreCase("lname"))	
    	{
    		 ALPHA_NUMERIC = "abcdefghijklmnopqrstuvwxyz";
    		
    	}else if(txtType.equalsIgnoreCase("email"))
    	{
    		 ALPHA_NUMERIC = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    	}else 
    	{
   		 ALPHA_NUMERIC = "1234567890";
    	}
        int length = 10;
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int randomIndex = RANDOM.nextInt(ALPHA_NUMERIC.length());
            sb.append(ALPHA_NUMERIC.charAt(randomIndex));
        }
        return sb.toString();
    }   
}
