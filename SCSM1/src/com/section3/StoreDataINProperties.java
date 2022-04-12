package com.section3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class StoreDataINProperties {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos=new FileOutputStream("C:\\Users\\Tanay My Prince\\Documents\\SCSM1\\Stroredata.properties");
		Properties pobj=new Properties();
		pobj.setProperty("phno", "988776554");
		pobj.store(fos,null);
	}

}
