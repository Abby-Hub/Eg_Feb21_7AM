package com.sample;

public abstract class Caluclator {
		public int add(int x, int y) {
			return x+y;
		}
		
		public int sub(int x, int y) {
			return x-y;
		}
		                         // 100    20
		public abstract int mul(int x, int y);
		
		public abstract int div(int x, int y);
		

}
