package com.example;

public class cal_3 {
	
	        public native double sin();
	        public native double cos();
	        public native double tan();
	        public native double log ();
	        public native double ln();
	        public native double exp();
	        public native double power(double base, double exponent);
	        
	        static {
	            System.loadLibrary("cal");
	        }
	        
	        public static void main(String[] args)
	        {
	        	cal_3 c=new cal_3();
	        	c.sin();
	        	c.cos();
	        	c.tan();
	        	c.log();
	        	c.ln();
	        	c.exp();
	        	c.power(0, 0);
	        	
	        }

}


