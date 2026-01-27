package com.ExcelReadScript;

import java.io.IOException;
import org.testng.annotations.Test;


import com.seleniumDay5.ExcelRead;

public class Access_ExcelRead {
ExcelRead obj = new ExcelRead();
@Test

public void ReadDataFromExcel() throws IOException {
	String res=obj.ReadCellData(0, 1);
	System.out.println(res);
}
}
