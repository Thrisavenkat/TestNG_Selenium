package com.ListMethods.Scripts;
import java.util.List;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.testng.annotations.Test;

import com.ListMethods.Libtest.listMethods;

import junit.framework.Assert;

public class ListMethodsScript {
	listMethods obj = new listMethods();
	boolean exp=true;
	Object expArr[]= {1,2,3,4,5,6};
  @Test
  public  void f() {
	  List <String> test1 = Arrays.asList("Pune","Coimbatore","Chennai","Salem");
	 boolean res= obj.ArrayListTest(test1);
	 System.out.println(res);
	 Assert.assertEquals(res, exp);
  }
  @Test
  public void function2() {
	  List<Integer> arr1= Arrays.asList(12,13,14,15,16);
	  Object act[]=obj.ConvertListToArray(arr1);
	  
	  Assert.assertEquals(act,expArr);
  }

  
}