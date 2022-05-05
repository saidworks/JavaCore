package com.perscholas.javacore.kba;

import java.util.StringJoiner;
//
//
//public class Main {
//
//	  public static void main(String args[]) {
//	    System.out.println(new Tiger().says());
//	  }
//
//	}
//
//public class Main {
//
//	public static void main(String[] args) {
//
//		StringJoiner sj1 = new StringJoiner(":", "{", "}");
//
//		StringJoiner sj2 = new StringJoiner(",", "[", "]");
//
//		sj1.add("Name").add("Tony");
//
//		sj2.add("LastName").add("Strak");
//
//		System.out.println(sj1.merge(sj2).toString());
//
//	}
//}


//public class Main {
//
//    public static void main(String[] args) {
//        StringBuffer sb = new StringBuffer("135");
//
//        sb.replace(0, 5, "6789").insert(0, "12345");
//
//        System.out.println(sb.reverse().delete(0, 5));
//
//    }
//
//}

public class Main {

	  public static void main(String args[]) {
//	    System.out.println(new Tiger().says());
		  @FunctionalInterface
		  interface MyFunctionalInterface {
		      public Integer apply(int n, int e);

		      default Integer apply() {
		          return 0;
		      }
		  }
		  MyFunctionalInterface d = (int a,int b) -> a+b;
		  						System.out.println(d.apply(2,3));
		 
	  }
	 
	}