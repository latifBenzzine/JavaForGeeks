package com.latifbenzzine.challenges;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.StringTokenizer;

public class PowersOfTwo {
	
	
	 public static void main(String[] args) {
	        FastScanner scanner = new FastScanner(System.in);
	        int n = scanner.nextInt();
	        BigDecimal[] a = new BigDecimal[n];
	        for (int i = 0; i < n; i++) {
	            a[i] = scanner.nextBigDecimal();
	        }
	       
	        for (int i = 0; i < n; i++) {
	        	if(isPowerOfTwo(a[i])){
	        		System.out.println(1);
	        	}else{
	        		System.out.println(0);
	        	}
	            
	        }
	    }
	 
	 
	    static class FastScanner {
	        BufferedReader br;
	        StringTokenizer st;

	        FastScanner(InputStream stream) {
	            try {
	                br = new BufferedReader(new InputStreamReader(stream));
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	        }

	        String next() {
	            while (st == null || !st.hasMoreTokens()) {
	                try {
	                    st = new StringTokenizer(br.readLine());
	                } catch (IOException e) {
	                    e.printStackTrace();
	                }
	            }
	            return st.nextToken();
	        }

	        int nextInt() {
	            return Integer.parseInt(next());
	        }
	        
	        BigDecimal nextBigDecimal() {
	            return new BigDecimal(next());
	        }
	    }
	

	private static boolean isPowerOfTwo(BigDecimal n) {
		if(n.compareTo(BigDecimal.ZERO) < 0){
			return false;
		}while(n.compareTo(BigDecimal.ONE)  > 0){
			if(!n.remainder(new BigDecimal(2)).equals(BigDecimal.ZERO)){
				return false;
			}
			n = n.divide(new BigDecimal(2)) ;
		}
		return true;
	}

}
