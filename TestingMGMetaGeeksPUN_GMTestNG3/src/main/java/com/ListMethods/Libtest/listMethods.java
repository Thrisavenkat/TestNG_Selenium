package com.ListMethods.Libtest;
import java.util.List;
import java.util.ArrayList;
public class listMethods {
	
	public boolean ArrayListTest(List <String> l1){
		boolean l3= l1.contains("Pune");
		return l3;
	
	}		
	public Object[] ConvertListToArray(List<Integer> ListTestData) {
		Object arr[] = ListTestData.toArray();
		return arr;
	}
}

