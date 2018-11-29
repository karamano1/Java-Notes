package com.cybetek.package1;

import com.cybertek.package2.*;
//import com.cybertek.package2.Class2; just put the specific classes but its not efficiency
//import com.cybertek.package2.Class3;

public class Class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		com.cybertek.package2.Class2 cl = new com.cybertek.package2.Class2();
		com.cybertek.package2.Class3 cl1 = new com.cybertek.package2.Class3(); //this is the long way
		Class2 cl3 = new Class2();
	}

}
